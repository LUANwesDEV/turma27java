package introducao;

import java.util.Scanner;

public class LacoRepeticaoEX5DoWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero, soma = 0;

		do {
			System.out.println("Digite um numero do teclado: ");
			numero = ler.nextInt();
			soma = soma + numero;

		} while (numero != 0);
		System.out.println("A soma dos numero é: " + soma);
	}
}
