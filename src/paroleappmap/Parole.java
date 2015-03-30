/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroleappmap;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 
/**
 *
 * @author Admin
 */
public class Parole {
 
    
    private Map hm;
    private int totaleParole;
 
    public Parole() {
        this.hm = new HashMap();
    }
 
    public int size() {
        return hm.size();
    }
 
    public boolean isEmpty() {
        return hm.isEmpty();
    }
 
    public boolean containsKey(Object o) {
        return hm.containsKey(o);
    }
 
    public boolean containsValue(Object o) {
        return hm.containsValue(o);
    }
 
    public Integer get(Object o) {
        return (Integer) hm.get(o);
    }
 
    public Integer put(String k, Integer v) {
        return (Integer) hm.put(k, v);
    }
 
    public Integer remove(Object o) {
        return (Integer) hm.remove(o);
    }
 
    public void clear() {
        hm.clear();
    }
 
    @Override
    public String toString() {
        return hm.toString();
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
 
    public String print(String parola) {
        if (hm.containsKey(parola)) {
            int conta = (int) hm.get(parola);
            return "La parola: " + parola + " è presente: " + conta + " volte";
        }
        return "La parola non è presente";
    }
 
  
    public void leggiRomanzo(String filename) {
 
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String s;
            String[] book;
            while ((s = br.readLine()) != null) {
                book = s.toLowerCase().replace(".", " ").replace(",", " ").replace("'", " ").replace("!", " ").replace("?", " ").replace(";", " ").replace("-", " ").replace("_", " ").replace("\"", " ").replace(":", " ").replace("(", " ").replace(")", " ").replace("[", " ").replace("]", " ").replace("  ", " ").split(" ");
                for (String parola : book) {
                    if (hm.containsKey(parola)) {
                        hm.put(parola, (int) hm.get(parola) + 1);
                    } else {
                        hm.put(parola, 1);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File non trovato");
        } catch (IOException ex) {
            System.out.println("Errore nella  lettura del File");
        }
    }
}