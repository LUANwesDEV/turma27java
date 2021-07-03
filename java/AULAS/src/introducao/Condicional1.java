package introducao;

import java.util.*;

public class Condicional1 {

	public static void main(String[] args)
	{
	     Scanner ler = new Scanner(System.in);
	     int idade;
	     String nome;
	     
	     System.out.printf("Digite sua idade: ");
	     idade = ler.nextInt();
	     ler.nextLine();
	     System.out.printf("Digite seu nome: ");
	     nome = ler.nextLine();
	     System.out.println("\nSeu nome: "+nome);
	     System.out.println("Sua idade: "+idade);
	     
	     if(idade >=18) 
	     {
	    	 System.out.println("você é maior de idade: ");
	     }
	     else if(idade>=1 && idade <18 ) 
	     {
	    	 System.out.println("\nvocê é menor de idade ");
	     }
	     else {
	    	 System.out.println("Inseriu uma idade invalida.");
	     }
	}
}
