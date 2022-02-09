package fr.umontpellier.iut.exo2;

public class Note {

    private Matiere mat;
    private double note;

    public Note(Matiere mat, double note) {
        this.mat = mat;
        this.note = note;
    }

    public Matiere getMat() {
        return mat;
    }

    public double getNote(Matiere m) {
        return note;
    }
}
