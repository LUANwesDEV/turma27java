programa
{
	
	funcao inicio()
	{
		inteiro numero, soma=0
		real total=0
	
		escreva("Digite um numero: ")
		leia(numero)

		enquanto(numero>0){
			soma=soma+numero
			total++
			escreva("Digite um numero: ")
			leia(numero)
			
		}
		limpa()
		escreva("\ntotal de numeros: "+total)
		escreva("\nSoma de todos os  numeros: "+soma)
		escreva("\nMedia total de todos os numero"+(soma/total))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */