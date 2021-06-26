programa
{ 
	
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro contador=10
														//
		enquanto(contador>0)   // contador MAIOR 0  // ten que ter uma CONDIÇÃO!! 	//
		{												// EXECUTAR QUANDO SE FOR VERDADEIRO
			limpa() 										//
			escreva("Contagem regressiva...",contador) 			//
			contador = contador - 1
			Util.aguarde(1000)
		}
		limpa()
		escreva("BOOOOOMMMMMMM.....")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */