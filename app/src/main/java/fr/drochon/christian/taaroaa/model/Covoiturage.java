package fr.drochon.christian.taaroaa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Covoiturage implements Serializable {

    /*
    LES NOMS DES VARIABLES DOIVENT CORRESPONDRENT AU NOM DES CHAMPS DE LA BDD AVEC LA LETTRE "m" EN DEBUT
     */
    private String id;
    private String mNomConducteur;
    private String mPrenomConducteur;
    private String mNbPlacesDispo;
    private String mNbPlacesReservees;
    private Date mHoraireAller;
    private Date mHoraireRetour;
    private String mTypeVehicule;
    private String mLieuDepartAller;
    private String mLieuDepartRetour;
    //private Reservation mReservation;
    private List<String> mListPassagers;

    public Covoiturage() {
    }

    public Covoiturage(String id) {
        this.id = id;
    }


    /**
     * Constructeur utilisé lorsqu'aucun passager n'est inscrit à un covoiturage
     * @param id
     * @param nomCoducteur
     * @param prenomCoducteur
     * @param nbPlacesDispo
     * @param typeVehicule
     * @param horaireAller
     * @param horaireRetour
     */
    public Covoiturage(String id, String nomCoducteur, String prenomCoducteur, String nbPlacesDispo, String typeVehicule, Date horaireAller, Date horaireRetour, String lieuDeparttAller, String lieuDepartRetour) {
        this.id = id;
        mNomConducteur = nomCoducteur;
        mPrenomConducteur = prenomCoducteur;
        mNbPlacesDispo = nbPlacesDispo;
        mHoraireAller = horaireAller;
        mHoraireRetour = horaireRetour;
        mTypeVehicule = typeVehicule;
        mLieuDepartAller = lieuDeparttAller;
        mLieuDepartRetour = lieuDepartRetour;
    }


    //
    public Covoiturage(String id, String nomConducteur, String prenomConducteur, String nbPlacesDispo, String typeVehicule, Date horaireAller, Date horaireRetour,
                         String lieuDeparttAller, String lieuDepartRetour, List<String> passagers) {
        this.id = id;
        mNomConducteur = nomConducteur;
        mPrenomConducteur = prenomConducteur;
        mNbPlacesDispo = nbPlacesDispo;
        mHoraireAller = horaireAller;
        mHoraireRetour = horaireRetour;
        mTypeVehicule = typeVehicule;
        mLieuDepartAller = lieuDeparttAller;
        mLieuDepartRetour = lieuDepartRetour;
        mListPassagers = passagers;
    }

    public Covoiturage(String id, String nomCoducteur, String prenomCoducteur, String nbPlacesDispo, String nbPlacesReservees, String typeVehicule, Date horaireAller, Date horaireRetour,
                       String lieuDeparttAller, String lieuDepartRetour, List<String> passagers) {
        this.id = id;
        mNomConducteur = nomCoducteur;
        mPrenomConducteur = prenomCoducteur;
        mNbPlacesDispo = nbPlacesDispo;
        mNbPlacesReservees = nbPlacesReservees;
        mHoraireAller = horaireAller;
        mHoraireRetour = horaireRetour;
        mTypeVehicule = typeVehicule;
        mLieuDepartAller = lieuDeparttAller;
        mLieuDepartRetour = lieuDepartRetour;
        mListPassagers = passagers;
    }

/*    public Covoiturage(String id, String nomCoducteur, String prenomCoducteur, String nbPlacesDispo, String typeVehicule, Date horaireAller, Date horaireRetour, List<User> passagers, Reservation reservation) {
        this.id = id;
        mNomConducteur = nomCoducteur;
        mPrenomConducteur = prenomCoducteur;
        mNbPlacesDispo = nbPlacesDispo;
        mHoraireAller = horaireAller;
        mHoraireRetour = horaireRetour;
        mTypeVehicule = typeVehicule;
        mListPassagers = passagers;
        mReservation = reservation;
    }*/

/*
    public Covoiturage(String id, String nomConducteur, String prenomConducteur, String nbPlacesDispo, String typeVehicule, String horaireAller, String horaireRetour, List<User> passagers) {
        this.id = id;
        mNomConducteur = nomConducteur;
        mPrenomConducteur = prenomConducteur;
        mNbPlacesDispo = nbPlacesDispo;
        mHoraireAllerStr = horaireAller;
        mHoraireRetourStr = horaireRetour;
        mTypeVehicule = typeVehicule;
        mListPassagers = passagers;
    }
*/


    //GETTERS AND SETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomConducteur() {
        return mNomConducteur;
    }

    public void setNomConducteur(String nomConducteur) {
        mNomConducteur = nomConducteur;
    }

    public String getPrenomConducteur() {
        return mPrenomConducteur;
    }

    public void setPrenomConducteur(String prenomConducteur) {
        mPrenomConducteur = prenomConducteur;
    }

    public String getNbPlacesDispo() {
        return mNbPlacesDispo;
    }

    public void setNbPlacesDispo(String nbPlacesDispo) {
        mNbPlacesDispo = nbPlacesDispo;
    }

    public String getNbPlacesReservees() {
        return mNbPlacesReservees;
    }

    public void setNbPlacesReservees(String nbPlacesReservees) {
        mNbPlacesReservees = nbPlacesReservees;
    }

    public Date getHoraireAller() {
        return mHoraireAller;
    }

    public void setHoraireAller(Date horaireAller) {
        mHoraireAller = horaireAller;
    }

    public Date getHoraireRetour() {
        return mHoraireRetour;
    }

    public void setHoraireRetour(Date horaireRetour) {
        mHoraireRetour = horaireRetour;
    }

    public String getTypeVehicule() {
        return mTypeVehicule;
    }

    public void setTypeVehicule(String typeVehicule) {
        mTypeVehicule = typeVehicule;
    }

    public String getLieuDepartAller() {
        return mLieuDepartAller;
    }

    public void setLieuDepartAller(String lieuDepartAller) {
        mLieuDepartAller = lieuDepartAller;
    }

    public String getLieuDepartRetour() {
        return mLieuDepartRetour;
    }

    public void setLieuDepartRetour(String lieuDepartRetour) {
        mLieuDepartRetour = lieuDepartRetour;
    }

    /*
    public Reservation getReservation() {
        return mReservation;
    }

    public void setReservation(Reservation reservation) {
        mReservation = reservation;
    }*/

    public List<String> getListPassagers() {
        return mListPassagers;
    }

    public void setListPassagers(List<String> listPassagers) {
        this.mListPassagers = listPassagers;
    }
}
