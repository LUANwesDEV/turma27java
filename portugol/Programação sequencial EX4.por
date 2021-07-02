programa
{
	inclua biblioteca Matematica
	
	funcao inicio() 
	{
	     real  a,b,c,d,r,s
		escreva("Digite o valor de A: ")
		leia (a)
		escreva("Digite o valor de B: ")
		leia (b)
		escreva("Digite o valor de C: ")
		leia (c)
		r = Matematica.potencia ((a+b),2) // o A+B é multiplicado * por ele mesmo, por conta do 2
		s = Matematica.potencia ((b+c),2) // o B+C é feito a mesma coisa

		d = (r + s) /2 // o numero final dividido por 2
		escreva("O valor D é: " + d) 
		 		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */