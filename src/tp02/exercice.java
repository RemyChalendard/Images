 package tp02;
import java.util.Scanner;

public class exercice {
 
 public static void main(String[] args) {

Scanner reader = new Scanner (System.in);
int n = 10;
int tmp;
int [] tab ;
tab = new int [n];

//Lecture du tableau
for (int i = 0 ; i<n ; i++) {
System.out.print("Saisir une valeur :");
tab [i] = reader.nextInt();
}


for (int i = 0; i<n/2; i++) {
    tmp = tab [i];
    tab [i] = tab[n-i-1];
    tab[n-i-1] = tmp;
}
for (int i = 0; i<n ; i++) {
System.out.print(tab[i] + " ");
 }
     {
    }
}
}    
