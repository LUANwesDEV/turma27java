package introducao;

import java.util.Scanner;

public class ProgramacaoSequencialEx1 {
    	 
		public static void main(String[] args) 
		{
			Scanner ler = new Scanner(System.in);
			int anos, meses, dias; //soma;
			System.out.println("Qual é a sua idade em anos?");
    		anos = ler.nextInt();
    		System.out.println("Qual é a sua idade em meses?");
    		meses = ler.nextInt();
    		System.out.println("Qual é a sua idade em dias?");
    		dias = ler.nextInt();
    		
    		anos = anos*365;
    		meses = meses*30;
    		dias = dias + anos + meses;
    		
    		System.out.println(" A sua idade expressa em dias é: " + dias);
    		
    		
    	}
}
