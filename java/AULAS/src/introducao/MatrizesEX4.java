package introducao;

import java.util.Scanner;

public class MatrizesEX4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int soma=0, linha = 0, coluna = 0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um numero: ");
				matriz[coluna][linha] = ler.nextInt();
				
				if (linha == coluna) {
					soma = soma + matriz[coluna][linha];
				}
			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println(matriz[coluna][linha]);

			}
		}
		System.out.println("A soma diagonal principal é: "+soma);
	}
}
