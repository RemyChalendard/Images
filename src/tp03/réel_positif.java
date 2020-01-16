package tp03;
import java.util.Scanner;
public class réel_positif {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);

System.out.println("Saisir un nombre réel : ");
double r = reader.nextDouble();
System.out.println("La partie entier vaut : " + PartieEntiere(r));
}
public static int PartieEntiere(double x) {
    int resultat = 0 ;
   while (resultat < x) {
    resultat++;
}
    return resultat-1; 
}
}