import java.util.Scanner;
public class Aut�nomoOptionPanel {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre pls.");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("�Nos podr�as decir tu edad?");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ", te quedan " + (30-edad) + " a�os para los 30, que poco.");
		
		
	}
	
}
	