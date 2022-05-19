package ejemplo;

import java.io.File;
import java.util.Scanner;

public class VerInfoFichero {
	
	public static void main(String[] args) {
		
		//objeto Scanner para preguntar por el fichero
		Scanner entrada= new Scanner(System.in);
				
		System.out.println("Introduce el fichero que deseas consultar, con su ruta \n>>>");
				
		String fichero = entrada.nextLine();
	
		 System.out.println("INFORMACIÓN SOBRE EL FICHERO:");
		 File f = new File(fichero);  
		  if(f.exists()){
		        System.out.println("Nombre del fichero  : "+f.getName());
		        System.out.println("Ruta                : "+f.getPath());
		        System.out.println("Ruta absoluta       : "+f.getAbsolutePath());
		        System.out.println("Se puede leer       : "+f.canRead());
		        System.out.println("Se puede escribir   : "+f.canWrite());
		        System.out.println("Tamaño              : "+f.length());
				System.out.println("Es un directorio    : "+f.isDirectory()); 
				System.out.println("Es un fichero       : "+f.isFile());
				System.out.println("Nombre del directorio padre: "+f.getParent());
		  } else{
			  System.out.printf("%n El fichero  %s no existe", fichero);
		  }
	
		//al final cerramos el escáner
		entrada.close();
	} // fin de main()			  

}
