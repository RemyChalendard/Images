package tp02;
import java.util.Scanner;
public class sequentielle{

public static void main(String[] args) {

Scanner reader = new Scanner (System.in);
final int l=10;
int[] tab = new int[l];
int val;
int frequence = 0;
for ( int i=0; i<tab.length;i++) {
System.out.print("Saisir Valeur ");
tab[i] = reader.nextInt();
System.out.print("\n"); }
System.out.println("Saisir valeur recherchée ");
val = reader.nextInt();
for ( int i=0; i<tab.length;i++) {
if (tab[i] == val){
frequence++; }
         }
System.out.printf("La fréquence : %d de la valeur %d %n", frequence, val); } 
}