package TesteAULA;

public class Pessoa {
	//ATRIBUTO
	private String nome;
	private int matricula;
	
	//CONSTRUTOR
	public Pessoa (String nome,int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	//ENCAPSULAMENTO GETTERS - SETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
