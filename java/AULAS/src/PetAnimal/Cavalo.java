package PetAnimal;

public class Cavalo extends Animal{
	private String cavalgar;

	public Cavalo(String nome, String emitirSom, boolean correr, int idade, String cavalgar) {
		super(nome, emitirSom, correr, idade);
		this.cavalgar = cavalgar;
	}

	public String getCavalgar() {
		return cavalgar;
	}

	public void setCavalgar(String cavalgar) {
		this.cavalgar = cavalgar;
	}
	

	
	
}
