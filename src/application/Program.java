package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scanner.nextLine();
		
		System.out.print("Price: ");
		product.price = scanner.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = scanner.nextInt();
		
		System.out.println(product.name + "," + product.price + "," + product.quantity);
		
		System.out.println(product);
		
		scanner.close();

	}

}
