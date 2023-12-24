package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
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
