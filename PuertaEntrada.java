package uF5.practicas.A1excepcionesPortAventura;


public class PuertaEntrada {

	private static final int ALTURA_MAX_PERMITIDO = 190;
	private static final int ALTURA_MIN_PERMITIDO = 150;

	public void comprobar(int estatura) throws ErrorEstatura {

		if (estatura >= ALTURA_MIN_PERMITIDO && estatura <= ALTURA_MAX_PERMITIDO) {
			System.out.println("Abriendo la puerta a la altura " + estatura + " cm");

		} else if (estatura < ALTURA_MIN_PERMITIDO) {
			System.out.println("ERROR: No llega a la altura mínima de " + ALTURA_MIN_PERMITIDO);
			//throw new ErrorEstatura("ERROR: No llega a la altura mínima de " + ALTURA_MIN_PERMITIDO);

		} else if (estatura > ALTURA_MAX_PERMITIDO) {
			System.out.println("ERROR: Sobrepasada la altura maxima de " + ALTURA_MAX_PERMITIDO);
			//throw new ErrorEstatura("ERROR: Sobrepasada la altura maxima de " + ALTURA_MAX_PERMITIDO);
		}

	}

}
