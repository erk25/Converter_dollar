package application;

import java.util.Scanner;

import util.Converter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Converter converter = new Converter();
		System.out.println("What is the dollar price: ");
		converter.dollar = sc.nextDouble();
		
		System.out.println("How manny dollars will be bought? ");
		converter.price = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", converter.result());
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
