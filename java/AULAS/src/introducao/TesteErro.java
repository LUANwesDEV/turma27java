package introducao;

import java.util.Scanner;

public class TesteErro {
		Scanner leia = new Scanner(System.in);
		int valor=0;
		String nome[]=new String[3];
		
		try {
			System.out.println("Digite a posi��o do vetor de 0 a 2 para cadastro do nome: ");
			valor = leia.nextInt();
			System.out.println("Digite o nome da pessoa: ");
			nome[valor] = leia.next();
		}
		catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Voc� colocou um tamanho errado ou posi��o incorreta da matriz");
		}
		
}
