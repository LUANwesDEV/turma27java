package TesteAULA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		
		Collection<String> nomes = new ArrayList();
		
		nomes.add("Lucas");  // ADD ? um tipo definido da colletions pra poder adicionar elementos dentro do ArrayList
		nomes.add("Leandro");
		nomes.add("Luan");
		nomes.add("Leticia");
		nomes.add("Lilian");
		for(String nome : nomes) {			// esse la?o vai listas os nome um por um de cima para baixo sem repeti??o!!
			System.out.println("Listas de nomes: "+nome);
		}
		
	/*	Collection<String> nomes2 = Arrays.asList("Wesley","Jo?o");
		nomes.addAll(nomes2); // addALL serve para adicionar mais elementos dentro da lista!!!
		System.out.println("Listas de nomes: "+nomes);
	/*	System.out.println("Contem o nome Luan?"+nomes.contains("Luan"));//contains serve para fazer uma verifica??o de dados na lista!!
		System.out.println("Lista atual: "+nomes);
	/*	System.out.println("Listas de nomes: "+nomes);
		nomes.clear();	//clear serve para limpar os campos dentro list.
		System.out.println("Listas de nomes: "+nomes);
	/*	System.out.println("Listas de nomes: "+nomes);
		nomes.remove("Lilian"); // o REMOVE tira uma posi??o da lista!!!
		System.out.println("Listas de nomes: "+nomes);
		
	/*	if(nomes.isEmpty()) {   // o isEmpty serve para verificar se tem algum campo vazio dentro do meu LIST
			System.out.println("Lista vazia...");
		}else {
			System.out.println("Listas de nomes: "+nomes);
		}
		
		System.out.println("Listas de nomes: "+nomes);*/
	}

}
