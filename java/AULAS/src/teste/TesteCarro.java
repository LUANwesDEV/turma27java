package teste;

public class TesteCarro {
	public static void main(String[]args){
		Carro meuCarro = new Carro();
		meuCarro.cor = "AZUL";                     	//
		meuCarro.modelo = "NIssan GTR";            	//INSTACIAR OS ATRIBUTOS.
		meuCarro.velocidadeAtual = 0;				//
		meuCarro.velocidadeMaxima = 80;				//	
		
		//CHAMAR OS METODOS CRIADO!!!!
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
	}
}
