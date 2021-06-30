programa
{
	
	funcao inicio()
	{
	     inteiro nomeAluno[4]
		inteiro notaAluno[4]
		 

		    	para( inteiro repeticao=0; repeticao <4; repeticao++)
		     {
			escreva("Digite nome do aluno: ")
			leia(nomeAluno[repeticao])
			
			escreva("Digite a nota do aluno: ")
			leia(notaAluno[repeticao])
			//escreva("Ola! " + nomeAluno[repeticao] + " sua nota é " + notaAluno[repeticao] + "\n\n")
	          }
			 para(inteiro repeticao=0; repeticao <4; repeticao++)
			     {
	
				se(notaAluno[repeticao]<=5)
				{
					escreva("Oi ! " + nomeAluno[repeticao] + " sua nota é " + notaAluno[repeticao] + " Ainda não, estude mais \n\n")
				}senao{
					escreva("Oi ! " + nomeAluno[repeticao] + " sua nota é " + notaAluno[repeticao] + " Aprovado, continue o bom trabalho\n\n")
			  }
		  }
	 }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nomeAluno, 6, 14, 9}-{notaAluno, 7, 10, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */