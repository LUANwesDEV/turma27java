package introducao;

public class ClasseCarro {
     
	public int rodas; 
	public double potenciaMotor;
	public boolean portaMala;
	public int caixaSom;
	public boolean ligado;
	public int velocidade;
	
	public void ligarCarro() {
		ligado = true;
		System.out.println("Carro ligando...");
	}
	
	public void desligarCarro() {
		if(velocidade == 0) {
			ligado = false;
			System.out.println("Desligando");
		}else {
			System.out.println("Desacelerando....freiando...");
		}
		
	}
	public void acelerar() {
		velocidade++;
	}
	public void freiando() {
		velocidade--;
	}
}	
