
package tp02;
import java.util.Scanner;
public class tableau01 {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
int n = 10;
int somme =0;

double moyenne;
int tab[] = new int [n];

for (int i=0; i<n; i++){
    System.out.print ("Entre une valeur : ");
    tab [i] = reader.nextInt();
    // saisie dans tab[i]
    somme= somme + tab[i];
}
moyenne= somme/n;
// afficher moyenne
System.out.println (" La moyenne vaut : " + moyenne);  
}

    }
    
       
