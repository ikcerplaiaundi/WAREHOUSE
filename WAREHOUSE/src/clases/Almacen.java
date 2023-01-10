package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	public void caragarDatos(String url) {
		ArrayList<Articulo> lineaAlmacen = new ArrayList<Articulo>();
		try {
			File file = new File(url);
			Scanner lectorFichero = new Scanner(file);
			String linea;

			while (lectorFichero.hasNext()) {
				linea = lectorFichero.nextLine();
				String[] partes = linea.split(";");

				switch (partes[0]) {
				case "cerveza": {
					
					Cerveza cerveza = new Cerveza();
					cerveza.setCode(partes[1]);
					cerveza.setMark(partes[2]);
					cerveza.setCapacidadBotella(Integer.parseInt(partes[3]) );
					cerveza.setPrecio(Double.parseDouble(partes[4]));
					cerveza.setStock(Integer.parseInt(partes[5]));
					
					
					lineaAlmacen.add(cerveza);
				}
				case "vino": {
					Vino vino = new Vino();
					vino.setCode(partes[1]);
					vino.setMark(partes[2]);
					vino.setCapacidadBotella(Integer.parseInt(partes[3]) );
					vino.setPrecio(Double.parseDouble(partes[4]));
					vino.setStock(Integer.parseInt(partes[5]));
					
					lineaAlmacen.add(vino);
				}
				case "refresco": {
					Refresco refresco = new Refresco();
					refresco.setCode(partes[1]);
					refresco.setMark(partes[2]);
					refresco.setCapacidadBotella(Integer.parseInt(partes[3]) );
					refresco.setPrecio(Double.parseDouble(partes[4]));
					refresco.setStock(Integer.parseInt(partes[5]));
					
					lineaAlmacen.add(refresco);
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + key);
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("carga del almacen fallido");
			e.printStackTrace();
		}

	}

	public Articulo elMasCaro() {
		return;
	}

	public double precio(String codigoProducto) {
		return 0;
	}

	public boolean hayStock(String codigoProducto) {
		return false;

	}

	public ArrayList stockJusto() {
		// return ArrayList
	}

	public articulo (String codigoProducto) {
		
	}

}
