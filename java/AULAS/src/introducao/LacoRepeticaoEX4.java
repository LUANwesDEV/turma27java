package introducao;

import java.util.Scanner;

public class LacoRepeticaoEX4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade=0;
		char sexo;
		char opcao;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0;
		int outrosCalmos=0, pessoasNervosasMais40anos=0, pessoasCalmasMenos18anos=0;
		char op='S';
		final int LIMITE = 150;
		int contador =1;
		String nome;
		
		while(op=='S' && contador <= LIMITE) {
			System.out.println("PARTICIPANTE "+contador);
			System.out.println("Digite a idade : ");
			idade = ler.nextInt();
			System.out.println("DIGITE");
			System.out.println("\n1-feminino\n2-masculino\n3-outros \nDigite uma opção : ");
			sexo = ler.next().charAt(0);
			System.out.println("SELECIONE ");
			System.out.println("1 - pessoa calma\n2 - pessoa nervosa\n3 - pessoa agressiva \nDigite uma opção: ");
			opcao = ler.next().charAt(0);
			
			if(opcao=='1') {
				pessoasCalmas++;
			}
			if(sexo =='1' && opcao==2) {
				mulheresNervosas++;
			}
			if(sexo=='2'&& opcao=='3') {
				homensAgressivos++;
			}
			if(sexo=='3' && opcao=='1') {
				outrosCalmos++;
			}
			if(idade>40 && opcao=='2')
				pessoasNervosasMais40anos++;
			
			if(idade<18 && opcao=='1') {
				pessoasCalmasMenos18anos++;
			}
			
			
			System.out.println("CONTINUA:  S/N");
			op = ler.next().toUpperCase().charAt(0);
			contador++;
		}
		System.out.println("Pessoas calmas :"+pessoasCalmas);
		System.out.println("Mulheres nervosas : "+mulheresNervosas);
		System.out.println("Homens agressivos : "+homensAgressivos);
		System.out.println("outrosCalmos : "+outrosCalmos);
		System.out.println("Pepessoas calmas menos 18 anos :"+pessoasCalmasMenos18anos);
		System.out.println("Pessoas Nervosas Mais 40 anos :"+pessoasNervosasMais40anos);
	}

}
