package FicherosTexto;

import java.io.*;
import java.util.Scanner;

public class EscribirFichTexto {
	
  public static void main(String[] args) throws IOException {
	  
	//objeto Scanner para preguntar por el fichero
	Scanner entrada= new Scanner(System.in);
						
	System.out.println("Introduce el fichero donde vas a escribir, con su ruta \n>>>");
						
	String nombre = entrada.nextLine();
   File fichero = new File(nombre);//declara fichero    
   FileWriter fic=null;
   
   try{
	   String linea;
	   fic = new FileWriter(fichero,true); //crear el flujo de salida       
	   System.out.println("Escribe la línea que deseas escribir, o escribe 'FIN' para terminar");
	   linea = entrada.nextLine().trim();
	   while (!linea.equalsIgnoreCase("FIN")){
		   fic.write(linea+"\n");
		   System.out.println("Escibe la línea que deseas escribir, o escribe 'FIN' para terminar");
		   linea = entrada.nextLine().trim();
	  }//fin del bucle
   }catch (IOException e){
	    	System.out.println(e.getMessage());
	    	
   } finally {
	    	fic.close(); //cerrar fichero  
	    	entrada.close();
 } 
   
  }// fin del main
}
