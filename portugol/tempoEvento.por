programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
            // IDE - AJUDA NO CODIGO
            //inico 
            		//variaveis
            		//entradas
            		//processamentos
            		//saidas
            //fim	

            // minuto = 1 minuto = 60 segundos
            //hora = 60 minutos = 3600 segundos
            

		inteiro tempoEevento
		inteiro horas, minutos, segundos

		// entrada
		escreva("Digite os segundos do evento [segundos]: ")
		leia(tempoEevento)
		// processamento
		horas = tempoEevento / 3600
		minutos = (tempoEevento % 3600) / 60
		segundos = (tempoEevento % 3600) % 60

		//saida
		escreva("horas : "+horas+ "\n")
		escreva("Minuto : "+minutos+"\n")
		escreva("segundos :"+segundos+"\n\n")

		escreva ("FIM ALGORITMO")
		
		







		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 784; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */