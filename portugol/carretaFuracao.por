programa
{
	
	funcao inicio()
	{
		cadeia carretaFuracao[5] = {"HOMEM-ARANHA","PANTEIRA NEGRA","MULHER-MARAVILHA","HUKLYN","DOLLYNHO"}
		inteiro numPersonagem

		 para (inteiro x=0; x<5; x++){
            escreva(x+" - "+carretaFuracao[x]+"\n")
		}

		 escreva("Digite um numero de personagem de 0 a 4: ")
		 leia(numPersonagem)

		 escreva(carretaFuracao[numPersonagem])
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */