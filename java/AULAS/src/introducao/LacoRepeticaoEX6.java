package introducao;

import java.util.Scanner;

public class LacoRepeticaoEX6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			
		int num,cont=0,soma=0;
		double media;
		
		do {
			System.out.println("Entre com um numero: ");
			num = ler.nextInt();
			
			if(num % 3==0) {
				soma = soma + num;
				cont++;
				media = soma /cont;
			}
			
		}while(num !=0);
	//	System.out.println("A media dos numeros multiplos de 3 é  "+media);
	}
}
