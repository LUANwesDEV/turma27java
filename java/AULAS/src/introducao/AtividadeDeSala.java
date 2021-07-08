package introducao;

import java.util.Scanner;

public class AtividadeDeSala {
		public static void main(String[]args) {
			 Scanner ler = new Scanner(System.in);
			 
			 int idade;
			 String sexo;
			 String nome, outros,anoNascimento;
			 
			 
			 System.out.println("Digite seu nome: ");
			 nome = ler.next();
			 System.out.println("Qual seu sexo [F/M/O]: ");
			 sexo = ler.next();
			 System.out.println("Qual sua idade [F/M/O]: ");
			 idade = ler.nextInt();
			 
			 if(sexo == "M" || sexo == "m") {
				  sexo = "Sr";
			 }else if (sexo == "F" || sexo == "f") {
				 sexo = "Sra";
			 }else {
				 sexo = "Sre";
			 }
				  
			 
			 
			 System.out.println("Sua idade é");
		}
}
