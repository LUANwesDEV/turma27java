programa
{
	
	funcao inicio()
	{
		real mediaSalarioPopulacao=0
		real salario=0
		real totalSalario=0
		real maiorSalario=0
		real menorSalario=0
		inteiro mediaNumeroFilhos=0
		inteiro numeroFilhos
		inteiro totalFilhos=0
		inteiro contador=0
		inteiro habitantes=0
		real percentual=0

		 para (contador=0; contador <20 ; contador++)
		 {
		 	escreva("----------------------------------------------------")
		 	escreva("\nColoque aqui seu salaraio: ")
		 	leia(salario)
		 	escreva("Quantos filhos tem? ")
		 	leia(numeroFilhos)

		 	totalSalario = totalSalario + salario
			totalFilhos = numeroFilhos + totalFilhos
			habitantes++

		 	se (salario > maiorSalario){
		 		maiorSalario = salario		
		 	}
		 	se (salario <=100){
		 		//menorSalario = menorSalario++
		 		menorSalario++
		 	}
		 	

		 }

		 	mediaSalarioPopulacao = totalSalario/habitantes
		    	mediaNumeroFilhos =  totalFilhos/habitantes
		    	percentual = (menorSalario * 100)/habitantes
		    

		    escreva("----------------------------------------------------")		   
		    escreva("\nMédia do salário da população: ", mediaSalarioPopulacao+"\n")
		    escreva("Média do número de filhos: ", mediaNumeroFilhos+"\n")
		    escreva("Maior salário: ", maiorSalario+"\n")
		    escreva("Percentual: ", percentual+"\n")
		    
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */