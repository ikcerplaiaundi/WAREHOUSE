package clases;

import java.util.Date;

public class Factura {
	public static int iva =21;
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;
	
	public void addLinea(LineaFactura lineaFactura) {
		
	}
	public void eliminarLinea(LineaFactura lineaFactura) {
		
	}
	public double precioTotal(int cantidad) {
		//precio*cantidad?
		return 0;
	}
	public void  mostrarEnPantalla() {
		
	}
	public void guardarEnFichero() {
		
	}
}
