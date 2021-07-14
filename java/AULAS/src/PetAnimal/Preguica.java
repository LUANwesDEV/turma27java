package PetAnimal;

public class Preguica extends Animal {
	private String sobeEmArvore;

	public Preguica(String nome, String emitirSom, boolean correr, int idade, String sobeEmArvore) {
		super(nome, emitirSom, correr, idade);
		this.sobeEmArvore = sobeEmArvore;
	}

	public String getSobeEmArvore() {
		return sobeEmArvore;
	}

	public void setSobeEmArvore(String sobeEmArvore) {
		this.sobeEmArvore = sobeEmArvore;
	}

	
	
	
}
