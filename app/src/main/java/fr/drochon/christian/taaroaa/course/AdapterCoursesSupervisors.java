package fr.drochon.christian.taaroaa.course;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

import fr.drochon.christian.taaroaa.R;
import fr.drochon.christian.taaroaa.model.Course;

/**
 * l'adapter s'occupe de l'ensemble du contenu alors que le viewholder s'occupe des specificités d'une cellule
 */
public class AdapterCoursesSupervisors extends FirestoreRecyclerAdapter<Course, SupervisorsViewHolder> {

    public static final int DROIT_N1 = 1;
    public static final int DROIT_MONITEUR = 2;

    public interface Listener {
        void onDataChanged();
    }
    //FOR COMMUNICATION
    private Listener callback;


    public AdapterCoursesSupervisors(FirestoreRecyclerOptions<Course> options, AdapterCoursesSupervisors.Listener callback) {
        super(options);
        this.callback = callback;
    }

    /**
     * Methode qui applique une donnee à une vue (on bind la donnée à la vue).
     * Cette methode sera appellée à chaque fois qu'une donnée devra etre affichée dans une cellule, que la cellule soit nouvellement créée ou recyclée
     * @param holder
     * @param position
     * @param model    the model object containing the data that should be used to populate the view.
     * @see #onBindViewHolder(RecyclerView.ViewHolder, int)
     */
    @Override
    protected void onBindViewHolder(@NonNull SupervisorsViewHolder holder, int position, @NonNull Course model) {
        holder.updateWithCourse(model);
    }

    /**
     * creation d'un viewholder - de la vue d'une cellule, declaré comme argument generique de l'adapter
     *
     * @param parent   : créé la vue
     * @param viewType : sert au cas ou il y aurait differents types de cellules
     * @return le vue d'une cellule
     */
    @Override
    public SupervisorsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SupervisorsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.supervisor_cell, parent, false));// creation de la viewholder avec en param la vue du layout
    }

    @Override
    public void onDataChanged() {
        super.onDataChanged();
        this.callback.onDataChanged();
    }

}
