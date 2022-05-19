package FicherosTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class LeerLineaALineaV2 {
	
	static final String RUTA="ficheros/ejemplo.txt";

	public static void main(String[] args) {
		
		// Creamos el objeto File
		
		File fichero= new File (RUTA);
		
		//creamos y abrimos el objeto BufferedReader dentro del try()  para ahorrarnos cerrarlo después
		
		try ( Scanner lectura = new Scanner(fichero)) {

			String linea;  //líneas que voy a ir leyendo
			int contador=0;
			
			//bucle hasta que recupere una línea vacía , es decir, llegue al fin del fichero
			while ( lectura.hasNextLine()) {
				linea= lectura.nextLine();
				System.out.println(linea);
				contador++;
			}
			
			System.out.println("Líneas leídas : " +contador);
		} catch (Exception e) {
			//tratamiento de posibles excepciones
			e.printStackTrace();
		} finally {
			//no es obligatorio, pero sí recomendable, liberar la refeerencia al File
			fichero=null;
		}

	}

}
