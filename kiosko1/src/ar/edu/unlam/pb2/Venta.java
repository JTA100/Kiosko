package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Venta {
	
	private Integer dniDelComprador;
	private String nombreDelComprador;
	private Double importe;
	private ArrayList<Producto> carritoDeCompra;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		
		this.dniDelComprador = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
		this.importe = 0.0;
		this.setCarritoDeCompra(new ArrayList<>());
		
	}

	public Integer getDniDelComprador() {
		return dniDelComprador;
	}

	public void setDniDelComprador(Integer dniDelComprador) {
		this.dniDelComprador = dniDelComprador;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}

	public ArrayList<Producto> getCarritoDeCompra() {
		return carritoDeCompra;
	}

	public void setCarritoDeCompra(ArrayList<Producto> carritoDeCompra) {
		this.carritoDeCompra = carritoDeCompra;
	}

	public Double getImporte() {
		
		for(Producto producto : this.carritoDeCompra) {
			if(producto instanceof Galletitas) {
				importe += ((Galletitas) producto).getPrecio();
			}
			if(producto instanceof Carne) {
				importe += ((Carne) producto).getPrecio();
			}
			if(producto instanceof Televisor) {
				importe += ((Televisor) producto).getPrecio();
			}
			if(producto instanceof Heladera) {
				importe += ((Heladera) producto).getPrecio();
			}
			if(producto instanceof Remera) {
				importe += ((Remera) producto).getPrecio();
			}
			if(producto instanceof Zapatilla) {
				importe += ((Zapatilla) producto).getPrecio();
			}
		}
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	

}
