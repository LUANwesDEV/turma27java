programa
{
	
	funcao inicio()
	{
		const inteiro linhaFinal = 3, finalColuna = 3 
		//cadeia valoresUsuario [3][3]
		inteiro matriz [linhaFinal] [finalColuna]
		inteiro linha =0, coluna=0
		inteiro somaValores = 0, totalDiagonal = 0, totalMatriz =0
		

			para(linha =0;linha < linhaFinal ;linha++)
			{
				para(coluna =0; coluna <linhaFinal ;coluna++)
				{
					escreva("Digite um valor da linha:  ",linha, " e coluna ", coluna, ":" )
		       	     leia (matriz [linhaFinal] [finalColuna])

		       	     limpa()

		       	     se(linhaFinal==finalColuna)
		       	     {
		       	     	  totalDiagonal = totalDiagonal + matriz [linhaFinal] [finalColuna]
		       	     }
		       	     	  totalMatriz = totalMatriz + matriz [linhaFinal] [finalColuna]
				}		
			 	
		       	 escreva("\nAsoma da diagonal peincipal é: ", totalDiagonal) 
		       	 escreva("\nAsoma os valores da mtriz é: ", totalMatriz) 
			
				
			}
			
	  }
	  
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */