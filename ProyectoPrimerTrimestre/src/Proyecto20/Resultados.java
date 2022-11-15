package Proyecto20;

import java.util.Scanner;

public class Resultados {
	/*
	 * Este método sirve para poder meter por teclado tu puntuación para ver que
	 * pokemon se te asigna. El listado de valores posibles está en otro método
	 * porque se usa también para comprobar el valor cuando lo calcula directamente
	 * el programa en lugar de meterlo por teclado
	 */
	public static void probarResultado() {

		Scanner sc = new Scanner(System.in);
		int puntos = 0;

		do {

			try {
				System.out.println("Introduce tu puntuación : \n(Introduce -1 para volver al menú)");
				puntos = sc.nextInt();
				calcularResultados(puntos);
			} catch (Exception ex) {
				System.out.println("Eso no es un numero imbecil, eso es una letra");
			}
		} while (puntos != (-1));
		System.out.println("Adios \n");
	}

	/*
	 * Son la lista de pokemon posibles y los rangos de puntuación en los que se
	 * asigna cada uno de los bichos al usuario
	 */
	public static void calcularResultados(int puntos) {
		if (puntos >= 00 && puntos < 25) {
			System.out.println("Eres un... \n SCRAGGY \n (https://urlzs.com/F8uNF) ");
		}

		else if (puntos >= 25 && puntos < 50) {
			System.out.println("Eres un... \n MAGIKARP \n (https://urlzs.com/ViN2o)");
		}

		else if (puntos >= 50 && puntos < 75) {
			System.out.println("Eres un... \n JINX \n (https://urlzs.com/xfqRu)");
		}

		else if (puntos >= 75 && puntos < 100) {
			System.out.println("Eres un... \n PSYDUCK \n (https://urlzs.com/ddsfq) ");
		}

		else if (puntos >= 100 && puntos < 125) {
			System.out.println("Eres un... \n SNORLAX \n (https://urlzs.com/Jk5xn)");
		}

		else if (puntos >= 125 && puntos < 150) {
			System.out.println("Eres un... \n SNIVY \n (https://urlzs.com/tcTo7)");
		}

		else if (puntos >= 150 && puntos < 175) {
			System.out.println("Eres un... \n GENGAR \n (https://urlzs.com/Lr7U5)");
		}

		else if (puntos >= 175 && puntos < 200) {
			System.out.println("Eres un... \n CHARIZARD \n (https://urlzs.com/Roihy)");
		}

		else if (puntos >= 200 && puntos < 225) {
			System.out.println("Eres un... \n SQUIRTLE \n (https://urlzs.com/xFPEz)");
		}

		else if (puntos >= 225 && puntos < 250) {
			System.out.println("Eres un... \n JIGGLYPUFF \n (https://urlzs.com/R3711)");
		} else {
			if (puntos != (-1)) { //WTF ES ESTO????
				System.out.println("Puntuación incorrecta \n");
			}
		}
	}
}
