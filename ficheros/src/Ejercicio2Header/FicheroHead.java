package Ejercicio2Header;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FicheroHead {

	// ejercicio 2
	public static void head(String rutaFichero) {
		//head("/datos/usuarios/alumnos/shova.shrestha/Escritorio/head", 10);
		File fichero = new File(rutaFichero);
		try (BufferedReader br = new BufferedReader(new FileReader(fichero));) {

			String linea;
			int cont = 1;

			while ((linea = br.readLine()) != null) {

				if (cont> 10) {
					break;
					
				}else {
					System.out.println( " Linea " + cont+ " " + linea  );
					cont++;
					
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");

		} catch (IOException ex) {
			System.out.println("El fichero está vacio");
		}

	}

	// ejercicio 3
	public static void head(String rutaFichero, int lineas) {
		File fichero = new File(rutaFichero);
		try (BufferedReader br = new BufferedReader(new FileReader(fichero));) {

			String linea;
			
			int cont = 1;

			while ((linea = br.readLine()) != null) {

				if (cont> lineas) {
					break;
					
				}else {
					System.out.println( " Linea " + cont+ " " + linea  );
					cont++;
					
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");

		} catch (IOException ex) {
			System.out.println("El fichero está vacio");
		}
		
	}

	// ejercicio 4
	public static void tail(String rutaFichero) {

	}

	// ejercicio 5
	public static void tail(String rutaFichero, int lineas) {

	}
	
	
	
	public static void main(String[] args) {
		//head("/datos/usuarios/alumnos/shova.shrestha/Escritorio/head");
		
		head("/datos/usuarios/alumnos/shova.shrestha/Escritorio/head", 12);
	}
}
