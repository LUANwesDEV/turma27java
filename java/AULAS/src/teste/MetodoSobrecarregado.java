package teste;

public class MetodoSobrecarregado {    //seria uma classe que pode ter varios metodos com o mesmo nome;
	public void testaMetodosSobrecarregados() {
		System.out.printf("Salario e numero inteiro: %d \n",salario(1000));
		System.out.printf("Salario e numero double: %f \n",salario(7.500));
	}
	public int salario(int valorInt) {
		System.out.printf("Salario com argumento inteiro: %d \n",valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble) {
		System.out.printf("Salario com argumento double: %f \n",valorDouble);
		return valorDouble * valorDouble; 
	}
}
