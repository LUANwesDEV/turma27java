package PetAnimal;

public class Cachorro extends Animal {
	private String pular;

	public Cachorro(String nome, String emitirSom, boolean correr, int idade, String pular) {
		super(nome, emitirSom, correr, idade);
		this.pular = pular;
	}

	public String getPular() {
		return pular;
	}

	public void setPular(String pular) {
		this.pular = pular;
	}
	
	
}
