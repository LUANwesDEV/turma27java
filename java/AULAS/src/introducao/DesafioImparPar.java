package introducao;

import java.util.Scanner;

public class DesafioImparPar {
			public static void main(String[]args) {
				Scanner ler = new Scanner(System.in);
				
				int num;
				
				System.out.println("Digite um numero inteiro");
				num = ler.nextInt();
				
				if(num < 0) {
					System.out.println("O numero: "+num+" ? negativo, digite numeros positivos.");
				}
				/*
				else if(num==0) {
					System.out.println("Numero: 0 ? neutro");
					
				}
				*/else if(num%2==0){
					System.out.println("O numero: "+num+" ? par. ");
				}else {
					System.out.println("O numero: "+num+ " ? impar");
				}
			
			}
}
