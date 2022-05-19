package ejemplo;



import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

import java.nio.file.attribute.FileTime;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;



public class EjemploMetodosFiles {

	public static void main(String[] args) {
		
		//esta aplicación hace un backup de un fichero que se le pase por parámetro
		
		//objeto Scanner para preguntar por el fichero
		Scanner entrada= new Scanner(System.in);
						
	System.out.print("Introduce el fichero que quieres respaldar, con su ruta \n>>>");
						
	String fichero = entrada.nextLine().trim();

	
	
		try{
			
			Charset cs = StandardCharsets.UTF_8;
			Path source, target;
			source=Paths.get(fichero);
			// el fichero copia tiene el mismo nombre, pero con la extensión .bk
			target=Paths.get(fichero+".bk");
			 
			//borramos el fichero de backup, si existe
			System.out.println( Files.deleteIfExists(target) ? "Fichero Borrado": 
				"No existía el fichero");
			
			// Creamos el fichero copia. En este caso, no ejecutamos la orden
			//Files.createFile(target);
			
			// Copiamos origen en destino
			Files.copy(source, target);
			
	
			// Recuperamos información del fichero
			long size = Files.size(target);
			System.out.println("El tamaño del fichero es  :"+size);
			FileTime fTime = Files.getLastModifiedTime(target);
			System.out.println("Su timestamp de modificación es  "+
					fTime.to(TimeUnit.SECONDS));
			
			Map<String, ?> attrs = Files.readAttributes(target, "*");
			
			System.out.println("Atributos del fichero");
			Set<String> nomAtr= attrs.keySet();
			for (String at : nomAtr){
				System.out.format("%n %30s ---> %s", at,attrs.get(at));
			}
			
			// Methods to deal with file types
			System.out.println( "\n¿ES directorio?  "+Files.isDirectory(target));
			System.out.println( "¿ES enlace simbólico?  "+Files.isSymbolicLink(target));
			
			// Mostrar contenido de fichero de texto, línea a línea
			List<String> lines = Files.readAllLines(target, cs);
			 System.out.println("\nLíneas del fichero");
			for (String line: lines){
				System.out.println(line);
			}
			// Mostrar contenido de fichero de texto, byte a byte
			byte[] arrayb = Files.readAllBytes(target);
			
			 System.out.println("\nContenido binario\n");
			for (int i=0; i< arrayb.length; i++){
				System.out.print(arrayb[i]+" ");
			}
			
		} catch (IOException e){
			
			e.printStackTrace();
			
		}

	}

}
