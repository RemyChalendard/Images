package tp01;
import java.util.Scanner;
public class sommes {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
int i, n, somme;
System.out.print("Entrez un nombre entier: ");
n = reader.nextInt();
somme=0;
for(i=2 ; i<=2*n ; i=i+2){ 
somme = somme + i;
}
System.out.println("la somme vaut : " + somme);
} 
}