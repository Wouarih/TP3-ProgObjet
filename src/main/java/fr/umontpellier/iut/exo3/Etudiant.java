package fr.umontpellier.iut.exo3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {
    private String lastname;
    private String name;
    private LocalDate birthday;
    private String email;
    private String adress;
    private ArrayList<Note> listenote;


    private Etudiant(EtudiantBuilder builder) {
        this.lastname = builder.lastname;
        this.name = builder.name;
        this.birthday = builder.birthday;
        this.email = builder.email;
        this.adress = builder.adress;
        this.listenote = builder.listenote;
    }

    public String getLastName(){
        return lastname;
    }

    public String getName(){
        return name;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public String getEmail(){
        return email;
    }

    public String getAdress(){
        return adress;
    }

    public ArrayList<Note> getList(){
        return listenote;
    }

    public String toString() {
        return "Etudiant{" +
                "lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public static class EtudiantBuilder {
        private String lastname;
        private String name;
        private LocalDate birthday;
        private String email;
        private String adress;
        private ArrayList<Note> listenote;

        public EtudiantBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public EtudiantBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EtudiantBuilder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public EtudiantBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EtudiantBuilder adress(String adress) {
            this.adress = adress;
            return this;
        }

        public EtudiantBuilder listenote(ArrayList<Note> listenote) {
            this.listenote = listenote;
            return this;
        }


        public Etudiant build() {
            Etudiant e1 = new Etudiant(this);
            return e1;
        }
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void noter(Matiere m, double d){
        Note n = new Note(m, d);
        listenote.add(n);
    }

    public double calculerMoyenne() {

        double sommenote = 0;
        double sommecoeff = 0;
        for (int i = 0; i < listenote.size(); i++) {
            sommenote = sommenote + listenote.get(i).getNote() * listenote.get(i).getMat().getCoefficient();
            sommecoeff = sommecoeff + listenote.get(i).getMat().getCoefficient();
        }
        if (sommecoeff == 0) {
            return 0;
        } else {
            return sommenote / sommecoeff;
        }
    }

}
