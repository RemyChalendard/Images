package tp03;
import java.util.Scanner;
public class table {

public static void main(String[] args) {
Scanner reader = new Scanner (System.in);

System.out.println("Saisir un nombre entier : ") ;
int x = reader.nextInt();
afficheTM(x);
}
public static void afficheTM( int n) {
for (int i = 1 ; i <= 10 ; i++) {
System.out.printf("%d * %d - %d\n", i, n, n*i );
}
}
}