programa
{
	
	funcao inicio()
	{
		real indice, grupo1,grupo2,grupo3

		escreva("Digite o indise de poluição : ")
		leia(indice)

		se(indice>=0.3 e indice<0.4){
			escreva("Grupo 1: Fora de atividade.")	
		}senao se(indice>=0.4 e indice<0.5){
			escreva("Grupo 1 e 2: Estão suspensos.")	
		}senao se(indice>=0.5){
			escreva("Todos suapensos.")
			
		}senao{
			escreva("indice de poluição aceitavel.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */