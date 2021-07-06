package introducao;

import java.util.Scanner;

public class LacoRepeticaoEX2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i,num=0,contPar=0,contImpar=0;
		
	//	System.out.println("digite um numero: ");
	//	num = ler.nextInt();
		
		for(i=0; i<10;i++) {
			System.out.print("Digite um numero: ");
			num = ler.nextInt();
			
			if(num%2==1) {
			contImpar++;
			}
			else {
			contPar++;
			}	
				//System.out.print("numero: "+num+" impa: ");
		//	else {
			//	System.out.print("numero: "+num+" par: ");
		//	}
		}
		System.out.println(i+" - numero digitados: "+contPar+ " pares e "+contImpar+" Impares.");
		//System.out.print();
	}

}
