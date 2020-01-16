package tp02;
import java.util.Scanner;
public class tableauinversé {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);

int i;
int [] tab1 , tab2 ;

final int n=10;

tab1 = new int [n];
tab2 = new int [n];

for (i = 0 ; i<= n-1 ; i++) {
    System.out.print("Entrer des valeurs : ");
    tab1[i]=reader.nextInt(); }

for (i = 0 ; i<= n-1 ; i++) {
    tab2[i]=tab1[n-i-1]; }

for (i = 0 ; i<= n-1 ; i++) {
    System.out.print(tab2[i] + "\t");}
}    
}


 