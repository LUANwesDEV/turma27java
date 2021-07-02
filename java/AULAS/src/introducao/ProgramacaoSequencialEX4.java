package introducao;

import java.util.Scanner;

public class ProgramacaoSequencialEX4 {
       public static void main(String[] args) {
    	   Scanner ler = new Scanner(System.in);
    	   
    	   float n1,n2,n3, media;
    	   float mediaPonderada;
    	   System.out.println("Digite sua primeira nota: ");
    	   n1 = ler.nextFloat();
    	   System.out.println("Digite sua segunda nota: ");
    	   n2 = ler.nextFloat();
    	   System.out.println("Digite sua terceira nota: ");
    	   n3 = ler.nextFloat();
    	   
    	   media = (n1/2)+(n2/3)+(n3/5);
    	   mediaPonderada = (n1*2+n2*3+n3*5)/10;
    	   System.out.println("Sua media ponderada é: "+mediaPonderada);
    	   System.out.printf("A sua media final é: "+media);
    	   
    	   
    	   if(media>=6 || media<4) {
    		   System.out.println("Parabens, você foi aprovado!");
    	   }else {
    		   System.out.println("infelizmente você não foi aprovado,tente novamente!");
    	   }
       }
}
