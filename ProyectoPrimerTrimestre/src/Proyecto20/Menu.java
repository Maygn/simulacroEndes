package Proyecto20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public static void mostrarMenu() {

		int eleccionMenu = 0;

		// Sirve para evitar que el programa de error si el usuario mete algo distinto
		// al número

		do {
			/* En este caso, el control de valores erroneos metidos por teclado
			 * se ha hecho usando un try-catch con la excepción que corresponde. 
			 * Esto lo aprendimos recientemente, así que hay otros hechos por el
			 * modo horrible-pero-funcional que los he dejado para que se vea
			 * como hacerlo */
			
			try {
				System.out.println(
						"     MENÚ \n 1.Iniciar test \n 2.Ver creditos \n 3.Salir del programa \n 4.¿Qué pokémon eres?");
				Scanner input = new Scanner(System.in);
				eleccionMenu = input.nextInt();

				// crear switch para eleccion del menú
				switch (eleccionMenu) {

				// para acceder a las preguntas del test
				case 1:/* TODO falta excluir pokemons */
					int puntosTotal = preguntasA();
					if (puntosTotal < 6) {
						puntosTotal += preguntasB1();
					} else {
						puntosTotal += preguntasB2();
					}

					break;

				// para acceder a los creditos
				case 2:
					System.out.println("Proyecto realizado por: \n  \t Mayte Gonzalez \n \t David Oliva \n ");
					break;

				// para cerrar programar
				case 3:
					System.out.println("Adios");
					break;

				// Para comprobar que pokémon eres
				case 4:
					Resultados.probarResultado();
					break;
				default:
					System.out.println("Ese caracter no es correcto, aprendete los numeros en orden");
				}
			} catch (InputMismatchException ex) {
				System.out.println("no es un caracter valido imbecil");
			}
			// Hace que el bucle se rompa al elegir la opcion de cerrar programa
		} while (eleccionMenu != 3);
	}

	/*
	 * Aquí creo un array de tres preguntas, cuyo resultado (mayor o menor
	 * puntuación) va a determinar cual de los siguientes dos subgrupos de preguntas
	 * va a tener que responder el usuario
	 */
	public static int preguntasA() {
		Pregunta[] primerGrupo = new Pregunta[3];

		primerGrupo[0] = new Pregunta("¿Te gusta hablar con la gente?",
				new Respuesta[] { new Respuesta("Me encanta", 0), new Respuesta("Odio a la humanidad", 3),
						new Respuesta("Sólo con la gente que conozco", 2),
						new Respuesta("Lo hago, pero no me gusta", 1) });

		primerGrupo[1] = new Pregunta("¿Te importa lo que piensen de ti?",
				new Respuesta[] { new Respuesta("No, creo mis propias reglas", 1),
						new Respuesta("Me gusta pasar desapercibido", 0),
						new Respuesta("Sí, siempre tengo que ir perfecto", 2),
						new Respuesta("Intento ir presentable, pero poco más", 3) });

		primerGrupo[2] = new Pregunta("¿Eres seguro de ti mismo?",
				new Respuesta[] { new Respuesta("De sobra", 0), new Respuesta("Depende de mi estado de ánimo", 2),
						new Respuesta("Depende de con quien esté", 1), new Respuesta("No, ni un poco", 3) });

		int puntosA = 0;
		for (int i = 0; i < primerGrupo.length; i++) {
			primerGrupo[i].hacerPregunta();
			puntosA = puntosA + primerGrupo[i].contarPuntos();
		}
		return puntosA;

	}

	/*
	 * Este es el primero de los dos grupos de 5 preguntas alternativos que puede
	 * tener que responder el usuario. Una vez que llegas a este grupo, ya están
	 * descartados la mitad de los pokemon posibles
	 */
	public static int preguntasB1() {
		Pregunta[] segundoGrupo = new Pregunta[5];

		segundoGrupo[0] = new Pregunta("Miau?", new Respuesta[] { new Respuesta("Respu 1", 1),
				new Respuesta("Respu 2", 0), new Respuesta("Respu 3", -1), new Respuesta("respu4", 2) });

		segundoGrupo[1] = new Pregunta("Miau2?", new Respuesta[] { new Respuesta("Respu2 1", 1),
				new Respuesta("Respu2 2", 0), new Respuesta("Respu2 3", -1), new Respuesta("respu42", -1) });

		segundoGrupo[2] = new Pregunta("miau3", new Respuesta[] { new Respuesta("respu21", 1),
				new Respuesta("respuesta3", 0), new Respuesta("respu33", 2), new Respuesta("respuesta43", -1) });

		segundoGrupo[3] = new Pregunta("miau3", new Respuesta[] { new Respuesta("respu21", 1),
				new Respuesta("respuesta3", 0), new Respuesta("respu33", 2), new Respuesta("respuesta43", -1) });

		segundoGrupo[4] = new Pregunta("miau3", new Respuesta[] { new Respuesta("respu21", 1),
				new Respuesta("respuesta3", 0), new Respuesta("respu33", 2), new Respuesta("respuesta43", -1) });

		int puntosB1 = 0;
		for (int i = 0; i < segundoGrupo.length; i++) {
			segundoGrupo[i].hacerPregunta();
			puntosB1 = puntosB1 + segundoGrupo[i].contarPuntos();
		}

		return puntosB1;

	}

	/* Este es el segundo subgrupo de preguntas.Funciona igual que los anteriores */
	public static int preguntasB2() {
		Pregunta[] tercerGrupo = new Pregunta[5];

		tercerGrupo[0] = new Pregunta("Miau?", new Respuesta[] { new Respuesta("Respu 1", 1),
				new Respuesta("Respu 2", 0), new Respuesta("Respu 3", -1), new Respuesta("respu4", 2) });

		tercerGrupo[1] = new Pregunta("Miau2?", new Respuesta[] { new Respuesta("Respu2 1", 1),
				new Respuesta("Respu2 2", 0), new Respuesta("Respu2 3", -1), new Respuesta("respu42", -1) });

		tercerGrupo[2] = new Pregunta("miau3", new Respuesta[] { new Respuesta("respu21", 1),
				new Respuesta("respuesta3", 0), new Respuesta("respu33", 2), new Respuesta("respuesta43", -1) });

		tercerGrupo[3] = new Pregunta("miau3", new Respuesta[] { new Respuesta("respu21", 1),
				new Respuesta("respuesta3", 0), new Respuesta("respu33", 2), new Respuesta("respuesta43", -1) });

		tercerGrupo[4] = new Pregunta("miau3", new Respuesta[] { new Respuesta("respu21", 1),
				new Respuesta("respuesta3", 0), new Respuesta("respu33", 2), new Respuesta("respuesta43", -1) });

		int puntosB2 = 0;
		for (int i = 0; i < tercerGrupo.length; i++) {
			tercerGrupo[i].hacerPregunta();
			puntosB2 = puntosB2 + tercerGrupo[i].contarPuntos();
		}

		return puntosB2;

	}

}
