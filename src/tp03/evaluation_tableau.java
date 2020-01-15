
package tp03;
import java.util.Scanner;
public class evaluation_tableau {
public static void main(String[] args) {   
Scanner reader = new Scanner (System.in);

int amplitude = 2;
int valeur = 5;

int tab[] = new int [valeur];
int tab2[] = new int [amplitude];

System.out.print("Ecrire une valeurs :  ");
valeur = reader.nextInt();
System.out.print(valeur);

System.out.print("Entrez une amplitude : ");
amplitude = reader.nextInt();
System.out.print(amplitude);
for (int i = 0 ; i < amplitude ; i++) {
for ( int j = 0 ; j < valeur ; j++) {  

System.out.println();
 }
}
}
}

