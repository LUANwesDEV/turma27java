package PetAnimal;

public class Animal {
	//atribuição
	private String nome;
	private String emitirSom;
	private boolean correr;
	private int idade;
	
	//construtor 
	
	public Animal(String nome, String emitirSom, boolean correr, int idade) {
		super();
		this.nome = nome;
		this.emitirSom = emitirSom;
		this.correr = correr;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public boolean getCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//encapsulamento get e set
	
	
}
