package introducao;

import java.util.Scanner;

public class ProgramacaoSequencialEx5 {
     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 double a,b,c,d,r,s;
    	 System.out.println("Digite aqui numero de A: ");
    	 a= ler.nextDouble();
    	 System.out.println("Digite aqui numero de B: ");
    	 b= ler.nextDouble();
    	 System.out.println("Digite aqui numero de C: ");
    	 c= ler.nextDouble();
    	 
    	 r = Math.pow((a+b),2);  // valor que for recebido é multiplicado por ele mesmo 2 vezes.
    	 s = Math.pow((b+c),2);  // aqui a mesma coisa.
    	 d =(r + s)/2;
    	 System.out.println("O valor fina é: "+ d);
     }
}
