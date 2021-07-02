package introducao;

public class CalculoTeperatura {
      public static void main (String[] args) {
    	  
    	  String nome;
    	  double F,C, K;
    	  
    	  nome = "Luan";
    	  
    	  F= 500;
    	  
    	  C = (F-32)/1.8;
    	  K = C + 273.15;
    	  
    	  System.out.println("Ola, " + nome+ "! a temperatura de hoje em graus é  " + C +"°C e "+K+"K.");
    	  
      }
}
