package tp;

import java.util.ArrayList;

public class Etudiant {  
    private String nom;
    private float moyenne;
    private String avis;
    private ArrayList<Notation> notation;

    public Etudiant(String nom) {
        this.nom = nom;
        this.notation = new ArrayList<>();
        this.moyenne = 0;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public float getMoyenne() { return moyenne; }
    public void setMoyenne(float moyenne) { this.moyenne = moyenne; }
    public String getAvis() { return avis; }
    public void setAvis(String avis) { this.avis = avis; }
    public ArrayList<Notation> getNotation() { return notation; }
    public void setNotation(ArrayList<Notation> notation) { this.notation = notation; }

    public void calculerMoyenne() {
        var sumCoef = 0;
        var sumCoefxNote = 0;

        for (Notation n : notation) { 
            sumCoef += n.getCoef();
            sumCoefxNote += n.getCoef() * n.getNote();
        }

        if (sumCoef != 0)
            moyenne = (float) sumCoefxNote / sumCoef;
        else
            moyenne = 0;
    }

    public void genererAvis() {
        if (moyenne >= 10)
            this.avis = "Passe de classe";
        else
            this.avis = "Redouble";
    }
    
    public void ajouterNotation(Notation n) { this.notation.add(n); }

    public void afficher() {
        System.out.println("Nom : " + nom);
        for (Notation n : notation) { n.afficher(); }
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Avis : " + avis);
    }
}

