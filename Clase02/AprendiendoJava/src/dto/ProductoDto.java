package dto;

public class ProductoDto {

	private int id;
	private String nombre;
	private int stock;
	private double precio;
	private boolean activo;

	public ProductoDto() {
		this.id = 5000;
		this.nombre = "Zandia";
		this.precio = 6.0;
		this.stock = 4000;
		this.activo = true;
		System.out.println("Objeto creado.");
	}


	@Override
	protected void finalize() throws Throwable {
		System.err.println("Chau objeto.");
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
}
