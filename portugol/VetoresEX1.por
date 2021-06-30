programa
{
	
	funcao inicio()
	{
		inteiro numero [5]
		inteiro pontuacao,numeroMaior=0

		para(pontuacao=0; pontuacao<=4; pontuacao++)
		{
			escreva("Digite o valor da pontuação sobre a atividade: ")
			leia(numero[pontuacao])
			
		}
		limpa()
		para(pontuacao=0; pontuacao<=4; pontuacao++){
			escreva("Numero digitado: ", numero[pontuacao], "\n")  
			se(numero[pontuacao] > numeroMaior){
		         numeroMaior = numero[pontuacao]
			}
		}
		    escreva("\nO maior numero é: ",numeroMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */