package PetAnimal;

public class TesteAnimal {
	public static void main(String[]args) {
		
		Animal cachorro = new Animal("Apolo",2);  
		Animal cavalo = new Animal("Corsel",8);
		Animal preguica = new Animal("Floresta",4);
		
		System.out.println("O nome do cachorro é: "+cachorro.getNome());
		System.out.println("O cavalo tem: "+cavalo.getIdade()+" anos");
		System.out.println("a preguiça esta na "+preguica.getNome());
		
	}
}
