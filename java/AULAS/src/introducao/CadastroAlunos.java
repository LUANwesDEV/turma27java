package introducao;

import java.util.Scanner;

public class CadastroAlunos {
        public static void main(String[]args) {
        	Scanner ler = new Scanner(System.in);
        	Pessoa aluno1 = new Pessoa();
    		Pessoa aluno2 = new Pessoa();
    		Pessoa aluno3 = new Pessoa();
    		

    		System.out.println("Digite o nome ");
    		aluno1.nome = ler.next();
    		System.out.println("Digite o sexo M/F/O: ");
    		aluno2.sexo = ler.next().charAt(0);
    		System.out.println("Digite o ano Nascimento: ");
    		aluno3.anoNascimento = ler.nextInt();
    		
    		
    		if(aluno1.calcularIdade(2021)<=16) {
    			System.out.println("Você esta no fundamental .");
    		}else {
    			System.out.println("proibido comprar!");
    		}
        	
        }
}
