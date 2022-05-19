package ejercicio111213;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import ficheroDeObjetos.CuentaSerie;

public class LeerPuntosDeFichero {

	
	//ejercicio 12
	
	//static final String RUTA="/datos/usuarios/alumnos/shova.shrestha/eclipse-workspace/ficheros/src/fichero/punto.dat";
	
			public static List<Punto> leerPuntosDeFichero(String ruta){
				
				File fichero = null;
				//creo una lista de objetos Cuenta
				List<Punto> listaPuntos= new ArrayList<Punto>();
				// instanciamos el manejador del fichero
				try {
					fichero = new File(ruta);
				} catch (Exception e) {
					// finalizamos la aplicaci�n
					e.printStackTrace();
					System.exit(1);
				}
				
				// instanciamos DataInputStream y recorremos el fichero
				try (ObjectInputStream leer = new ObjectInputStream (new FileInputStream(ruta))) {
					
			
					
					
					Punto unPunto;
					
					try {
						//hago un bucle infinito para leer
						while (true) {
							//vamos leyendo los campos
							unPunto=(Punto)leer.readObject();
							//lo agrego a la lista
							listaPuntos.add(unPunto);	
							
						}
					} catch (EOFException e) {
						//hemos terminado de leer el fichero
						System.out.println("N�mero de puntos   " + listaPuntos.size());
						
						for ( Punto miPunto  : listaPuntos) {
							System.out.println(miPunto.toString());
						}
					}
					
			
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				return listaPuntos;
	
				
			}
}
