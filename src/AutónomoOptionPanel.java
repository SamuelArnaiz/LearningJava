import java.util.Scanner;
public class AutónomoOptionPanel {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre pls.");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("¿Nos podrías decir tu edad?");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ", te quedan " + (30-edad) + " años para los 30, que poco.");
		
		
	}
	
}
	