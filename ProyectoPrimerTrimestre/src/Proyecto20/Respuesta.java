package Proyecto20;

/*
 * Creamos un patrón de las posibles respuestas a cada pregunta del
 * test, de forma que podamos posteriormente crearlas solo
 * metiendo los valores en lugar de repetir todo el código en cada una.
 */
public class Respuesta {
	/*
	 * Cada respuesta posible tiene su texto, la cantidad de puntos que otorga para
	 * asignar un pokemon al final y un boolean para guardar la información de si ha
	 * sido elegida o no
	 */
	private String textoRespuesta;
	private int puntos;
	private boolean elegida;

	/* Método constructor vacío, es buena práctica */
	public Respuesta() {
		this.elegida = false;
	}

	/*
	 * Método constructor que vamos a usar, con toda la información que se va a necesitar
	 * para hacer las preguntas
	 */
	public Respuesta(String textoRespuesta, int puntos) {

		this.textoRespuesta = textoRespuesta;
		this.puntos = puntos;
		this.elegida = false;
	}
	
	
	
	

	/*
	 * Métodos getters y setters sirven respectivamente para poder obtener o 
	 * asignar los datos guardados en cada una de las variables del objeto
	 */
	public String getTextoRespuesta() {
		return textoRespuesta;
	}

	public void setTextoRespuesta(String textoRespuesta) {
		this.textoRespuesta = textoRespuesta;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public boolean isElegida() {
		return elegida;
	}

	public void setElegida(boolean elegida) {
		this.elegida = elegida;
	}
}
