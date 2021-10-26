import java.util.*;
import javax.swing.*;
public class CondicionalGeometricas {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Elige una opción: \n1:Cuadrado  \n2:Rectángulo  \n3:Triángulo  \n4:Cículo");
		
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1://Cuadrado
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el lado, por favor"));
			
			System.out.println("El area del cuadrado es " +  Math.pow(lado, 2));
			
			break;
			
		case 2: //Rectángulo
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base, pls"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura, pls"));
			
			System.out.println("El área es " + base*altura);
			
			break;
			
		case 3: //Triángulo
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base, pls"));
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura, pls"));
			
			System.out.println("El área del triángulo es " + (base*altura)/2);
			
			break;
			
			
		case 4:  //Círculo
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio, pls"));
			
			System.out.print("El área del círculo es ");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
			
		default:
			System.out.println("La opción no es correcta");
			
		
		}
		
		
		
		

	}

}
