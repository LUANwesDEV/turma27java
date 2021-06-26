programa
{
	
	funcao inicio()
	{
		inteiro xNumero1Ate10,tabuada, resposta       // o X vai ser de 1 ate 10 // o TAB vai ser o numero da tabuada que o usuario vai colocar
		                         // O RES vai ser a resposta de X pelo TAB
		
		escreva(" Entre com o valor da tabuada: ")
		leia (tabuada)

		para(xNumero1Ate10=1;xNumero1Ate10<=10;xNumero1Ate10++)        // O para vai entrar no inicio,fim e a condição para rodar o laço de repetição!
		{
			resposta =xNumero1Ate10 * tabuada  
			escreva("\n", xNumero1Ate10," X ", tabuada, " = ", resposta)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */