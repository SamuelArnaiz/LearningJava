package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Ana López", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("María Martín", 105000, 2002 , 03, 15);
		
		empleado1.sube_sueldo(5);
		empleado2.sube_sueldo(5);
		empleado3.sube_sueldo(5);
		
		System.out.println("Nombre: " + empleado1.dame_nombre()+ " Sueldo: " + empleado1.dame_sueldo()
							+" Fecha de Alta: " + empleado1.dime_fecha());
		System.out.println("Nombre: " + empleado2.dame_nombre()+ " Sueldo: " + empleado2.dame_sueldo()
		+" Fecha de Alta: " + empleado2.dime_fecha());
		System.out.println("Nombre: " + empleado3.dame_nombre()+ " Sueldo: " + empleado3.dame_sueldo()
		+" Fecha de Alta: " + empleado3.dime_fecha());*/
		
		Empleado[] misEmpleados=new Empleado[4];
		
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana López", 95000 , 1995, 12, 17);
		misEmpleados[2]=new Empleado("María Martín", 105000, 2002, 03 , 15);
		misEmpleados[3]=new Empleado("Antonio Fernandez");
		
		/*for(int i=0;i<3;i++) {
			misEmpleados[i].sube_sueldo(5);
		}
		
		for(int i = 0;i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dame_nombre() + " Sueldo: " + misEmpleados[i].dame_sueldo() 
					+ " Fecha de Alta: " + misEmpleados[i].dime_fecha());
		}*/
		
		for(Empleado e: misEmpleados) {
			
			e.sube_sueldo(5);
		}
		for(Empleado e:misEmpleados) {
			System.out.println("Nombre: " + e.dame_nombre() + " Sueldo: " + e.dame_sueldo() 
					+ " Fecha de Alta: " + e.dime_fecha());
		}
		
	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, (mes-1) , dia);
		altaContrato=calendario.getTime();
	}
	
	public Empleado(String nom) {
		
		this(nom,30000, 2000,01,01);
		
	}
	
	public String dame_nombre() { //getter
		return nombre;
	}
	
	public double dame_sueldo() {  //getter
		return sueldo;
	}
	
	public Date dime_fecha() {   //getter
		return altaContrato;
	}
	
	public void sube_sueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
