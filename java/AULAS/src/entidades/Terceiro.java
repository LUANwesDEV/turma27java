package entidades;

public class Terceiro extends Funcionario {
	
	
	private double adicional;


	public Terceiro(String matricula, int horaTrabalhadas, double valorHora, double adicional) {
		super(matricula, horaTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public Terceiro(String matricula, double adicional) {
		super(matricula);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@Override
	public double salario() {
		
		return (super.getHoraTrabalhadas()*super.getValorHora()) + adicional;
	}
	
}
