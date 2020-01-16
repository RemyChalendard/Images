package tp01;
import java.util.Scanner;
public class bissextile {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
    int annee;
        do {
            System.out.print("Entrez une année entre 1900 et 2100: ");
            annee = reader.nextInt();
        } while (annee < 1900 || (annee > 2100));
        if ((annee % 400 == 0) || (annee % 100 != 0) && (annee % 4 == 0)) {
            System.out.println("L'annee est bissextile");
        }
        else {
            System.out.println("l'annee est pas bissextile");   
}
}
}

