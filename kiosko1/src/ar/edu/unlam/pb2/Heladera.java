package ar.edu.unlam.pb2;

public class Heladera implements Electrodomestico, Producto {
	
	private Integer codigo;
	private String descripcion;
	private Boolean frost;
	private Integer garantia;
	private String marca;
	private Double precio;
	
	public Heladera(Integer codigo, String descripcion, Boolean frost, Integer garantia, String marca, Double precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.frost = frost;
		this.garantia = garantia;
		this.marca = marca;
		this.precio = precio;
	}

	@Override
	public Integer getGarantia() {
		return garantia;
	}
	@Override
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getfrost() {
		return frost;
	}

	public void setfrost(Boolean frost) {
		this.frost = frost;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

	public Boolean isNoFrost() {
		return frost;
	}

}
