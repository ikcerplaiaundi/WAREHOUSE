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
					cerveza.setName(partes[0]);
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
					vino.setName(partes[0]);
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
					refresco.setName(partes[0]);
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
			lectorFichero.close();
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

		for (int i = 0; lineaAlmacen.size() > i; i++) {
			if (lineaAlmacen.get(i).getCode() == codigoProducto) {
				System.out.println(lineaAlmacen.get(i).getPrecio() + " articulo" + lineaAlmacen.get(i).getName());
			}
		}
		return false;

	}

	public ArrayList<Articulo> stockJusto() {
		ArrayList<Articulo> lineaAlmacen = new ArrayList<Articulo>();

		for (int i = 0; this.lineaAlmacen.size() > i; i++) {
			if (this.lineaAlmacen.get(i).getStock() < 10) {
				lineaAlmacen.add(this.lineaAlmacen.get(i));
			}
		}
		return lineaAlmacen;
	}

	public Articulo articulo(String codigoProducto) {

		for (int i = 0; lineaAlmacen.size() > i; i++) {
			if (lineaAlmacen.get(i).getCode() == codigoProducto) {
				return lineaAlmacen.get(i);
			}

		}
		return null;

	}

	public boolean disponibilidad(int cantidad, String codigoProducto) {

		for (int i = 0; lineaAlmacen.size() > i; i++) {
			if ((lineaAlmacen.get(i).getCode() == codigoProducto) && (cantidad < lineaAlmacen.get(i).getStock())) {
				return true;
			}
		}
		return false;

	}

	public ArrayList<Articulo> equibalentes(Articulo articulo) {
		ArrayList<Articulo> lineaAlmacen = new ArrayList<Articulo>();
		for (int i = 0; this.lineaAlmacen.size() > i; i++) {
			if ((this.lineaAlmacen.get(i).getPrecio() - articulo.getPrecio() <= 0.2)
					&& (articulo.getPrecio() - this.lineaAlmacen.get(i).getPrecio() <= 0.2)) {
				lineaAlmacen.add(this.lineaAlmacen.get(i));
			}
		}
		return lineaAlmacen;
	}

	public ArrayList<Articulo> ordenarPorPrecio(String orden) {
		ArrayList<Articulo> lineaAlmacen1 = this.lineaAlmacen;
		ArrayList<Articulo> lineaAlmacen2 = new <Articulo>ArrayList();
		Articulo articuloaux = lineaAlmacen1.get(0);
		int j = 0;
		switch (orden) {
		case "ASC": {

			
			for (int o = 0; lineaAlmacen1.size() > o;) {
				j = 0;
				for (int i = 0; lineaAlmacen1.size() > i; i++) {

					if (articuloaux.getPrecio() < lineaAlmacen1.get(i).getPrecio()) {
						articuloaux = lineaAlmacen1.get(i);
						j = i;
					}
				}
				lineaAlmacen1.remove(j);
				lineaAlmacen2.add(articuloaux);
			}

		}
		case "DESC": {

			
			for (int o = 0; lineaAlmacen1.size() > o;) {
				j = 0;
				for (int i = 0; lineaAlmacen1.size() > i; i++) {

					if (articuloaux.getPrecio() > lineaAlmacen1.get(i).getPrecio()) {
						articuloaux = lineaAlmacen1.get(i);
						j = i;
					}
				}
				lineaAlmacen1.remove(j);
				lineaAlmacen2.add(articuloaux);
			}
		}
		default:
			lineaAlmacen2 = lineaAlmacen1;
		}
		return lineaAlmacen2;

	}

	public ArrayList<Articulo> ordenarPorStock(String orden) {
		ArrayList<Articulo> lineaAlmacen1 = this.lineaAlmacen;
		ArrayList<Articulo> lineaAlmacen2 = new <Articulo>ArrayList();
		Articulo articuloaux = lineaAlmacen1.get(0);
		int j = 0;
		switch (orden) {
		case "ASC": {

			
			for (int o = 0; lineaAlmacen1.size() > o;) {
				j = 0;
				for (int i = 0; lineaAlmacen1.size() > i; i++) {

					if (articuloaux.getStock() < lineaAlmacen1.get(i).getStock()) {
						articuloaux = lineaAlmacen1.get(i);
						j = i;
					}
				}
				lineaAlmacen1.remove(j);
				lineaAlmacen2.add(articuloaux);
			}
		}
		case "DESC": {

			
			for (int o = 0; lineaAlmacen1.size() > o;) {
				j = 0;
				for (int i = 0; lineaAlmacen1.size() > i; i++) {

					if (articuloaux.getStock() > lineaAlmacen1.get(i).getStock()) {
						articuloaux = lineaAlmacen1.get(i);
						j = i;
					}
				}

				lineaAlmacen1.remove(j);
				lineaAlmacen2.add(articuloaux);
			}
		}
		default:
			lineaAlmacen2 = lineaAlmacen1;
		}
		return lineaAlmacen2;
	}

}
