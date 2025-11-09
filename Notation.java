package tp;

public class Notation {  
    private String matiere;
    private int coef;
    private float note;

    public Notation(String matiere, int coef, float note) {
        this.matiere = matiere;
        this.coef = coef;
        this.note = note;
    }

    public String getMatiere() { return matiere; }
    public int getCoef() { return coef; }
    public float getNote() { return note; }

    public void afficher() {
        System.out.println("Matière : " + matiere + " | Coef : " + coef + " | Note : " + note);
    }
}

