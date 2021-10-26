package CompraCoches;

public class Coches {
	public String ColorCoche;
	public int Matrícula;
	public double CV;
	public static double Firma;
	
	private double Serial;
	private double CdSeg;
	
	public Coches(String Color, int Mat, double cv) {
		
		ColorCoche=Color;
		Matrícula=Mat;
		CV=cv;
		Firma= NumberSeg();
		
	}
	
	public double NumberSeg() { 
		Serial=Math.random();
		CdSeg=Math.random()*2;
		Firma= Serial + CdSeg;
		return Firma;
		
				
	}
	
	
	
	
	

}
