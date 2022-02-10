package fr.umontpellier.iut.exo2;
import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {
    private String lastname;
    private String name;
    private LocalDate birthday;
    private String email;
    private String adress;
    //ajout de la liste de note
    private ArrayList<Note> listenote;

    public Etudiant(String lastname, String name, LocalDate birthday, String email, String adress) {
        this.lastname = lastname;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.adress = adress;
        this.listenote = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
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
