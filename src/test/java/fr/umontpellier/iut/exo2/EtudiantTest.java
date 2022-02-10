package fr.umontpellier.iut.exo2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantTest {

    Etudiant e1 = new Etudiant("Oiry", "Clément", LocalDate.of(1997,8,14), "oiry@gmail.com","2 rue du Marchand");



    @Test
    public void test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note(){

        double moyenne = e1.calculerMoyenne();
        assertEquals(0.0, moyenne, 0.0);
    }


    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note(){

        double moyenne = e1.calculerMoyenne();
        assertEquals(0.0, moyenne, 0.0);

    }

    @Test
    public void test_calcul_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient(){

        double moyenne = e1.calculerMoyenne();
        assertEquals(0.0, moyenne, 0.0);

    }


    @Test
    public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients(){

        double moyenne = e1.calculerMoyenne();
        assertEquals(0.0, moyenne, 0.0);

    }



}