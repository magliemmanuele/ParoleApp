/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroleappmap;

/**
 *
 * @author Manu
 */
public class ParoleAppMap {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        Parole p = new Parole();
          System.out.println("Parole App versione Map");
           System.out.println("\nTotale Parole:");
        p.leggiRomanzo("./data/Siddharta.txt");

        System.out.println(p.toString());

      
    }
    
}
