package it.unibo.oop.lab05.ex1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	//Costruzione di un TreeSet contenente stringhe
    	final Set<String> coll = new TreeSet<>();
    	
    	//Popolazione della collezione con le stringhe dalla 1 alla 20
    	coll.addAll(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"));
    	
    	//Stampa del contenuto della collezione
    	System.out.println(coll);
    	
    	
    	int i; //Variabile contenitore
    	
    	//Dichiarazione di un iteratore per lo scorrimento della collezione
    	Iterator<String> it = coll.iterator();
    	while (it.hasNext()) {
    		i = Integer.parseInt(it.next());
    		if(i % 3 != 0) { //Verifica se il numero è divisibile per 3
    			it.remove();
    		}
    	}
    	
    	//Stampa del contenuto della collezione utilizando un foreach
    	for(final String s: coll) {
    		System.out.println(s);
    	}
    	
    	Boolean test = true; //Variabile booleana test
    	
    	for(final String s: coll) {
    		if(Integer.parseInt(s) % 2 != 0) { //Verifica se la collezione contiene solo
    			test = false;                  //numeri pari o meno
    		}
    	}
    	
    	//Stampa dell'esito in base al valore della variabile test
    	if(test) {
    		System.out.println("La collezione contiene solo numeri pari.");
    	}
    	else {
    		System.out.println("La collezione non contiene solo numeri pari.");
    	}
    	
    }
}
