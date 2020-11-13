package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	
	private final String name;
	private double quantity;
	
	//Metodo costruttore
	public ProductImpl(final String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	
	//Metodo getter del nome
	public String getName() {
		return this.name;
	}

	//Metodo getter della quantità
	public double getQuantity() {
		return this.quantity;
	}


	//Metodo toString di un prodotto
	public String toString() {
		return "ProductImpl [name=" + name + ", quantity=" + quantity + "]";
	}

}
