package ficheroDeObjetos;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AgregarCuentaBancaria {
	
	
	/*
	 * Leer los campos/informaci�n para crear una Cuenta nueva usando un objeto Scanner
	 * Guardar la info de la nueva en un fichero binario cuentas.dat
	 * Usando el flujo DataOutputStream
	
	 */
	
	static final String RUTA="files/cuentas.dat";

	public static void main(String[] args) {
		
		//objeto Scanner para leer de teclado
		Scanner sc= new Scanner(System.in);
		
		//pedimos la informaci�n por teclado para escribir una nueva cuenta

		System.out.println("Introduce Nombre del propietario de la cuenta");
		String nombre = sc.nextLine();

		System.out.println("Introduce Apellido del propietario de la cuenta");
		String apellido = sc.nextLine();

		System.out.println("Introduce el nmero de cuenta");
		int numCuenta = sc.nextInt();

		System.out.println("Introduce el saldo inicial de la cuneta");
		double saldo = sc.nextDouble();
		
		File fichero=null;
		//instanciamos el manejador del fichero
		try {
			fichero = new File (RUTA);
		} catch (Exception e) {
			//finalizamos la aplicaci�n
			e.printStackTrace();
			System.exit(1);
		} 
		
		try (DataOutputStream dos=new DataOutputStream ( new FileOutputStream(fichero,true))){
			
			dos.writeUTF(nombre);
			dos.writeUTF(apellido);
			dos.writeInt(numCuenta);
			dos.writeDouble(saldo);
			System.out.println(" Se ha dado de alta una cuenta nueva con n�mero  "+numCuenta);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//cierro el objeto Scanner
			sc.close();
		}
		
		

	}

}
