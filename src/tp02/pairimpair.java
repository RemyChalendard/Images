/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

import java.util.Scanner;

public class pairimpair {
public static void main(String[] args) {
Scanner reader = new Scanner (System.in);
final int n = 10;
int i;
boolean TousPairs = true;
int[] tab;
tab = new int [n];

for (i = 0; i < n; i++) {
System.out.print("Entrez une valeur : ");
tab[i] = reader.nextInt();
}
i = 0;
        while (i < n && TousPairs){
            if (tab[i] % 2 == 1) {
                TousPairs = false;
            }
            i++;
        }
        System.out.println("Tous les elements sont pairs " + TousPairs);
}  
}
