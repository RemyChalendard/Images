
package tp02;

import java.util.Scanner;

public class tableaumoyenne {
public static void main(String[] args) {
    
Scanner reader = new Scanner (System.in);

  final int l=5, c=2;
    int somme = 0;
    double moyenne;
    int[][] tab = new int[l] [c]; {
    for ( int i=0; i<l;i++) {
        for (int j=0; j<c;j++){
            System.out.println("Saisir Nombres ");
            tab[i] [j]= reader.nextInt();
            somme= somme + tab[i] [j]; } 
} moyenne =(double) somme/(l*c);

    System.out.println("la moyenne des nombres saisis vaut  : " + moyenne); }
}
}
