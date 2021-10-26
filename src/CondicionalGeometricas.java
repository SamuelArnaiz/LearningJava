import java.util.*;
import javax.swing.*;
public class CondicionalGeometricas {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Elige una opci�n: \n1:Cuadrado  \n2:Rect�ngulo  \n3:Tri�ngulo  \n4:C�culo");
		
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1://Cuadrado
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el lado, por favor"));
			
			System.out.println("El area del cuadrado es " +  Math.pow(lado, 2));
			
			break;
			
		case 2: //Rect�ngulo
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base, pls"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura, pls"));
			
			System.out.println("El �rea es " + base*altura);
			
			break;
			
		case 3: //Tri�ngulo
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base, pls"));
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura, pls"));
			
			System.out.println("El �rea del tri�ngulo es " + (base*altura)/2);
			
			break;
			
			
		case 4:  //C�rculo
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio, pls"));
			
			System.out.print("El �rea del c�rculo es ");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
			
		default:
			System.out.println("La opci�n no es correcta");
			
		
		}
		
		
		
		

	}

}
