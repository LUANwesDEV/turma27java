package PetAnimal;

public class Preguica extends Animal {
	private String dormindo;
	
	public Preguica(String nome,int idade,String dormindo) {
		super(nome,idade);
		this.dormindo = dormindo;
	}

	public String getDormindo() {
		return dormindo;
	}

	public void setDormindo(String dormindo) {
		this.dormindo = dormindo;
	}
	
}
