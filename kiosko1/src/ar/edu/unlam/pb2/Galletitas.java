package ar.edu.unlam.pb2;

public class Galletitas implements Comestible, Producto{
	
	private Integer codigo;
	private String descripcion;
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private String marca;
	private Double precio;

	public Galletitas(Integer codigo, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, String marca, Double precio) {
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
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
	@Override
	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	public void setFechaDeElaboracion(String fechaDeElaboracion) {
		this.fechaDeElaboracion = fechaDeElaboracion;
	}
	@Override
	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	
	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
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

}
