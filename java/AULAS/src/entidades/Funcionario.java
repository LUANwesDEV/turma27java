package entidades;

public class Funcionario {
	//atribuição
	private String matricula;
	private int horaTrabalhadas;
	private double valorHora;
	
	
	
	public Funcionario(String matricula, int horaTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.horaTrabalhadas = horaTrabalhadas;
		this.valorHora = valorHora;
	}
	
	// sobrecarga do construtor

	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}


// encapsulamento
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHoraTrabalhadas() {
		return horaTrabalhadas;
	}

	public void setHoraTrabalhadas(int horaTrabalhadas) {
		this.horaTrabalhadas = horaTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double salario() {
		
		return this.horaTrabalhadas * this.valorHora;
	}
	
}
