package ar.edu.unlam.pb2;

public class Televisor implements Electrodomestico, Producto {
	
	private Integer codigo;
	private String descripcion;
	private Integer pulgadas;
	private Integer garantia;
	private String marca;
	private Double precio;

	public Televisor(Integer codigo, String descripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.pulgadas = pulgadas;
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

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
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

}
