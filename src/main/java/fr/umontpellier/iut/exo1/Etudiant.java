package fr.umontpellier.iut.exo1;
import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {
    private String lastname;
    private String name;
    private LocalDate birthday;
    private String email;
    private String adress;

    public Etudiant(String lastname, String name, LocalDate birthday, String email, String adress) {
        this.lastname = lastname;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.adress = adress;
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
}
