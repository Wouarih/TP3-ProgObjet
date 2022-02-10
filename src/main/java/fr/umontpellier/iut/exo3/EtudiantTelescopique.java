package fr.umontpellier.iut.exo3;

import java.time.LocalDate;
import java.util.ArrayList;

public class EtudiantTelescopique {

    private String lastname;
    private String name;
    private LocalDate birthday;
    private String email;
    private String adress;
    //ajout de la liste de note
    private ArrayList<Note> listenote;



    public EtudiantTelescopique(String lastname, String name) {
        this.lastname = lastname;
        this.name = name;
    }

    public EtudiantTelescopique(String lastname, String name, LocalDate birthday) {
        this(lastname,name);
        this.birthday = birthday;
    }

    public EtudiantTelescopique(String lastname, String name, String email) {
        this(lastname, name);
        this.email = email;
    }

    //Il n'est pas possible d'ajouter un constructeur supplémentaire avec uniquenement nom, prénom et adresse car on ne peut faire deux constructeurs avec le même nombre et type d'attribut.
    //Dans notre cas, le constructeur ne peut savoir si c'est le mail ou l'adresse qui est attendu
    /*public EtudiantTelescopique(String lastname, String name, String adress){
        this(lastname, name);
        this.adress;
    }*/


    public String toString() {
        return "EtudiantTelescopique{" +
                "lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", listenote=" + listenote +
                '}';
    }
}
