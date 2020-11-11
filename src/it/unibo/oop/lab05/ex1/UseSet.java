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
    	
    	final Set<String> coll = new TreeSet<>();
    	coll.addAll(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"));
    	
    	System.out.println(coll);
    	
    	int i;
    	Iterator<String> it = coll.iterator();
    	while (it.hasNext()) {
    		i = Integer.parseInt(it.next());
    		if(i % 3 != 0) {
    			it.remove();
    		}
    	}
    	
    	for(final String s: coll) {
    		System.out.println(s);
    	}
    }
}
