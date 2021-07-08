package introducao;

public class Pessoa {
     
	public String nome; // atributo
	public char sexo;
	public int anoNascimento;
	
	public void mostrarIdade() {
		System.out.println("2021-anoNascimento");
		if((2021-anoNascimento)>=18) {
			System.out.println("Você é adulto!!");
		}else {
			System.out.println("Você é criança!!");
		}
	}
	
	public int calcularIdade() {
		return (2021-anoNascimento);
	}
	public int calcularIdade(int anoAtual) {
		return (2021-anoNascimento);
	}
}
