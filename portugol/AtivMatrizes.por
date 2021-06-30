programa
{
	
	funcao inicio()
	{
			cadeia predioJess[3][3]  //linhas e colunas
			inteiro linha, coluna

			predioJess[0][0] = "caio lima"
			predioJess[0][1] = "Vic"
			predioJess[0][2] = "AUGUSTO"
			predioJess[1][0] = "tai"
			predioJess[1][1] = "valmir"
			predioJess[1][2] = "natalia"
			predioJess[2][0] = "joão"
			predioJess[2][1] = "fabio"
			predioJess[2][2] = "janaina"

			para(inteiro x=0; x<3; x++){
				para (inteiro y=0; y<3; y++){
					escreva(predioJess[x][y],"\n")
				}
				
			}


			escreva("Digite a linha: ")
			leia(linha)
			escreva("Digite a coluna: ")
			leia(coluna)
			escreva("O apartamento "+ linha, " - " ,coluna, " é " ,predioJess[linha][coluna])

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {predioJess, 6, 10, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */