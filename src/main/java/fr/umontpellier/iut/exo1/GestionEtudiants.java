package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEtudiants {
    public static void main(String[] args) {

        //Instanciation d'une variable etudiant1 de type Etudiant
        Etudiant lolo = new Etudiant("Oiry", "Clement", LocalDate.of(1997, 8, 14), "clement.oiry79@gmail.com","2 rue Marchand");

        //Instanciation d'une variable toto
        Etudiant toto = new Etudiant("Oiry", "Clement", LocalDate.of(1997, 8, 14), "clement.oiry79@gmail.com","2 rue Marchand");

        //Verification du setLastName
        lolo.setLastName("Wouarih");
        System.out.println(lolo);

        //Comparaison des deux variables
        System.out.println(lolo.equals(toto));
        //La comparaison donne comme réponse "false" car l'adresse des variables sont différentes malgré les mêmes attributs

        //Le programme toto est surnom de lolo, il doit faire reference à lolo
        toto = lolo;

        //Test de la référence
        toto.setLastName("Waaariii");

        System.out.println(lolo);

        //Création d'un département monDepInfo

        Departement monDepInfo = new Departement("informatique", "Montpellier");

        //Création des etudiants fifi et riri
        Etudiant fifi = new Etudiant("fifi", "fifi", LocalDate.now(),"fifi", "fifi");
        Etudiant riri = new Etudiant("riri", "riri", LocalDate.now(),"riri", "riri");


        //Inscription des etudiants au département
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(riri);

        System.out.println(monDepInfo);

        //Déscription de toto

        monDepInfo.desincrire(toto);
        System.out.println(monDepInfo);

        //Supprime le premier élément de la liste,lolo, et non toto car les deux avaient la même référence

    }
}
