package application;

import java.util.Locale;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo parametro: ");
		int b = sc.nextInt();

		try {
			contar(a, b);

		} catch (ParametrosInvalidosException e) {
			System.out.println("erro de parametro: " + e.getMessage());

		}
		sc.close();
	}

	static void contar(int a, int b) {

		if (a >= b) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior do que o primeiro");
		}
		int n = b - a;
		for (int i = 1; i <= n; i++) {
			System.out.println("imprimindo o numero " + i);
		}
	}
}
