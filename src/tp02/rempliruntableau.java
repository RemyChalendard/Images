package tp02;
import java.util.Scanner;
public class rempliruntableau {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
  
int nl = 10, nc = 2;
int val, valdépart, pas;
int tab[][] = new int [nl][nc];
    
System.out.print("Remplir une valeur : ");
valdépart = reader.nextInt();
System.out.print ("ecrire le nombre de pas : ");
pas = reader.nextInt();

val = valdépart;
for ( int i=0 ; i < nl-1 ; i++) {
    for (int j=0 ; j < nc-1 ; j++) {
        tab [i][j] = val;
        val = val + pas;
System.out.println(" Resultat : " + val);       
 }
 {   
}
}
}
}
            
            


