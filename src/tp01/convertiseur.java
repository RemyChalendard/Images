/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

/**
 *
 * @author formation_gep
 */
public class convertiseur {

    private static int angle;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Variantes
        
       
       Double angle, resultat = null;
       
       //Constantes
       //final double PI = 3,14
       System.out.print("Entrez un angle : ");
       angle = reader.nextDouble();
        double Resultat = angle*180/Math.PI;
       System.out.println("La valeur de l'angle en radiant est : " + resultat);
    }

    private static class reader {

        private static Double nextDouble() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public reader() {
        }
    }
    
}
