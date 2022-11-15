package Proyecto20;

import java.util.Scanner;

/*
 * Creamos un patrón de las posibles preguntas del
 * test, de forma que podamos posteriormente crearlas solo
 * metiendo los valores en lugar de repetir todo el código en cada una.
 */
public class Pregunta {
	private String texto;
	private Respuesta respuestasPosibles[];

	public Pregunta() {
	}



	/*
	 * El objeto pregunta, está formado por el texto del enunciado y un array de
	 * objetos respuesta en el que van las posibles respuestas y la puntuacion de
	 * cada una
	 */
	public Pregunta(String texto, Respuesta[] respuestasPosibles) {
		this.texto = texto;
		this.respuestasPosibles = respuestasPosibles;

	}

	/*
	 * Métodos getters y setters sirven respectivamente para poder obtener o asignar
	 * los datos guardados en cada una de las variables del objeto
	 */
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Respuesta[] getRespuestasPosibles() {
		return respuestasPosibles;
	}

	public void setRespuestasPosibles(Respuesta[] respuestasPosibles) {
		this.respuestasPosibles = respuestasPosibles;
	}

	/*
	 * Método para mostrar en pantalla una pregunta con todas sus posibles
	 * respuestas Lo llamo en el siguiente. Funciona, primero imprimiendo la
	 * pregunta, y las respuestas, con un bucle que itera en toda la longitud del
	 * array de respuestas para imprimirlas todas en pantalla
	 */
	public void mostrarDatos() {
		System.out.println(this.texto);
		for (int i = 0; i < this.respuestasPosibles.length; i++) {
			System.out.println(i + 1 + ":" + this.respuestasPosibles[i].getTextoRespuesta());
		}
	}

	/*
	 * Método para recoger la respuesta elegida que se introduce por teclado. Para
	 * que no fallase lo hice por strings y luego forzando los valores a int, con
	 * una condicion para que si no encaja en el int, te repita la pregunta. Aquí
	 * uso dos veces el método para mostrar en pantalla la pregunta, por eso es un
	 * método separado
	 */
	public void hacerPregunta() {
		mostrarDatos();
		boolean fu = false;
		Scanner sc = new Scanner(System.in);
		String respuestaElegida = "";
		while (!fu) {
			if (respuestaElegida.equals("1") || respuestaElegida.equals("2") || respuestaElegida.equals("3")
					|| respuestaElegida.equals("4")) {
				int numRespuesta = Integer.parseInt(respuestaElegida);
				marcarElegida(numRespuesta);
				fu = true;
			} else {
				System.out.println("La respuesta debe ser un numero entre 1 y 4");
				mostrarDatos();
				respuestaElegida = sc.nextLine();
			}
		}

	}

	/*
	 * Método que modifica el valor del boolean que indica si una de las respuestas
	 * ha sido elegida
	 */
	private void marcarElegida(int numElegida) {
		this.respuestasPosibles[numElegida - 1].setElegida(true);
	}

	/*
	 * Método para recoger el valor de puntuación que otorga la respuesta que ha
	 * sido marcada como elegida en cada pregunta
	 */
	public int contarPuntos() {
		int aRetornar = 0;
		for (int i = 0; i < this.respuestasPosibles.length; i++) {
			if (this.respuestasPosibles[i].isElegida()) {
				aRetornar = this.respuestasPosibles[i].getPuntos();
			}
		}
		return aRetornar;
	}

}
