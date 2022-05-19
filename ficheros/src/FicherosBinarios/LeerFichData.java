package FicherosBinarios;

import java.io.*;

public class LeerFichData {
    public static void main(String[] args) throws IOException {
	File fichero = new File("files/FichData.dat");
	
	int contador=0;
	try (	DataInputStream dataIS = new DataInputStream(
		new FileInputStream(fichero));) {
		
		// campos que se van a ir leyendo del fichero
		String n;
		int e;
		
	    // recorremos el fichero usando un bucle "infinito"
	    // al llegar al final, se producirá la excepción EOFException
	    while (true) {
			n = dataIS.readUTF(); // recupera el nombre
			e = dataIS.readInt(); // recupera la edad
			System.out.println("Nombre: " + n + ", edad: " + e);
			contador++;
	    }

	} catch (EOFException eo) {
	    System.out.format("%nSe han leido correctamente %d   registros",
			contador);
	

	

    }
}
    
}
