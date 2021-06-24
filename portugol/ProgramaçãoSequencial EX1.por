programa
{
	
	funcao inicio()
	{
		inteiro anos,meses,dias
		escreva("Qual é a sua idade em anos?  \n")
		leia (anos)
		escreva("Qual é a sua idade em meses?  \n")
		leia (meses)
		escreva("Qual é a sua idade em dias?  \n")
		leia (dias)
		
		anos = anos*365
		meses = meses*30
		dias = dias + anos + meses

		escreva(" Sua idade expressa em dias é: ", dias)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */