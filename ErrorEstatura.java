package uF5.practicas.A1excepcionesPortAventura;

public class ErrorEstatura extends Exception{
	
	private static final long serialVersionUID = 1L;  // Sirve para mantener actualizada la compatibilidad del programa.

	/**
	 * Cuando se crea una clase de excepcion propia, este debe de tener dos
	 * constructores, uno sin paramatros y otro con un mensaje.
	 */
	public ErrorEstatura() {

	}

	// aqui se le pasa un mensaje para que se muestre en el mensaje cuando halla una excepcion
	public ErrorEstatura(String mensaje) {
		super(mensaje);
	
	}

	

	
	
	
	
	

}
