package ar.edu.unlam.pb2;

public class Carne implements Comestible, Producto {
	

	private Integer codigo;
	private String descripcion;
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private Double kilo;
	private String marca;
	private Double precio;
	
	public Carne(Integer codigo, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double kilo,String marca, Double precio) {
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.kilo = kilo;
		this.marca = marca;
		this.precio = precio;
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

	public Double getKilo() {
		return kilo;
	}

	public void setKilo(Double kilo) {
		this.kilo = kilo;
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

	public void setFechaDeElaboracion(String fechaDeElaboracion) {
		this.fechaDeElaboracion = fechaDeElaboracion;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}



	@Override
	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

}
