package TesteAULA;

public class Erros {
	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) {
			System.out.println("A frase inicial é nula, para solucionar tal problema foi lhe atribuido um valor default.");
			frase = "frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase antiga: "+frase);
		System.out.println("Frase nova "+novaFrase);
	}
}
