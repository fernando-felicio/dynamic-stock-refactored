package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Price: ");
		double price = scanner.nextDouble();
		
		
		scanner.nextLine();
		
		Product product = new Product(name, price);
		
		System.out.println(product.name + "," + product.price + "," + product.quantity);
		
		System.out.println("Product Data: " + product);
		
		String userOption;
		
		do {
			System.out.println("Type [A] to ADD to stock or [R] to REMOVE to stock");
			userOption = scanner.nextLine().toLowerCase();
			
			if (userOption.equals("a")) {
				System.out.println("Enter the number of products to be added in stock: ");
				int quantity = scanner.nextInt();
				scanner.nextLine();
				product.addProducts(quantity);
				System.out.println("Product Data: " + product);
			}else if (userOption.equals("r")) {
				System.out.println("Enter the number of products to be removed from stock: ");
				int remove = scanner.nextInt();
				scanner.nextLine();
				product.removeProducts(remove);
				System.out.println("Product Data: " + product);
			}else {
				System.out.println("Invalid option. Please type [A] to ADD or [R] to REMOVE.");
			}
			
		} while (product.quantity > 0 || (userOption.equals("a") || userOption.equals("r")));
		
			
		
		scanner.close();

	}

}
