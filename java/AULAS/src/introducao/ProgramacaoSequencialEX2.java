package introducao;

import java.util.Scanner;

public class ProgramacaoSequencialEX2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade,anos,meses,dias;
		System.out.println("Qual é a sua idade em dias: ");
		idade = ler.nextInt();
		
		anos = idade/365;
		idade = idade%365;
		meses = idade/30;
		dias = idade%30;
		
		System.out.println("\nA sua idade expressa em anos é: " +anos+" Anos, " +meses+" Meses, "+dias+" Dias.");

	}

}
