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
public class departement {
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    int dept;
        System.out.println("entre votre numero de departement 13 ou 84 ou 83");
        dept = reader.nextInt();
    
    switch (dept) {
        case 13 :
          System.out.println("Bouche du rhone"); 
          break;
        case 83 :
           System.out.println("Var");
         break;
        case 84 :
           System.out.println("Vaucluse");
         break;
        default:
           System.out.println("Reponse non valide");
        }
    }
        }
    
    

        

   