package it.unibo.oop.lab05.ex2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	
    	//Creazione di un TreeSet, con il suo comparatore
    	final Set<String> set = new TreeSet<>(new StringComparator());
    	//Variabile random per la generazione di numeri casuali
    	Random rd = new Random();
    	
    	//Aggiunta dei numeri casuali
    	for(int i = 0; i < 100; i++) {
    		set.add(String.valueOf(rd.nextInt(200)));
    	}
    	
    	//Stampa della collezione
    	System.out.println(set);
    	
    }
}
