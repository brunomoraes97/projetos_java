package produtos;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		// Initial product data

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product data:");
		System.out.printf("Name: ");
		String name = sc.next();
		System.out.printf("Price: ");
		double price = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		// Instantiate object
		
		Product product = new Product();
		product.name = name;
		product.price = price;
		product.quantity = quantity;
		
		// Print initial object values
		
		System.out.printf("Product data: %s, $%.2f, %d units%n", product.name, product.price, product.quantity);
		
		// Add quantity
		
		System.out.printf("Enter the number of products to be added in stock: ");
		int toBeAdded = sc.nextInt();
		product.addProducts(toBeAdded);
		
		System.out.printf("Updated data: %s, $%.2f, %d units%n", product.name, product.price, product.quantity);
		
		// Remove quantity
		
		System.out.printf("Enter the number of products to be removed from stock: ");
		int toBeRemoved = sc.nextInt();
		product.removeProducts(toBeRemoved);
		
		System.out.printf("Updated data: %s, $%.2f, %d units%n", product.name, product.price, product.quantity);
		
		// Close scanner
		
		sc.close();
		
	}

}
