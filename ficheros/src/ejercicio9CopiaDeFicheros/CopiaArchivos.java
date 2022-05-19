package ejercicio9CopiaDeFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopiaArchivos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		File fichero_leer = null;
		File fichero_escribir = null;
		
		//leer la ruta
		String ruta,nombre_org,nombre_copia;
		
	
		System.out.println("Inserte la ruta  del fichero");
		ruta=sc.nextLine();
		System.out.println("Inserte el nombre del fichero");
		nombre_org=sc.nextLine();
		System.out.println("Inserte el nombre del fichero copia");
		nombre_copia=sc.nextLine();
		
		try {
			fichero_leer= new File(ruta + "/" + nombre_org);
			fichero_escribir= new File(ruta+ "/" + nombre_copia);
		}catch(Exception e) {
			System.out.println("La ruta, nombre origen o nombre copia son errorneas, no se ha podido abrir el fichero");
			System.exit(1);
		}
	
		
		try(
				FileInputStream fis = new FileInputStream (fichero_leer );
				FileOutputStream fos = new FileOutputStream(  fichero_escribir);){
		
			int unByte;

			unByte= fis.read();
			while ( unByte != -1){ 

			//la marca de fin de fichero es -1
			fos.write(unByte);
			unByte= fis.read();

			}
			System.out.println("Copia realizada correctamente");
			fis. close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
