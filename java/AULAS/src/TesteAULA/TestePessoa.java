package TesteAULA;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa jessica = new Pessoa("jessica",333);
		Funcionario1 pedro = new Funcionario1("Pedro",444,"TI");
		Pessoa maria = new Funcionario1("Maria",555,"Informatica-Desenvolvido");
		Pessoa jose = new Coordenador("jose",777,"CC");
		
		System.out.println("A matricula de Jessica �: "+jessica.getMatricula());
		System.out.println("O departamento de pedro � :"+pedro.getDepartamento());
		System.out.println("A matricula de Maria �: "+maria.getMatricula());
		System.out.println("Meu nome � "+jose.getNome());
	}

}
