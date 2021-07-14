package TesteAULA;

import java.util.HashSet;
import java.util.Set;

public class LIstaAluno {

	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();   //nesse casso o set seria melhor, por que o list permite que os elementos sejam duplicados,o HashSet tem o desenpenho superior ao trueSet seria melhor porque tem mais din
		Aluno a = new Aluno("Ana da Silva","Java",6.8);
		Aluno b = new Aluno("igor Santos","Linux",7.8);
		Aluno c = new Aluno("Joao pereira","SO",8.8);
		Aluno d = new Aluno("Luan Sena","DS",5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}

}
