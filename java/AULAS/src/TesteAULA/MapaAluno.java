package TesteAULA;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[]args) {
		Map<String,Aluno> mapa= new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("Ana da Silva","Java",6.8);
		Aluno b = new Aluno("igor Santos","Linux",7.8);
		Aluno c = new Aluno("Joao pereira","SO",8.8);
		Aluno d = new Aluno("Luan Sena","DS",5.5);
		
		mapa.put("Ana da Silva", a);
		mapa.put("igor Santos",b);
		mapa.put("Joao pereira",c);
		mapa.put("Luan Sena",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Luan Sena"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e: alunos) {
			System.out.println(e);
		}
	}
}
