package atividadesPoo0807;

public class LuBanco {

	public static void main(String[] args) {
		
		Conta cliente1 = new Conta(1); // instaciar,criar
		Conta clientevip = new Conta(1000,55.55);
		Conta clienteEspecial = new Conta(3);
		Conta clijaque = new Conta(45,1995.45,2000.00);		
		
		//clienteEspecial.getNumero(200);
		System.out.println("Numero da conta: "+cliente1.getNumero());
		System.out.println("Numero da conta: "+clienteEspecial.getNumero());
		
		clijaque.imprimeExtrato();
		clientevip.imprimeExtrato();
		clienteEspecial.imprimeExtrato();
		clijaque.saca(1000.33);
		clijaque.imprimeExtrato();
		//clienteEspecial.depositar(5000.55);
		clienteEspecial.imprimeExtrato();
		
		//cliente1.depositar(100);
		//cliente1.
		
	}

}
