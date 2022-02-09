package fr.umontpellier.iut.exo2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantTest {

    Etudiant e1 = new Etudiant("Oiry", "Clément", LocalDate.of(1997,8,14), "oiry@gmail.com","2 rue du Marchand");
    Matiere mat = new Matiere("Cours", 10.75);
    @Disabled
    @Test
    public void test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note(){
        String moyenne = e1.noter(mat, 0.0);
        assertEquals(0.0, 0.0, 0.0);
    }

    @Disabled
    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note(){

    }
    @Disabled
    @Test
    public void test_calcul_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient(){

    }

    @Disabled
    @Test
    public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients(){

    }



}