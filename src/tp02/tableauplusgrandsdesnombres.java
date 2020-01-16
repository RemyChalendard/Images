
package tp02;
import java.util.Scanner;
public class tableauplusgrandsdesnombres {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
    int n=10;
    int  k;
    int i = 0;
    int[] tab = new int[n];

    System.out.print("Saisir " +(i+1) +" nombre  ");
     tab[1]= reader.nextInt();
     k= tab[i];

    for (  i=1; i<tab.length;i++) {
        System.out.print("Saisir " +(i+1) +" nombre  ");
        tab[i]= reader.nextInt();
        if (tab[i]> k ){
        k=tab[i];
        }
    }
    System.out.println("le plus grand élément est  : " + k);
    }
}