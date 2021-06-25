programa
{
	
	funcao inicio()
	{
		 inteiro idade
		 escreva("Digite aqui sua idade: ")
		 leia (idade)
			se(idade >= 5 e idade <=7) {
				escreva("infantil A: ", idade+ " anos ")
			}
			senao se (idade>=8 e idade<=11) {
			     escreva("infantil B: ", idade+ " anos")
			}
			senao se(idade >=12 e idade <=17){
				escreva("juvenil A: ", idade+ " anos")
			
			}
			senao se(idade>=14 e idade <=17){
				escreva("juvenil B: ", idade+ " anos")
			
			}
	          senao se(idade>=18){
	       	  	escreva("adulto: ", idade+ " anos") 
	          }
	          senao
	               escreva("Não temos clasificação para essa idade no momento") 
	  }
}
	       
	       
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 664; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */