package ficheroDeObjetos;

import java.io.File;

import java.util.Scanner;

public class LeerCuenta {

	static final String RUTA = "ficheros/cuenta.txt";

	public static void main(String[] args) {

		File manejador = new File(RUTA);

		try (Scanner entrada = new Scanner(manejador)) {

			Cuenta nuevaCuen = new Cuenta();

			System.out.format("%n%-10s%-40s%-40s%10s%n", "Cuenta", "Apellido", "Nombre", "Saldo");

			// leemos mientras haya líneas en el fichero
			int leidos = 0;
			while (entrada.hasNext()) {
				// leemos el registro del fichero
				nuevaCuen.setNumCuenta(entrada.nextInt());
				nuevaCuen.setApellidos(entrada.next());
				nuevaCuen.setNombre(entrada.next());
				nuevaCuen.setSaldo(entrada.nextDouble());

				// y lo imprimimos por pantalla
				System.out.format("%-10d%-40s%-40s%10.2f%n", nuevaCuen.getNumCuenta(), nuevaCuen.getApellidos(),
						nuevaCuen.getNombre(), nuevaCuen.getSaldo());
				leidos++;

			} // fin del fichero de Cuentas
			System.out.println("\n\n ********** Cuentas leídas :" + leidos);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// no necesitamos bloque finally, todo se cierra automáticamente

		// liberamos el objeto File
		manejador = null;

	}

}
