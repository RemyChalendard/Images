package tp01;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation_gep
 */
public class ordonnes {
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    int nb1,nb2;
    
    System.out.print("Entrez le nombre 1 : ");
    nb1=reader.nextInt();
    System.out.print("Entrez le nombre 2 : ");
    nb2 = reader.nextInt();
    
    if (nb1 < nb2 ) {
        System.out.println("nb1 plus petit que nb2");
    }else if (nb2 < nb1) {
        System.out.println("nb1 plus grand que nb2");
    } else {
        System.out.println("nb1 et nb2 identique");
    } 
    
}
}
