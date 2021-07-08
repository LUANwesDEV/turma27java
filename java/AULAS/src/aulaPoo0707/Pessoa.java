package aulaPoo0707;

public class Pessoa {
	private String primeiroNome;
	private String ultimoNome; // atributos
	private String nomesDoMeio;

	// parametros do construtor
	public Pessoa(String primeiro, String meio, String ultimo) {
		primeiroNome = primeiro;
		ultimoNome = ultimo;             // Construtor sempre sera/pegar o nome da classe que foi criado,
		nomesDoMeio = meio;              // seguido pela lista de parametros.
	}

	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
		return nomeCompleto;
	}
}
