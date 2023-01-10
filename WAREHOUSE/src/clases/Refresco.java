package clases;

public class Refresco extends Articulo{
private String sabor;
private boolean zumo;
private boolean gaseoso;
private int cantidadAzucar=0; 

public void visualizarPropiedades() {
	if(zumo) {System.out.println("es un zumo ");}
	if(gaseoso) {System.out.print("con gas");}
	System.out.println("sabor "+sabor+"cantidadAzucar "+cantidadAzucar+"gr");
	
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

}
