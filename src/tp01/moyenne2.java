package tp01;
import java.util.Scanner;
public class moyenne2 {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
int i, n, somme=0;
double moyenne;
for (i=1;i<=4;i++){
System.out.print("Entrer un nombre entier : ");
n=reader.nextInt();
somme=somme+n;
}
moyenne=somme/4.0;
System.out.println("La moyenne vaut : " + moyenne);
}
}