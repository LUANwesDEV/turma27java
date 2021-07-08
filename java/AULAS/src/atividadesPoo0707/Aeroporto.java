package atividadesPoo0707;

public class Aeroporto  {
	public static void main(String[]args) {
		
		Aviao aviao1 = new Aviao ();     //instanciar/criar
		
		
		aviao1.tipo = "7 LUGAR PARA PASSAGEIRO";
		//aviao1.rodas = 3;
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade =0;
		
		System.out.println("======Vôo com destino para tailândia! ======");
		System.out.println("O avião tem  "+aviao1.tipo);
		System.out.println("O avião esta ligado: "+aviao1.ligado+", a velocidade: "+aviao1.velocidade+", esta no Ar:  "+aviao1.noAr);
		aviao1.ligar();
		aviao1.aumentarVelocidade();		
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		System.out.println("Velocidade atual: "+aviao1.velocidade+", no ar: "+aviao1.noAr+", ligado: "+aviao1.ligado);
		aviao1.decolando();
		System.out.println("Decolando...");
		aviao1.aumentarVelocidade(50);
		System.out.println("Velocidade atual: "+aviao1.velocidade+", no ar: "+aviao1.noAr+", ligado: "+aviao1.ligado);
		aviao1.diminuirVelocidade(40);
		System.out.println("Velocidade atual: "+aviao1.velocidade+", no ar: "+aviao1.noAr+", ligado: "+aviao1.ligado);
		aviao1.pousar();
		System.out.println("Pousando...");
		System.out.println("Velocidade atual: "+aviao1.velocidade+", no ar: "+aviao1.noAr+", ligado: "+aviao1.ligado);
		aviao1.desligar();
		System.out.println("Velocidade atual: "+aviao1.velocidade+", no ar: "+aviao1.noAr+", ligado: "+aviao1.ligado);
		
	}
}
