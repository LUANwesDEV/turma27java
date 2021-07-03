package introducao;

import java.util.Scanner;

public class LacoDecisaoEX3 {
       public static void main(String[] args) {
    	   Scanner ler = new Scanner(System.in);
    	   int idade;
    	   
    	   System.out.println("Informe sua idade: ");
    	   idade = ler.nextInt();
    	   
    	    if (idade <=14) 
    	    {
    	    	 System.out.println("Infantil ");
    	    }
    	    else if(idade >=15 && idade <=17 ) 
    	    {
	    		 System.out.println("Juvenil");
    	    }
    	    else
    	    {
    	     System.out.println("Adulto");
    	    }
       }
}
