package aplicacao;

import entidades.Conta;

public class TesteBanco {

	public static void main(String[] args) {
	
		Conta cli1 = new Conta(34,"Jose");
		
		
		
			
		System.out.println("Cliente : "+cli1.getNomeCliente());
		System.out.println("Saldo atual : R$"+cli1.getSaldo());
		
		cli1.credito(100);
		System.out.println("Saldo atual : R$"+cli1.getSaldo());
		cli1.credito(200);
		System.out.println("Saldo atual : R$"+cli1.getSaldo());
	}

}
