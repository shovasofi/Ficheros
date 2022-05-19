package ficheroDeObjetos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class AgregarCuenta {
	
	static final String RUTA= "ficheros/cuenta.txt";
	
	public static void main(String[] args) {
		
		File manejador= new File(RUTA); 
		
		try (Scanner entrada= new Scanner (System.in); 
				PrintWriter salida= new PrintWriter(new FileWriter(manejador,true))){
			
			
			Cuenta nuevaCuen = new Cuenta();
			System.out.format("%s%n%s","Introducir número de cuenta, apellido, nombre y saldo",
					">>>");
			
			nuevaCuen.setNumCuenta(entrada.nextInt());
			nuevaCuen.setApellidos(entrada.next());
			nuevaCuen.setNombre(entrada.next());
			nuevaCuen.setSaldo(entrada.nextDouble());
		
					
			//si todo es correcto, escribimos la nueva cuenta
			salida.format("%d  %s  %s  %f%n", nuevaCuen.getNumCuenta(),
							nuevaCuen.getApellidos(), nuevaCuen.getNombre(),
							nuevaCuen.getSaldo());
					
			
		} catch (FileNotFoundException e){
	    	System.out.println("El fichero que se ha indicado no existe");
		}catch (IOException e){
	    	System.out.println(e.getMessage());
		}
		//no necesitamos bloque finally, todo se cierra automáticamente
		
		//liberamos el objeto File
		manejador=null;
	    	
   }
}


