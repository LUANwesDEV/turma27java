package atividadesPoo0707;

public class Cliente {

	public int idade;
	public String nome;
	public int anoNascimento;

	public void mostrarIdade() {
		System.out.println("2021-anoNascimento");
		if ((2021 - anoNascimento) <= 18) {
			System.out.println("Você tem idade para negociar!!");
		} else {
			System.out.println("Infelizmente não negociamos com menores!!");
		}
	}

	public int calcularIdade() {
		return (2021 - anoNascimento);
	}

	public int calcularIdade(int anoAtual) {
		return (anoAtual - anoNascimento);
	}

}
