package clases;

public abstract class Refresco extends Articulo{
private String sabor;
private boolean zumo;
private boolean gaseoso;
private int cantidadAzucar=0; 

public void visualizarPropiedades() {
	if(zumo) {System.out.println("es un zumo ");}
	if(gaseoso) {System.out.print("con gas");}
	System.out.println("sabor "+sabor+"cantidadAzucar "+cantidadAzucar+"gr");
	
}


public String toString() {
	return "sabor=" + sabor + ", zumo=" + zumo + ", gaseoso=" + gaseoso + ", cantidadAzucar=" + cantidadAzucar
			+ " ";
}

//get-set all
public String getSabor() {
	return sabor;
}

public void setSabor(String sabor) {
	this.sabor = sabor;
}

public int getCantidadAzucar() {
	return cantidadAzucar;
}

public void setCantidadAzucar(int cantidadAzucar) {
	this.cantidadAzucar = cantidadAzucar;
}

public boolean getZumo() {
	return zumo;
}

public void setZumo(boolean zumo) {
	this.zumo = zumo;
}

public boolean getGaseoso() {
	return gaseoso;
}

public void setGaseoso(boolean gaseoso) {
	this.gaseoso = gaseoso;
}
public boolean saludable() {
	boolean saludable = false;
	if(cantidadAzucar<20) {
		saludable = true;}
	return saludable;
}
public void visualizararticulo() {
	System.out.println("Code="+getCode()+" Name="+getName()+" Mark="+getMark()+" Capacidad="+getCapacidadBotella()+" Precio="+getPrecio()+" Stock="+getStock()+ toString());
}

}
