 package tp02;
import java.util.Scanner;
public class tableau5par5 {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
int ligne, colonne, x;

System.out.print("Ordre carrée magique : ");
int n = reader.nextInt();
final int [][] cm = new int [n][n];

colonne = n / 2;
ligne = colonne + 1;
cm [ligne][colonne] = 1;

for (x = 2; x <= n * n; x++) {
    if ((x - 1) % n == 0)
        ligne = (ligne + 2) % n;
    else {
        ligne = (ligne + 1) % n;
        colonne = (colonne + 1) % n; }
    cm[ligne][colonne] = x; }
    
for (int i = 0; i < n; i++) {
    System.out.println();
    for (int j = 0; j < n; j++) {
        System.out.print(cm[i][j]+"\t");}
    
}
}
}
    





















          

      


     






