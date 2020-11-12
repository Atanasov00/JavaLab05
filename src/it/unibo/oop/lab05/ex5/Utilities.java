package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Random;

/**
 *
 */
public final class Utilities {

    private Utilities() {
    }

    /**
     * Copies all the element of the first collection in the second collection.
     * 
     * @param source
     *            the source collection
     * @param target
     *            the target collection
     * @param <X>
     *            Collection type
     */
    public static <X> void copyAll(final Collection<X> source, final Collection<? super X> target) {
    	target.addAll(source);
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     * 
     */
	public static <X> X getRandomElement(final Collection<X> coll) {
        X [] array = (X[]) new Object[coll.size()]; 
        array = coll.toArray(array);
        Random rd = new Random();
    	return array[rd.nextInt(coll.size())];
    }

    /**
     * @param one
     *            first collection
     * @param two
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> one, final Collection<Y> two) {
    	X[] array1 = (X[]) new Object[one.size()];
    	Y[] array2 = (Y[]) new Object[two.size()];
    	
    	array1 = one.toArray(array1);
    	array2 = two.toArray(array2);
    	
    	Random rd = new Random();
    	
    	Pair<X, Y> pair = new Pair<>(array1[rd.nextInt(one.size())], array2[rd.nextInt(two.size())]);
    	return pair;
    }
}
