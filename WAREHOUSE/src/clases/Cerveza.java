package clases;

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

	public double calcularTasa(double graduacion, int volumenLitros) {
		if (esFuerte()) {
			return ((TASAA_BEBIDAS_FUERTES / 100) * volumenLitros);
		} else {
			return ((TASAA_BEBIDAS_SUABES / 100) * volumenLitros);
		}
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
