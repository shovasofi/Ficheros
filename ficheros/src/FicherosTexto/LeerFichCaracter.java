package FicherosTexto;

import java.io.*;
import java.util.Scanner;

public class LeerFichCaracter {
  public static void main(String[] args)throws IOException {
	  
	//objeto Scanner para preguntar por el fichero
	Scanner entrada= new Scanner(System.in);
					
	System.out.println("Introduce el fichero que deseas leer, con su ruta \n>>>");
					
	String nombre = entrada.nextLine();
    File fichero = new  File(nombre);
                
    FileReader fic=null;

    try{
    	int i;
    	fic = new FileReader(fichero); //crear el flujo de entrada  
	    while (( i = fic.read()) != -1){//se va leyendo el fichero carácter a carácter
	      System.out.println( (char)i);
	    }
    } catch (IOException e){
    	System.out.println(e.getMessage());
    	
    } finally {
    	fic.close(); //cerrar fichero  
    	entrada.close();
    	
    } 
 
  }//fin del main
}