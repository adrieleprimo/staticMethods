package application;

import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double bought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", Calculator.value(dollar, bought));
		
		sc.close();

	}

}
