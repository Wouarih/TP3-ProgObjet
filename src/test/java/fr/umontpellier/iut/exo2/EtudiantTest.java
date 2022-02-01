package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class EtudiantTest {

    @Disabled
    @Test
    public void test_classe_Etudiant_existe() {
        try {
            Class.forName("fr.umontpellier.iut.exo2.Etudiant");
        } catch (ClassNotFoundException e) {
            fail("pas de classe nommée Etudiant dans le paquetage");
        }
    }
}
