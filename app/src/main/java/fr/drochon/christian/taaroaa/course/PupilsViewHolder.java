package fr.drochon.christian.taaroaa.course;

import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import fr.drochon.christian.taaroaa.R;
import fr.drochon.christian.taaroaa.model.Course;

/**
 * Classe responsable de chaque ligne de la recyclerview, et donc, chaque cours
 */
public class PupilsViewHolder extends RecyclerView.ViewHolder {

    // DATA
    private List<Course> mCourseList;
    // CELLULES
    @BindView(R.id.list_cell_course_subject)
    TextView mCourseSubject;
    @BindView(R.id.liste_cell_course_type)
    TextView mCourseType;

    /**
     * Contructeur qui prend en param la vue affichée.
     * Je recupere les 2 textview du layout list_cell.
     * responsable du clic sur les cellules.
     *
     * @param itemView : cellule d'une liste comprenant le titre et la description d'un cours
     */
    public PupilsViewHolder(final View itemView) {
        super(itemView);
        // liaison des elements du layout recyclerview et list_cell avec les variables declarées ici
        ButterKnife.bind(this, itemView);

        mCourseList = new ArrayList<>();

        // Affichage du contenu de la cellule sous forle de notification
        // j'utilise l'ecouteur sur la cellule et recupere les informations pour les affihcer dans une notification
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String s;
                for (int i = 0; i < mCourseList.size(); i++) {
                    new AlertDialog.Builder(itemView.getContext())
                            .setTitle(mCourseList.get(i).getTypeCours())
                            .setMessage(Html.fromHtml("<b>Sujet : </b>" + mCourseList.get(i).getSujetDuCours() + "<br/><b>Moniteur : </b>" + mCourseList.get(i).getNomDuMoniteur()
                                    + "\n<br/><b>Niveau </b>" + mCourseList.get(i).getNiveauDuCours()
                                    + "<br/>" + stDateToString(mCourseList.get(i).getHoraireDuCours()) + "<br/>" + stTimeToString(mCourseList.get(i).getHoraireDuCours())))
                            .show();
                    break;
                }
            }
        });
    }

    /**
     * Methode appellée via l'adapter. Cette methode mettra à jour les differentes view du viewholder en fonction de l'utilisateur connecté
     *
     * @param course
     */
    public void updateWithCourse(final Course course) {
        // ajout des Cours dans une liste afin de les retrouver pour l'affichage de chaque cours particulier sous forme de notification
        mCourseList.add(course);
        mCourseType.setText(course.getTypeCours());
        mCourseSubject.setText( Html.fromHtml("<b>Sujet : </b>" + course.getSujetDuCours()));
    }


    // --------------------
    // HEURE & DATE PARSING
    // --------------------

    /**
     * Methode permettant de formatter une date en string avec locale en francais
     * @param horaireDuCours
     * @return
     */
    public String  stDateToString(Date horaireDuCours){

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd MMM yyyy", Locale.FRANCE);
        String dateDuCours = dateFormat.format(horaireDuCours);
        return dateDuCours;

    }

    /**
     * Methode permettant de formatter une date en format heure
     * @param horaireDuCours
     * @return
     */
    public String stTimeToString(Date horaireDuCours){

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
        String heureDuCours = dateFormat1.format(horaireDuCours);
        return heureDuCours;
    }
}
