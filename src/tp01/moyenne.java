/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class moyenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Algorithme MoyenneQuatre
        
        //Variables

        Scanner reader = new Scanner(System.in);
        int n1,n2,n3,n4;
        double moyenne;
        System.out.print("Entrez la valeur du n1");
        n1 = reader.nextInt();
        System.out.print("Entrez la valeur du n2");
        n2 = reader.nextInt();
        System.out.print("Entrez la valeur du n3");
        n3 = reader.nextInt();
        System.out.print("Entrez la valeur du n4");
        n4 = reader.nextInt();
        
        //Calcul de la moyenne
        
        moyenne = (n1 + n2 + n3 + n4)/4.0;
        
        //Affichage du resultat
        System.out.println("La moyenne vaut :" + moyenne);
        
                
       
    }
    
}
