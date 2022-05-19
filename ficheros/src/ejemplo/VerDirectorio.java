package ejemplo;
import java.io.*;
import java.util.Scanner;

public class VerDirectorio {

	public static void main(String[] args) {
		
		//objeto Scanner para preguntar por el directorio
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el directorio que deseas listar \n>>>");
		
		String dir = entrada.nextLine();
		//si se introduce vacío, se toma el actual:
		if (dir.trim().length()==0){
			dir=".";
		}
		
		//creamos un objeto File con la ruta al directorio pedido

		try{
			File f = new File(dir);
			
			//recuperamos todos sus ficheros
			File[] listaficheros= f.listFiles();		
			System.out.printf("Ficheros en el directorio : %d %n", listaficheros.length);
			for (int i = 0; i < listaficheros.length; i++) {
				File f2 = listaficheros[i];
				System.out.printf("Nombre: %s, Tipo: %s, Tamaño:  %d %n", 
						f2.getName(), f2.isFile()?"Fichero":"Directorio",f2.isFile()?f2.length():-1);
			}
		} catch (Exception e){
			System.out.printf("%n El directorio  %s no existe", dir);
		} finally{
			//liberamos el escaner
			entrada.close();
		}
		

	}

}
