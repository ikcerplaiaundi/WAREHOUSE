package clases;

public abstract class Articulo {
	private String code;
	private String name;
	private String mark;
	private int capacidadBotella;
	private double precio;
	private int stock;

	public void incrementarStock(int cantidad) {
		stock+=cantidad;
	}

	public void disminuirStock(int cantidad) {
		stock-=cantidad;
	}

	public void visualizararticulo() {
		// TODO Auto-generated method stub
	}

	public boolean saludable() {
		return false;
	}

	public double precioTotal(int cantidad) {
		// TODO Auto-generated method stub	
		return 0;
		}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getCapacidadBotella() {
		return capacidadBotella;
	}

	public void setCapacidadBotella(int capacidadBotella) {
		this.capacidadBotella = capacidadBotella;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
