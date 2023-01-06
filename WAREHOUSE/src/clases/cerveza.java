package clases;

public class cerveza extends InterfaceAlcoholico{
private String origen;
private String[] cereales = new String[2];
private double gradosAlcohol;
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
