package ar.edu.unlam.fifa;

import java.util.Objects;

public class Jugador {
    private int numeroCamiseta;
    private String nombre;
    private long precioCompra;



	public Jugador(int numeroCamiseta, String nombre, long precioCompra) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
    }

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//if (getClass() != obj.getClass())
		//	return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombre, other.nombre);
	}

    // Implementa getters y setters según sea necesario
    public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(long precioCompra) {
		this.precioCompra = precioCompra;
	}

}

