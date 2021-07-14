package aplicação;

import entidades.Funcionario;
import entidades.Terceiro;

public class TesteCad {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("001",40,10.00);
		Terceiro ter1 = new Terceiro("100",40,10.00,50);
		
		System.out.println("Funcionario CLT");
		System.out.println("matricula :"+func1.getMatricula());
		System.out.println("Salaraio atual :"+func1.salario());
		
		System.out.println("Terceiro");
		System.out.println("matricula :"+func1.getMatricula());
		System.out.println("Salaraio atual :"+func1.salario());

	}

}
