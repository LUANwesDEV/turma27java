package introducao;

import java.util.Scanner;

public class LacoRpeticaoEX3 {

	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 * idade for =-99. (WHILE)
	 */

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int pessoasMenos21anos = 0, pessoasMais50anos = 0, idade = 0;

		while (idade != -99) {
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();

			if (idade>0 && idade < 21) {
				pessoasMenos21anos++;
			} else if (idade > 50) {
				pessoasMais50anos++;
			}
		}
		System.out.println("Total pessoas com Menos de 21 anos: " + pessoasMenos21anos);
		System.out.println("Total pessoas com Mais de 50 anos: " + pessoasMais50anos);
	}

}
