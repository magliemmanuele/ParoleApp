/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroleappset;

/**
 *
 * @author Manu
 */
public class ParoleAppSet {

   
    public static void main(String[] args) {

        Parole pr = new Parole();

        pr.leggiRomanzo("./data/siddharta.txt");

        System.out.println("ParoleApp versione Set\n Analisi testo: Siddharta  \n");
        System.out.println("Totale parole: " + pr.getTotaleParole());
         System.out.println("Totale parole Uniche: " + pr.getParoleUniche());
        System.out.println("Totale parole duplicate: " + pr.getTotaleDuplicati());

       

       

    }
    
}
