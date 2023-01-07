package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	public void caragarDatos(String url) {

		try {
			File file = new File(url);
			Scanner lectorFichero = new Scanner(file);
			String linea;
			String[] partes;

			while (lectorFichero.hasNext()) {
				linea = lectorFichero.nextLine();
				partes = linea.split(";");

				// aqui las partes
			}

		} catch (FileNotFoundException e) {
			System.out.println("fichero no encontrado");
			e.printStackTrace();
		}

	}
	
	public Articulo elMasCaro() {
		return ;
	}
	public double precio (String codigoProducto) {
		return 0;
	}
	public boolean hayStock(String codigoProducto) {
		return false;
		
	}
	public ArrayList stockJusto() {
		//return ArrayList
	}
	public articulo (String codigoProducto) {
		
	}
	
	
	
}
