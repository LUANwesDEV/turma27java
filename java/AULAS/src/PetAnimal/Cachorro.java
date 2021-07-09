package PetAnimal;

public class Cachorro extends Animal {
	private String pular;
	
	public Cachorro(String nome,int idade,String pular) {
		super (nome,idade);
		this.pular = pular;
	}
	public Cachorro(String correr,String emitirSom) {
		super(correr,emitirSom);
		this.pular = pular;
	}
	public String getPular() {
		return pular;
	}
	public void setPular(String pular) {
		this.pular = pular;
	}
	
}
