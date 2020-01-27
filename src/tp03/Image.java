package tp03;
import java.util.Scanner;
public class Image {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);

int[][] matrice=new int[5][];
for (int i=0 ; i<matrice.length; i++)
    matrice[i]=new int[6];

System.out.println("Entrez une valeur : ");
int v = reader.nextInt();
}

public static int[][] MYSTERE(int matrice[][]){
int i, j;
Scanner reader = new Scanner (System.in);

System.out.println("Entrez une valeur : ");
int m = reader.nextInt();

    for (i= 0 ; i< 4 ; i++){
        for (j=0 ; j<5 ;j++){
        matrice[i][j] = 100 - matrice[i][j] ;
        }}
    return matrice ;
}

public static int Moyenne (int moyenne){
int i, matrice = 1596 ;
for (i=1;i<=4;i++){
moyenne = matrice /30 ;
System.out.println("La moyenne vaut : " + moyenne);
}
return moyenne ;
}
}


