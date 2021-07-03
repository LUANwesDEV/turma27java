package introducao;

import java.util.Scanner;

public class LacoDecisaoEX2 {
		public static void main(String[]args) {
			  Scanner ler = new Scanner(System.in);
			  int n1,n2,n3;
			  
			  System.out.println("Entre com o 1° numero: ");
			  n1 = ler.nextInt();
			  System.out.println("Entre com o 2° numero: ");
			  n2 = ler.nextInt();
			  System.out.println("Entre com o 3° numero: ");
			  n3 = ler.nextInt();
			  
			   if(n1 > n2 && n2 > n3) 
			  {
				  System.out.println("Os numeros na ordem crecente são: "+n1+n2+n3);
			  }
			   else if(n1 > n3 && n3 > n1 && n2 > n1) 
			  {
				  System.out.println("Os numeros na ordem crecente são: "+n3+n2+n1);
			  }
			   else if(n1 > n2 && n1 > n3 && n3 > n2 )
			  {
				  System.out.println("Os numeros na ordem crecente são: "+n2+n3+n1);
			  }
			   else if(n1 > n3 && n2 > n3 && n2 > n3 )
			  {
				  System.out.println("Os numeros na ordem crecente são: "+n3+n1+n2);	  
			  }
			   else if(n1 > n1 && n3 > n3 && n2 > n2 )
			  {
				  System.out.println("Os numeros na ordem crecente são: "+n1+n3+n2);
			  }
			   else 
			  {
				  System.out.println("Os numeros na ordem crecente são: "+n2+n1+n3);
			  }
		}
	}
