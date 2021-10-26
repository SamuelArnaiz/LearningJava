public class ClaseString {

	public static void main(String[] args) {
		
		String nombre="Daniel Luna Puto Amo";
		
		System.out.println("El DIOS indiscutible es " + nombre);
		
		System.out.println("El nombre de DIOS tiene " + nombre.length() + " letras");
		
		System.out.println("La primera letra de " + nombre +  " es la " + nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("Y la última letra es la " + nombre.charAt(ultima_letra-1));
		
		
		
		String frase="Hoy es un estupendo día para aprender a programar en JAVA";
		
		String frase_resumen=frase.substring(0, 28) + " irnos a la playa y " + frase.substring(29, 57);
		
		System.out.println(frase_resumen);
		
		
		String alumno1, alumno2;
		
		alumno1="Pepe";
		
		alumno2="pepe";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}

}
