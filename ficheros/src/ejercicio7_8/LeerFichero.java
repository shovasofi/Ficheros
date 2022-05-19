package ejercicio7_8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class LeerFichero {

	//atributos
	
	File ficheroEscritura;
	File ficheroLectura;
	

	TreeMap<String,Integer> diccionario;
	
	
	//constrcutor 
	public LeerFichero() {
	diccionario= new TreeMap<>();
	}
	
	//metodo para escribir  el fichero 
	public void escribirEnElFichero(File file,  TreeMap<String,
			Integer> diccio) throws Exception  ) {
	
		ficheroEscritura= new File(ruta);

		try( BufferedWriter br= new  BufferedWriter(new FileWriter(ficheroEscritura)) ){
			br.write(texto );
			br.newLine();
			
			
		}catch(IOException e) {
			
		}
		
		
	}
	
	public void leerFcihero() {
		
	}
	
	public void escribirEnElDiccionario() {
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String ruta="";
		String texto;
		
		System.out.println("Inserte el texto");
		texto=sc.nextLine();
		
		System.out.println("Inserte la ruta donde quiere guardar el texto y en que fichero");
		ruta=sc.nextLine().trim();
	}

	
	
}
