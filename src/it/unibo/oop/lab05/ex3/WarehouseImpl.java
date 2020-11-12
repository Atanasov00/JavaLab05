package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;

public class WarehouseImpl implements Warehouse {

	
	private Set<Product> set = new LinkedHashSet<>();
	
	
	@Override
	public void addProduct(Product p) {
		set.add(p);
	}

	@Override
	public Set<String> allNames() {
		Set<String> setStrings = new LinkedHashSet<>();
		for(Product p: set) {
			setStrings.add(p.getName());
		}
		return setStrings;
	}

	@Override
	public Set<Product> allProducts() {
		return set;
	}

	@Override
	public boolean containsProduct(Product p) {
		return set.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		for(Product p: set) {
			if(p.getName() == name) {
				return p.getQuantity();
			}
		}
		return -1;
	}

}
