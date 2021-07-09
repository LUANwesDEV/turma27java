package atividadesPoo0807;

public class Conta {
//atributos
	private int numero;
	private double saldo;
	private double limite;
	//construtor - 
	public Conta(int numero){
		this.numero = numero;     		//this serve para avisar qual estar na posição do atributo.
	}
	public Conta(int numero,double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	//Encapsulamento - GETTERS AND SETTERS
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;							//retorna para o programa
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	//metodos proprios
	
	
	public void imprimeExtrato() {
		System.out.println("Conta "+numero+"saldo atual: R$ " +saldo);
	}
	
	public void saca(double valorSaque) {
		if(valorSaque<=0) {
			System.out.println("Valor informado invalido...");
		}
		else if(valorSaque >saldo) {
			System.out.println("Saldo indidponivel");
		}else {
			saldo = saldo - valorSaque;
			System.out.println("Saldo realizado");
		}
		
	}
	public void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	
}
