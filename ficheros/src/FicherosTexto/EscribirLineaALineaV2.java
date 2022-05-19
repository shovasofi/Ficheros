package FicherosTexto;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirLineaALineaV2 {
	
	static final String RUTA="ficheros/ejemplo.txt";

	public static void main(String[] args) {
		
		// Creamos el objeto File
		
		File fichero= new File (RUTA);
		
		//creamos y abrimos el objeto BufferedReader dentro del try()  para ahorrarnos cerrarlo después
		
		try ( Scanner entrada= new Scanner(System.in); 
				PrintWriter salida = new PrintWriter(new FileWriter(fichero,true))) {
			

			int contador=0;
			
			System.out.println("Escribe  la siguiente línea , o escribe 'FIN' para terminar");
			  
			  String linea = entrada.nextLine().trim();
			  
			   while (!linea.equalsIgnoreCase("FIN")){
				   
				  salida.println(linea);  //guardo la línea con el retorno de carro
				   
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
