package tp02;
import java.util.Scanner;
public class algomatrice {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
System.out.print("Taille de la matrce : ");
final int n = reader.nextInt();

int [][] matrice1 = new int [n][n];
int [][] matrice2 = new int [n][n];
for (int i = 0; i < n ; i++){
    for (int j = 0 ; j < n ; j++) {
        System.out.printf("Entrez matrice2 (%d)(%d) : ", i, j);
        matrice2[i][j] = reader.nextInt();
    }
}
int [][] matrice3 = new int[n][n];
for (int i = 0; i < n ; i++){
for (int j = 0; j < n; j++) {
    matrice3[i][j] = matrice1[i][j] + matrice2 [i][j];
}
}   
    for (int i = 0; i < n; i++){
        System.out.println();
        for (int j = 0; j < n; j++){
            System.out.print(matrice3[i][j]+"\t");
        }
    }
}
    }