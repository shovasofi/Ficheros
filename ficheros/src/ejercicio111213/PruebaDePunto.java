package ejercicio111213;

import java.util.*;

public class PruebaDePunto {

	public static void main(String[] args) {
		String dirHome = "ficheros";

		// genero una lista de puntos de prueba

		List<Punto> lista1 = new ArrayList<>();
		List<Punto> lista2;
		lista1.add(new Punto(1, 1, "Rojo"));
		lista1.add(new Punto(2, 2, "Verde"));
		lista1.add(new Punto(3, 3, "Azul"));
		lista1.add(new Punto(4, 4, "Amarillo"));
		lista1.add(new Punto(5, 5, "Magenta"));

		// llamamos al método para guardar los puntos en el fichero de forma destructiva
		EscribirEnFichero.escribirEnFichero(lista1, dirHome + "/Punto.dat");

		// llamamos ahora al m�todo para leer los puntos desde el fichero
		lista2 = LeerPuntosDeFichero.leerPuntosDeFichero(dirHome + "/Punto.dat");

		// los leemos e imprimios
		for (Punto p : lista2) {
			System.out.println(p.toString());
		}

		// veo qué pasa si agrego puntos al final del fichero
		lista1.clear(); // vacío la lista
		lista1.add(new Punto(6, 6, "Cyan"));
		lista1.add(new Punto(7, 7, "Gris Claro"));
		lista1.add(new Punto(8, 8, "Rosa"));

		// llamo al m�todo para agregar los puntos al fichero
		AgregarPuntosEnFichero.agregarPuntosEnFichero(lista1, dirHome + "/Punto.dat");

		// vuelvo a leerlos e imprimirlos

		lista2 = LeerPuntosDeFichero.leerPuntosDeFichero(dirHome + "/Punto.dat");

		for (Punto p : lista2) {
			System.out.println(p.toString());
		}

//			
	}

}
