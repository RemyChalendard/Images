package tp02;
import java.util.Scanner;
public class index {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
    final int n=3;
    int i, max;
    int [] tab = new int[n];

for (i = 0; i< n ; i++) {   
System.out.print("Saisir  nombre : ");
tab[i] = reader.nextInt();
}
max = 0;
for (i = 1 ; i < n ; i++) {
if (tab[i] > tab [max]) {
    max = 1;
      }
    }
System.out.print("L'index le plus grand est :   " + max);  
    }
}
