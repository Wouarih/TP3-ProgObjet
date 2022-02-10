package fr.umontpellier.iut.exo3;
import java.time.LocalDate;
import java.util.ArrayList;

public class EtudiantJavaBeans {

    private String lastname;
    private String name;
    private LocalDate birthday;
    private String email;
    private String adress;
    //ajout de la liste de note
    private ArrayList<Note> listenote;

    public EtudiantJavaBeans() {
        }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setListenote(ArrayList<Note> listenote) {
        this.listenote = listenote;
    }

    @Override
    public String toString() {
        return "EtudiantJavaBeans{" +
                "lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", listenote=" + listenote +
                '}';
    }

    //L'avantage du modèle du JavaBeans, c'est que l'on peut choisir tous les attributs que l'on veut instancier
}

