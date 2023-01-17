package clases;

import java.util.Arrays;

public class Cerveza  extends Articulo implements InterfaceAlcoholico {
	private String origen;
	private String[] cereales = new String[2];
	private double gradosAlcohol;

	public boolean esFuerte() {
		if (gradosAlcohol > 13.5) {
			return (true);
		} else {
			return (false);
		}

	}

	public double calcularTasa( int volumenLitros) {
		if (esFuerte()) {
			return ((TASAA_BEBIDAS_FUERTES / 100) * volumenLitros);
		} else {
			return ((TASAA_BEBIDAS_SUABES / 100) * volumenLitros);
		}
	}
    public boolean saludable() {
    	boolean saludable = false;
    	if((getCereales()[0].equals("lúpulo"))||(cereales[1].equals("lúpulo"))) {
			saludable = true;}
    	return saludable;
    }
    
	
	public String toString() {
		return "origen=" + origen + ", cereales=" + Arrays.toString(cereales) + ", gradosAlcohol="
				+ gradosAlcohol + " ";
	}
	public void visualizararticulo() {
		System.out.println("Code="+getCode()+" Name="+getName()+" Mark="+getMark()+" Capacidad="+getCapacidadBotella()+" Precio="+getPrecio()+" Stock="+getStock()+ toString());
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String[] getCereales() {
		return cereales;
	}

	public void setCereales(String[] cereales) {
		this.cereales = cereales;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	

}
