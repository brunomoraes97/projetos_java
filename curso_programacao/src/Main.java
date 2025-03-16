import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		sc.close();
		
		double areaX = x.getArea();
		double areaY = y.getArea();
		
		System.out.printf("A área do triângulo X é: %.2f%n", areaX);
		System.out.printf("A área do triângulo Y é: %.2f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A área do triângulo X é maior que a do triângulo Y.");
		} else if (areaY > areaX) {
			System.out.println("A área do triângulo Y é maior que a do triângulo X.");
		} else {
			System.out.println("As áreas são iguais.");
		}
		
		
	}

}
