programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro n1,n2,n3,n4,quadrado1,quadrado2,quadrado3,quadrado4
		escreva("Digite o primeiro numero aqui: ")
		leia(n1)
		escreva("Digite o segundo numero aqui: ")
		leia(n2)
		escreva("Digite o terceiro numero aqui: ")
		leia(n3)
		escreva("Digite o quarto numero aqui: ")
		leia(n4)

		quadrado1 = n1*n1 
		quadrado2 = n2*n2
		quadrado3 = n3*n3
		quadrado4 = n4*n4
		se(quadrado3 >= 1000){
			   escreva("O valor resultante do quadrado do terceiro numero é: ", quadrado3) 
		}
		senao {
			escreva("\nO quadrado do numero ", n1 + " é: ", quadrado1 + "\n")
			escreva("O quadrado do numero ", n2 + " é: ", quadrado2 + "\n")
			escreva("O quadrado do numero ", n3 + " é: ", quadrado3 + "\n")
			escreva("O quadrado do numero ", n4 + " é: ", quadrado4 + "\n") 
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */