package uF5.practicas.A1excepcionesPortAventura;

public class Persona {
	
	private int altura;

	//CONSTRUCTOR
	public Persona(int altura) {
		this.altura = altura;
	}

	
	//GETTER Y SETTER
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}


	//METODO
	@Override
	public String toString() {
		return "Altura: " + altura;
	}
}
