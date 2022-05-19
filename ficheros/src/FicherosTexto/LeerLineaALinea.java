package FicherosTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerLineaALinea {
	
	static final String RUTA="/etc/passwd";

	public static void main(String[] args) {
		
		// Creamos el objeto File
		
		File fichero= new File (RUTA);
		
		//creamos y abrimos el objeto BufferedReader dentro del try()  para ahorrarnos cerrarlo después
		
		try ( BufferedReader lectura=new BufferedReader(new FileReader(RUTA))) {

			String linea;  //líneas que voy a ir leyendo
			int contador=0;
			
			//bucle hasta que recupere una línea vacía , es decir, llegue al fin del fichero
			while ( (linea =lectura.readLine())!=null ) {
			
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
