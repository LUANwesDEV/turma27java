programa
{
	
	funcao inicio()
	{

		inteiro idade,anos,meses,dias 
		escreva(" Qual é a sua idade em dias? \n")
		leia (idade)
		anos = idade/365 
		idade = idade%365
		meses = idade/30 
		dias = idade%30
		escreva(" Esta é sua idade expressa em anos: " + anos + ", meses: " + meses + ", dias: " + dias)
		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 189; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */