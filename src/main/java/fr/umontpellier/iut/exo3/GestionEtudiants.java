package fr.umontpellier.iut.exo3;

import java.time.LocalDate;

public class GestionEtudiants {
    public static void main(String[] args) {

        Departement info = new Departement("Informatique", "Montpellier");

        EtudiantTelescopique e1 = new EtudiantTelescopique("Oiry", "Clément");

        System.out.println(e1);

        EtudiantTelescopique e2 = new EtudiantTelescopique("Oiry", "Clement", LocalDate.now() );
        System.out.println(e2);

        EtudiantTelescopique e3 = new EtudiantTelescopique("Oiry", "Clément", "oiry@gmail.com");
        System.out.println(e3);

        EtudiantJavaBeans e4 = new EtudiantJavaBeans();
        e4.setLastname("Oiry");
        e4.setName("Clément");
        e4.setAdress("2 rue Marchand");


        System.out.println(e4);

        EtudiantJavaBeans e5 = new EtudiantJavaBeans();
        e5.setLastname("Oiry");
        e5.setName("Clément");
        e5.setAdress("2 rue Marchand");
        e5.setEmail("email");


        Etudiant mike = new Etudiant.EtudiantBuilder()
                .lastname("Tyson")
                .name("Mike")
                .birthday(LocalDate.of(1960,8,4))
                .adress("rue de la bagarre")
                .build();

        System.out.println(mike);
        }

    }

