package atividadesPoo0707;

public class Aviao {
	
	public int rodas;
	public String tipo;
	public boolean ligado;
	public boolean noAr;
	public int velocidade;

	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		ligado = false;
	}

	public void decolando() {
		for (int x = 1; x <=10; x++) {
			aumentarVelocidade();
		}
		noAr = true;
	}

	public void pousar() {								//metodos!!!!!
		for (int x = 1; x <=10; x++) {
			diminuirVelocidade();
		}
		noAr = false;

	}

	public void aumentarVelocidade() {
		velocidade++;
	}
	public void aumentarVelocidade(int incremento) {
		velocidade=velocidade+incremento;
	}

	public void diminuirVelocidade() {
		velocidade--;
	}
	public void diminuirVelocidade(int decremento) {
		velocidade-=decremento;
	}
}
