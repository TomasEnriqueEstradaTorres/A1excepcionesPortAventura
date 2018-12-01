package uF5.practicas.A1excepcionesPortAventura;

public class AtraccioFires {

	private static final int ALTURA_MAX_PERSONAS = 216;
	private static final int ALTURA_MIN_PERSONAS = 130;
	private static final int CANTIDAD_PERSONAS = 20;

	// Retorna un número aleatorio entre min (incluido) y max (excluido), que sera la altura.
	public static int alturaGenerada(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}
	// ----------------------------------------------------------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {

		Persona[] personas = new Persona[CANTIDAD_PERSONAS]; // es la cantidad de personas de la atraccion
		Sensor sensor = new Sensor(); // sera el sensor que obtendra la altura de la persona.
		int[] obtenido = new int[CANTIDAD_PERSONAS]; // variable que almacenara las alturas obtenidas del sensor
		PuertaEntrada atraccion = new PuertaEntrada(); // Representa la comprobacion de cada atraccion.

		// Se inicializa el objeto persona con su altura en centimetros
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona(alturaGenerada(ALTURA_MIN_PERSONAS, ALTURA_MAX_PERSONAS));
		}

		// Se obtiene la altura de la persona por medio del sensor
		for (int i = 0; i < personas.length; i++) {
			obtenido[i] = sensor.obtenerAltura(personas[i]); 	// obtiene la altura de la persona
			System.out.println("\nSENSOR: Altura leida = " + obtenido[i]);
		
			try {
				atraccion.comprobar(obtenido[i]);  // La atraccion comprueba la altura de la persona
			} catch (ErrorEstatura e) {
				e.printStackTrace();
			}
		}
	}

}
