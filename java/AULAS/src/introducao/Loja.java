package introducao;

import java.util.Scanner;

public class Loja {
		public static void main(String[]args) {
			Scanner ler = new Scanner(System.in);
			
			String produtos[]= {"Banana","Maça","Abacaxi","Maracuja","Melão","Melancia","Laranja","Morango","Pera","Acerola"};
			double precos[]= new double[10];
			int estoque[] = new int [3];
			String codigo[] = new String[3];
			char op;
			int carrinho[] = new int[10];
		
			
			for (int x=0;x<3;x++) {
				codigo[x] ="ggg"+(x+1);
				estoque[x] = 10;
		//		System.out.println(codigo[x]+"\n"+produtos[x]+"\n"+estoque[x],"\n"+precos[x]);
				}
			
		}
}
