package FicherosTexto;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class EscribirLineaALinea {
	
	static final String RUTA="ficheros/ejemplo.txt";

	public static void main(String[] args) {
		
		// Creamos el objeto File
		
		File fichero= new File (RUTA);
		
		//creamos y abrimos el objeto BufferedReader dentro del try()  para ahorrarnos cerrarlo después
		
		try ( Scanner entrada= new Scanner(System.in); 
				BufferedWriter salida = new BufferedWriter (new FileWriter(fichero,true))) {
			

			int contador=0;
			
			System.out.println("Escribe  la siguiente línea , o escribe 'FIN' para terminar");
			  
			  String linea = entrada.nextLine().trim();
			  
			   while (!linea.equalsIgnoreCase("FIN")){
				   
				   salida.write(linea);  //escribe una cadena en el flujo de salida
				   salida.newLine(); //agregamos un retorno de carro
				   
				   contador++;
				   System.out.println("Escibe la siguiente línea  o escribe 'FIN' para terminar");
				   linea = entrada.nextLine().trim();
			  }//fin del bucle
			
			
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
