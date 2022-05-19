package ficheroDeObjetos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LeerCuentasBancarias {
	/*
	 * Leer del fichero cuentas.dat todas las cuentas guardadas y mostrar su
	 * informaci�n por consola. Usaremos el flujo DataInputStream
	 */

	static final String RUTA = "files/cuentas.dat";

	public static void main(String[] args) {

		File fichero = null;
		// instanciamos el manejador del fichero
		try {
			fichero = new File(RUTA);
		} catch (Exception e) {
			// finalizamos la aplicaci�n
			e.printStackTrace();
			System.exit(1);
		}

		// instanciamos DataInputStream y recorremos el fichero
		try (DataInputStream dis = new DataInputStream ( new FileInputStream (fichero))) {
			
		
			
			String apellidos, nombre;
			int numCuenta;
			double saldo;
			
			//creo una lista de objetos Cuenta
			ArrayList<Cuenta> listaCuentas= new ArrayList<>();
			Cuenta unaCuenta;
			
			while (dis.available()>0) {
				//vamos leyendo los campos
				nombre= dis.readUTF(); 
				apellidos = dis.readUTF();
				numCuenta= dis.readInt();
				saldo = dis.readDouble();
				//creo el objeto cuenta
				unaCuenta= new Cuenta(numCuenta, nombre, apellidos, saldo);
				//lo agrego a la lista
				listaCuentas.add(unaCuenta);
				
			}
			//hemos terminado de leer el fichero
			
			System.out.println("N�mero de clientes  " + listaCuentas.size());
			
			for ( Cuenta miCuenta  : listaCuentas) {
				System.out.println(miCuenta.toString());
			}

			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
