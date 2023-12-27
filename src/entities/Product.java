package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice (double price ) {
		this.price = price;
	}
	
	public void setQuantity (int quantity) {
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		 if(quantity <= this.quantity) {
		        this.quantity -= quantity;
		        System.out.println("Removing " + quantity + " products from " + this.quantity + " in stock.");
		        System.out.println("After removal, " + this.quantity + " products remaining in stock.");
		    } else {
		        System.out.println("Not enough products in stock to remove.");
		    }
	}
	
	public String toString() {
		return name 
				+ ", $ " + String.format("%.2f", price) 
				+ ", " + quantity + " units"
				+ ", Total: $ " + String.format("%.2f", totalValueInStock());
	}

}
