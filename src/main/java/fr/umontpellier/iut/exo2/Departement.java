package fr.umontpellier.iut.exo2;

import java.util.ArrayList;

public class Departement {

    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> tab;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.tab = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Departement{" +
                "tab=" + tab +
                '}';
    }

    public void inscrire(Etudiant e1) {
        tab.add(e1);
    }

    public void desincrire(Etudiant e1) {
        tab.remove(e1);
    }

    double getMoyennePromo() {

        double sommenoteE = 0;

        for (int i = 0; i < tab.size(); i++) {
            sommenoteE = sommenoteE + tab.get(i).calculerMoyenne();

        }
        if (tab.size() == 0) {
            return 0;
        } else {
            return sommenoteE / tab.size();
        }

    }
}
