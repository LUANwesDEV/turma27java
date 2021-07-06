package introducao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int numero;
		int cont=1;
		int aux=1;
		System.out.println("Digite um numero positivo: ");
		numero = ler.nextInt();
		
		if(numero <=0) {
				System.out.println("Numero invalido!!!");
				
		}
		else if(numero==1) {
			System.out.println("1 = 1");
				
		}
		else {
			do {
				System.out.printf("%d + ",cont);
				cont++;
				aux = aux +cont;
			}while(cont<numero);
			System.out.print(cont);
			System.out.println(" = "+aux);
		}
		
	}

}
