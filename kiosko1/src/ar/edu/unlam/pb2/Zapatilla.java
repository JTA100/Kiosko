package ar.edu.unlam.pb2;

public class Zapatilla implements Indumentaria, Producto {
	
	private Integer codigo;
	private String Descripcion;
	private String talle;
	private String Marca;
	private Double precio;
	private String color;

	public Zapatilla(Integer codigo, String Descripcion, String talle, String marca, String color, Double precio) {
		this.codigo = codigo;
		this.Descripcion = Descripcion;
		this.talle = talle;
		this.Marca = marca;
		this.precio = precio;
		this.color = color;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	@Override
	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
