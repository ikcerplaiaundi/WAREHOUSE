package clases;

public abstract class InterfaceAlcoholico {
	public static final double TASAA_BEBIDAS_FUERTES = 64.13;
	public static final double TASAA_BEBIDAS_SUABES = 38.48;
	
	public boolean esFuerte(double graduacion,boolean vino) {
		if(vino) {return (graduacion>13.5);}
		else {return (graduacion>7);}	
	}
	
	public double calcularTasa(double graduacion,boolean vino) {
		if(esFuerte(graduacion, vino)) {
			return TASAA_BEBIDAS_FUERTES;
		}else {return TASAA_BEBIDAS_SUABES;}
	}

}
