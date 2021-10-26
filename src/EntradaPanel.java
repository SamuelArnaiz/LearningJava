import javax.swing.*;
public class EntradaPanel {

	public static void main(String[] args) {
		
		String Nombre_Usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("introduce la edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola " + Nombre_Usuario + ", el año que viene tendrás " + edad_usuario + " años.");
		
	    
			

	}

}
