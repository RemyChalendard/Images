package tp01;
import java.util.Scanner;
public class produitnombresentiertantque {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
int n, i, produit;
System.out.print("donnez la valeur de n : ");
n = reader.nextInt();
produit = 1;
i = 1;
do { 
    produit = produit * i;
     i = i+1;
} while (i <= n);
System.out.println("le produit vaut : " + produit);
}
}

