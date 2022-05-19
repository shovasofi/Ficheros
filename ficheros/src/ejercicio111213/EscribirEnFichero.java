package ejercicio111213;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import ficheroDeObjetos.Cuenta;

public class EscribirEnFichero {

	// metodo de escribir un punto en el Fichero

	//static final String RUTA="/datos/usuarios/alumnos/shova.shrestha/eclipse-workspace/ficheros/src/fichero/punto.dat";
	public static void escribirEnFichero(List<Punto> Ip, String ruta) {
		
		File fichero=null;
		//instanciamos el manejador del fichero
		try {
			fichero = new File (ruta);
		} catch (Exception e) {
			//finalizamos la aplicaci�n
			e.printStackTrace();
			System.exit(1);
		}
		
		
		try (ObjectOutputStream escribir= new ObjectOutputStream(new FileOutputStream(ruta))){
			//instancio la cuenta 
			//miPunto= new Punto(coordX,coordY,color);
			//la guardo en el fichero
		
			for(int i=0; i<Ip.size(); i++) {
				escribir.writeObject(Ip.get(i));
			}
			
			 
		
			//System.out.println(" ");
			
		} catch (IllegalArgumentException e) {
			//fall� una de las validaciones para crear la cuenta
			System.out.println(e.getMessage()); 
		}
			
		catch (IOException e) {
			e.printStackTrace();
		}
				
				
			}

}
