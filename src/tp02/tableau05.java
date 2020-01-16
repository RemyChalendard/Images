package tp02;
import java.util.Scanner;
public class tableau05 {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
  
 final int e=5, c=2;
 int somme = 0;
 double moyenne;
 int[][] tab = new int[e] [c]; { 
    
 for ( int i=0; i<1 ;i++) {
        for (int j=0; j<c;j++){
    
    System.out.println ("Saisir un nombre : ");
    tab [e] [c] = reader.nextInt();
    somme = somme + tab [e] [c] ;}
moyenne = (double) somme /(e*c);

    System.out.println("le plus grand des nombres saisis vaut  : " ); }
    }
}
}