package fr.umontpellier.iut.exo2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DepartementTest {

    Departement info = new Departement("Informatique", "Montpellier");

    @Test

    public void test_calcul_moyenne_departement_retourne_zero_Quand_Pas_De_Note(){

        double moyenne = info.getMoyennePromo();
        assertEquals(0.0, moyenne, 0.0);
    }

}