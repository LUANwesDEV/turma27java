package introducao;

import java.util.Scanner;

public class DadosAmigos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); // instaciou um scanner
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa();
		
		
		System.out.println("Digite o nome ");
		amigo1.nome = ler.next();
		System.out.println("Digite o sexo M/F/O: ");
		amigo1.sexo = ler.next().charAt(0);
		System.out.println("Digite o ano Nascimento: ");
		amigo1.anoNascimento = ler.nextInt();
		
		//System.out.println("idade :"+(2021-amigo1.anoNascimento));

		System.out.println("amigo 2");
		System.out.println("Digite o nome: ");
		amigo2.nome = ler.next();	
		amigo2.anoNascimento = 2000;
	//	idadeTeste = amigo2.calcularIdade(2030);
		
		//System.out.println("Meus Amigos são %s e %s ",amigo1.nome.toUpperCase(), amigo2.nome);
		
		
		
		
		
	}
}
