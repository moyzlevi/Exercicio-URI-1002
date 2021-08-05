package exURI1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		Circulo c = new Circulo(raio);
		
		System.out.printf("A=%.4f",c.getArea());
	}

}
