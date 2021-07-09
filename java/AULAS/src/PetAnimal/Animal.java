package PetAnimal;

public class Animal {
	//atribuição
	private String nome;
	private String emitirSom;
	private String correr;
	private int idade;
	
	//construtor 
	public Animal(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Animal(String emitirSom,String correr) {
		this.emitirSom = emitirSom;
		this.correr = correr;
	}
	//encapsulamento get e set
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
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
