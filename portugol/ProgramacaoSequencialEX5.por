programa
{
	
	funcao inicio()
	{
		real n1,n2,n3,media
		real mediaPonderada

		escreva("Digite sua nota aqui: ")
		leia(n1)
		escreva("Digite sua nota aqui: ")
		leia(n2)
		escreva("Digite sua nota aqui: ")
		leia(n3)

		media = (n1/2) + (n2/3) + (n3/5)
		mediaPonderada = (n1*2+n2*3+n3*5)/10
		escreva("Sua media ponderada é : "+ mediaPonderada+"\n")
		escreva("A sua media final é: "+media+"\n")
		

		se(media>=6){
			escreva("Parabens, você foi aprovado! \n")
			
		}senao se(media<=4){
			escreva("Infelizmente você não foi aprovado, tente novamente.  \n")
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