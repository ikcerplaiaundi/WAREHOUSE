package clases;

public class Refresco {
private String sabor;
private boolean zumo;
private int cantidadAzucar=0; 

public void visualizarPropiedades() {
	System.out.println("sabor "+sabor+"cantidadAzucar "+cantidadAzucar+"gr");
}

public boolean esSaludable() {
	//Un refresco es saludable si tiene menos de 20gr de azúcar.
	if(cantidadAzucar<20) {return true;}else {return false;}
	
}

public boolean isZumo() {
	return zumo;
}

public void setZumo(boolean zumo) {
	this.zumo = zumo;
}

}
