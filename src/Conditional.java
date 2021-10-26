import java.util.*;
public class Conditional {

	public static void main(String[] args) {
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		if (edad<18) {
			
			System.out.println("Eres un adolescente");
			
		}
		else if(edad<40) {
			
			System.out.println("Eres viejoven");
			
		}
		else if(edad<65) {
			
			System.out.println("Se acerca el garrote");
			
		}
		else {
			
			System.out.println("OJO CUIDAO!!");
		}
		
		

	}

}
