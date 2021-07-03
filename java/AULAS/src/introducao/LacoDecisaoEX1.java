package introducao;

import java.util.*;

public class LacoDecisaoEX1 {
    	public static void main(String[]args) 
    	{
    		 Scanner ler = new Scanner(System.in);
    		 int n1,n2,n3;
    		 
	    		 System.out.println("Digite o primeiro numero: ");
	    		 n1 = ler.nextInt();
	    		 System.out.println("Digite o segundo numero: ");
	    		 n2 = ler.nextInt();
	    		 System.out.println("Digite o terceiro numero: ");
	    		 n3 = ler.nextInt();
    		 
    		if(n1 > n2 && n2 >n3) {
    			 System.out.println("Esse numero é o maior deles: "+n1);
        	}
    		else if(n1 > n3)
        	{
        		 System.out.println("Esse numero é o maior deles: "+n2);
        	}
        	else 
        	{
        		 System.out.println("Esse numero é o maior deles: "+n3);
        	} 		 
    	}
}
