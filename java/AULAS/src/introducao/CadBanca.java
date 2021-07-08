package introducao;

import java.util.Scanner;

public class CadBanca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa cliente1 = new Pessoa();
		
		System.out.println("Digite seu nome; ");
		cliente1.nome = ler.next();
		System.out.println("Digite o ano de nascimento");
		cliente1.anoNascimento = ler.nextInt();
		
		if(cliente1.calcularIdade(2021)>=18) {
			System.out.println("Pode comprar .");
		}else {
			System.out.println("proibido comprar!");
		}
		
	}

}
