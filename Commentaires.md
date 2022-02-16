* les résultats des tests sont plus bas
* les liens entre les classes dans le diagramme de classes sont incorrectes, les attributs doivent être privés, -- à revoir
* il y a une utilisation excessive du `this` dans ce projet -- à éviter
* pas besoin d'un `else` juste après un `return` (c'est une info redondante)
* **ne jamais** comparer les réels sans un `delta` strictement positif (petit, mais non-zéro) dans les tests unitaires : https://www.javaer101.com/fr/article/1450714.html
* TP bien fait

fr.umontpellier.iut.exo1.EtudiantTest
  ✓ test_classe_Etudiant_existe
fr.umontpellier.iut.exo1.GestionEtudiantsTest
fr.umontpellier.iut.exo2.EtudiantTest
  ✓ test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note
  ✓ test_calcul_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient
  ✓ test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients
  ✓ test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note
  ✓ test_calcul_moyenne_retourne_0_quand_tous_les_coeffs_valent_0
fr.umontpellier.iut.exo2.GestionEtudiantsTest
fr.umontpellier.iut.exo3.GestionEtudiantsTest

6 / 6 tests réussis
