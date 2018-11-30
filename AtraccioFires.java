package uF5.practicas.A1excepcionesPortAventura;



public class AtraccioFires {
	
	private static final int ALTURA_MAX = 216;
	private static final int ALTURA_MIN = 130;
	private static final int CANTIDAD_PERSONAS = 20;	
	
	// Retorna un número aleatorio entre min (incluido) y max (excluido), que sera la altura.
	public static int alturaGenerada(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		Persona[] personas = new Persona[CANTIDAD_PERSONAS];  // es la cantidad de personas de la atraccion
		Sensor sensor = new Sensor();  // sera el sensor que obtendra la altura de la persona.
		int[] obtenido = new int[CANTIDAD_PERSONAS];  //variable que almacenara las alturas obtenidas del sensor
		
		
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona(alturaGenerada(ALTURA_MIN, ALTURA_MAX));
		}
		
		
		for (int i = 0; i < personas.length; i++) {
			// obtenido[i] = sensor.obtenerAltura(personas[i])
			System.out.println(obtenido[i] = sensor.obtenerAltura(personas[i])); // obtiene la altura de la persona
		}
		
		
		
	
		
		
		
		
		
		
		



	}
}
