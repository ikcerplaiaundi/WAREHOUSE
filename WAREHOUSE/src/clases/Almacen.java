package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	public ArrayList<Articulo> lineaAlmacen = new ArrayList<Articulo>();

	public void caragarDatos(String url) {

		try {
			File file = new File(url);
			Scanner lectorFichero = new Scanner(file);
			String linea;
			int i = 0;
			while (lectorFichero.hasNext()) {
				linea = lectorFichero.nextLine();
				String[] partes = linea.split(";");
				String[] celerales = { partes[7], partes[8] };
				i++;
				switch (partes[0]) {
				case "cerveza": {

					Cerveza cerveza = new Cerveza();
					// comunes
					cerveza.setCode(partes[1]);
					cerveza.setMark(partes[2]);
					cerveza.setCapacidadBotella(Integer.parseInt(partes[3]));
					cerveza.setPrecio(Double.parseDouble(partes[4]));
					cerveza.setStock(Integer.parseInt(partes[5]));
					// alcohol
					cerveza.setGradosAlcohol(Double.parseDouble(partes[6]));
					cerveza.setOrigen(partes[7]);

					// propios
					cerveza.setCereales(celerales);

					// meter articulo nuevo
					lineaAlmacen.add(cerveza);
				}
				case "vino": {
					Vino vino = new Vino();
					// comunes
					vino.setCode(partes[1]);
					vino.setMark(partes[2]);
					vino.setCapacidadBotella(Integer.parseInt(partes[3]));
					vino.setPrecio(Double.parseDouble(partes[4]));
					vino.setStock(Integer.parseInt(partes[5]));
					// alcohol
					vino.setGradosAlcohol(Double.parseDouble(partes[6]));
					vino.setOrigen(partes[7]);
					// propios
					vino.setColor(partes[8]);
					vino.setAnio(Integer.parseInt(partes[9]));
					vino.setTipoDeUva(partes[9]);

					// meter articulo nuevo
					lineaAlmacen.add(vino);
				}
				case "refresco": {
					Refresco refresco = new Refresco();
					// comunes
					refresco.setCode(partes[1]);
					refresco.setMark(partes[2]);
					refresco.setCapacidadBotella(Integer.parseInt(partes[3]));
					refresco.setPrecio(Double.parseDouble(partes[4]));
					refresco.setStock(Integer.parseInt(partes[5]));
					// propios
					refresco.setSabor(partes[6]);
					refresco.setZumo(Boolean.parseBoolean(partes[7]));
					refresco.setGaseoso(Boolean.parseBoolean(partes[8]));
					refresco.setCantidadAzucar(Integer.parseInt(partes[9]));
					// meter articulo nuevo
					lineaAlmacen.add(refresco);
				}
				default:
					System.out.println("dato de mierda en almacen linea" + i);
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("carga del almacen fallido");
			e.printStackTrace();
		}

	}

	public Articulo elMasCaro() {
		double elMasCaro = 0;
		int i = 0;
		for (i = 0; lineaAlmacen.size() > i; i++) {
			if (lineaAlmacen.get(i).getPrecio() < elMasCaro) {
				elMasCaro = lineaAlmacen.get(i).getPrecio();
			}
		}
		return lineaAlmacen.get(i);
	}

	public double precio(String codigoProducto) {
		double precio = -1;
		for (int i = 0; lineaAlmacen.size() > i; i++) {
			if (lineaAlmacen.get(i).getCode() == codigoProducto) {
				precio = lineaAlmacen.get(i).getPrecio();
			}
		}
		return precio;
	}

	public boolean hayStock(String codigoProducto) {
		return false;

	}

	public ArrayList stockJusto() {

		return lineaAlmacen;
	}

	public Articulo articulo(String codigoProducto) {

		for (int i = 0; lineaAlmacen.size() > i; i++) {
			if (lineaAlmacen.get(i).getCode() == codigoProducto) {
				return lineaAlmacen.get(i);
			}
			
		}return null;

	}

}
