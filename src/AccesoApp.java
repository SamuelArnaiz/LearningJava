import javax.swing.*;
import java.util.*;
public class AccesoApp {

	public static void main(String[] args) {

		
		/*String clave="Juan";
		
		*String pass="";
		
		*while (clave.equals(pass)==false) {
		*	pass=JOptionPane.showInputDialog("Introduce la contrase�a, pls");
		*	
		*	if(clave.equals(pass)==false) {
		*		System.out.println("Contrase�a Incorrecta bro");
		*	}
		}*
		*
		*System.out.println("Contrase�a correcta, adelante.");*/
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		do{
			intentos++;
			System.out.println("Introduce un n�mero pls");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("M�s bajo");				
			}
			else if(aleatorio>numero) {
				System.out.println("M�s alto");
			}
		}while(numero!=aleatorio);
		
		System.out.println("EUREKA!!, lo has conseguido en " + intentos + " Intentos.");
		

	}

}
