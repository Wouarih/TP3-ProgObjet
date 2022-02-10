package fr.umontpellier.iut.exo2;

import java.time.LocalDate;

public class GestionEtudiants {
    public static void main(String[] args) {

        Departement info = new Departement("Informatique", "Montpellier");

        Etudiant etudiant1 = new Etudiant("Oiry", "Clement", LocalDate.of(1997, 8, 14), "clement.oiry79@gmail.com","2 rue Marchand");
        Etudiant etudiant2 = new Etudiant("lulu", "lulu", LocalDate.of(1997, 8, 14), "lulu","lulu");
        Etudiant etudiant3 = new Etudiant("fifi", "fifi", LocalDate.now(),"fifi", "fifi");
        Etudiant etudiant4 = new Etudiant("riri", "riri", LocalDate.now(),"riri", "riri");

        Matiere maths = new Matiere("maths", 3.0);
        Matiere prog = new Matiere("Programmation", 4.0);

        etudiant1.noter(maths, 8.5);
        etudiant1.noter(prog,6.5);
        System.out.println(etudiant1.calculerMoyenne());

        info.inscrire(etudiant1);
        info.inscrire(etudiant2);
        info.inscrire(etudiant3);
        info.inscrire(etudiant4);


    }
}
