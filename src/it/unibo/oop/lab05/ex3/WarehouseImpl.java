package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;

public class WarehouseImpl implements Warehouse {

	//Creazione della LinkedHashSet in cui memorizzare i prodotti
	private Set<Product> set = new LinkedHashSet<>();
	
	//Metodo addProduct necessario per l'aggiunta di un nuovo elemento
	public void addProduct(Product p) {
		set.add(p);
	}

	//Metodo che restituisce una collezione di stringhe
	public Set<String> allNames() {
		Set<String> setStrings = new LinkedHashSet<>();
		for(Product p: set) {
			setStrings.add(p.getName());
		}
		return setStrings;
	}

	//Metodo che restituisce una collezione di elementi
	public Set<Product> allProducts() {
		return set;
	}

	/*Metodo che restituisce true se l'elemento specificato
	 * come parametro al metodo è presente all'interno della
	 * collezione, false altrimenti*/
	public boolean containsProduct(Product p) {
		return set.contains(p);
	}

	/*Metodo che restituisce la quantità del prodotto
	 * passato come parametro al metodo*/
	public double getQuantity(String name) {
		for(Product p: set) {
			if(p.getName() == name) {
				return p.getQuantity();
			}
		}
		return -1;
	}

}
