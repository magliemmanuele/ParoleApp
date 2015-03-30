/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroleappset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
 
/**
 *
 * @author Manu
 */

public class Parole {
 
    
    private Set<String> set;
    private int totaleParole;
 
    public Parole() {
        this.set = new HashSet();
    }
 
    public int size() {
        return set.size();
    }
 
    public boolean isEmpty() {
        return set.isEmpty();
    }
 
    public boolean contains(String o) {
        return set.contains(o);
    }
 
    public boolean add(String e) {
        return set.add(e);
    }
 
    public boolean remove(String o) {
        return set.remove(o);
    }
 
    public void clear() {
        set.clear();
    }
 
    @Override
    public String toString() {
        return set.toString();
    }
 
    public int getTotaleParole() {
        return totaleParole;
    }
 
    public int getTotaleDuplicati() {
        return totaleParole - this.size();
    }
 
    public int getParoleUniche() {
        return totaleParole - this.getTotaleDuplicati();
    }
 
  
    public void leggiRomanzo(String filename) {
 
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String s;
            String[] book;
            while ((s = br.readLine()) != null) {
                book = s.toLowerCase().replace(".", " ").replace(",", " ").replace("'", " ").replace("!", " ").replace("?", " ").replace(";", " ").replace("-", " ").replace("_", " ").replace("\"", " ").replace(":", " ").replace("(", " ").replace(")", " ").replace("[", " ").replace("]", " ").replace("  ", " ").split(" ");
                for (String word : book) {
                    set.add(word);
                    totaleParole++;
                }
            }
 
        } catch (FileNotFoundException ex) {
            System.out.println("File non trovato");
        } catch (IOException ex) {
            System.out.println("Errore lettura File");
        }
    }
}

