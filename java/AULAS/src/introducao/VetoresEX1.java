package introducao;

import java.util.Scanner;

public class VetoresEX1 {
		public static void main(String[]args) {
			
			Scanner ler = new Scanner(System.in);
			
			int []array = {0,1,2,3,4};
			
			int [] numero = new int [5]; // vetor/No java-array
			int pontuacao,numeroMaior=0;
			
			
			for(pontuacao=0;pontuacao<5;pontuacao++) {
				System.out.println("Informe a pontuação da atividade: ");
				numero [pontuacao] = ler.nextInt(); // vai ler o numero que o usuario vai digitar!
			}
			for(pontuacao=0;pontuacao<5;pontuacao++) {
				System.out.println("Pontuação informada: "+numero [pontuacao]+"\n");
				if( numeroMaior < numero [pontuacao]){
					numeroMaior = numero [pontuacao];
				}
			}
				System.out.println("O maior numero é:"+numeroMaior);
	}
}