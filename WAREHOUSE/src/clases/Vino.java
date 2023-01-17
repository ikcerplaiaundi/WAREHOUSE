package clases;

public class Vino extends Articulo implements InterfaceAlcoholico {


//declaraciones
	private String color;
	private String origen;
	private int anio;
	private String tipoDeUva;
	private double gradosAlcohol;

//set get
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getTipoDeUva() {
		return tipoDeUva;
	}

	public void setTipoDeUva(String tipoDeUva) {
		this.tipoDeUva = tipoDeUva;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	
	public String toString() {
		return "color=" + color + ", origen=" + origen + ", anio=" + anio + ", tipoDeUva=" + tipoDeUva
				+ ", gradosAlcohol=" + gradosAlcohol + " ";
	}
	public void visualizararticulo() {
		System.out.println("Code="+getCode()+" Name="+getName()+" Mark="+getMark()+" Capacidad="+getCapacidadBotella()+" Precio="+getPrecio()+" Stock="+getStock()+ toString());
	}
	public boolean esFuerte() {
		if (this.gradosAlcohol > 7) {
			return (true);
		} else {
			return (false);
		}

	}

	public double calcularTasa(double graduacion, int volumenLitros) {
		if (esFuerte()) {
			return ((TASAA_BEBIDAS_FUERTES / 100) * volumenLitros);
		} else {
			return ((TASAA_BEBIDAS_SUABES / 100) * volumenLitros);
		}
	}
	public boolean saludable() {
    	boolean saludable = false;
    	if(origen.equals("navarra")) {
			saludable = true;}
    	return saludable;
    }
	

}
