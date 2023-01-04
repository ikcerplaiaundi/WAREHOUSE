package clases;

public abstract class InterfaceAlcoholico {// ceveza o vino por lo que se necesita un boolean que indique si es un vino
											
	public static final double TASAA_BEBIDAS_FUERTES = 64.13;
	public static final double TASAA_BEBIDAS_SUABES = 38.48;
	boolean vino;
	//si me dice que es un vino lo sera, si no, asume que no lo es
	public InterfaceAlcoholico(boolean vino) {
			this.vino = vino;
	}
	public InterfaceAlcoholico() {
		this.vino = false;
	}

	public boolean esFuerte(double graduacion) {
		if (vino) {
			return (graduacion > 13.5);
		} else {
			return (graduacion > 7);
		}
	}

	public double calcularTasa(double graduacion,int volumenLitros) {
		if (esFuerte(graduacion)) {
			return ((TASAA_BEBIDAS_FUERTES/100)*volumenLitros);
		} else {
			return ((TASAA_BEBIDAS_SUABES/100)*volumenLitros);
		}
	}

}
