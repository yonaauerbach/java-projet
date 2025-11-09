package tp;

import java.util.Scanner;

public class TestEtudiant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indiquez le nom de l’étudiant : ");
        String nom = sc.nextLine();

        Etudiant etudiant = new Etudiant(nom);  
        etudiant.ajouterNotation(new Notation("Maths", 4, 12));
        etudiant.ajouterNotation(new Notation("Physique", 5, 8));
        etudiant.ajouterNotation(new Notation("Anglais", 1, 18));

        etudiant.calculerMoyenne();
        etudiant.genererAvis();
        etudiant.afficher();

        sc.close();
    }
}

