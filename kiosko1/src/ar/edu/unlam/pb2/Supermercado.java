package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas; // Identificador del n�mero de venta

	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productosExistentes = new HashSet<>();
		this.productosDisponibles = new ArrayList<>();
		this.ventasRealizadas = new HashMap<>();
		this.contadorDeVentas = 0;
	}

	// public void ingresarProducto(Producto nuevo) {
	// productosExistentes.add(nuevo);
	// productosDisponibles.add(nuevo);
	// }

	public void ingresarProducto(Producto nuevo) {
		if (nuevo instanceof Galletitas || nuevo instanceof Carne || nuevo instanceof Televisor
				|| nuevo instanceof Heladera || nuevo instanceof Remera || nuevo instanceof Zapatilla) {
			this.productosDisponibles.add(nuevo);
			this.productosExistentes.add(nuevo);
		}
	}

	public Set<Producto> getOfertaDeProductos() {
		return productosExistentes;
	}

	public Integer getStock(Integer codigo) throws ProductoInexistente {
		Integer stock = 0;
		Boolean existe = productoExiste(codigo);

		if (existe == true) {
			for (Producto producto : this.productosExistentes) {
				if (producto.getCodigo().equals(codigo)) {
					stock++;
				}
			}

		}
		return stock;
	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		for (Producto producto : this.productosExistentes) {
			if (producto.getCodigo().equals(codigoDeProducto)) {
				return true;
			}
		}
		throw new ProductoInexistente();
	}

	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		for (Producto producto : this.productosDisponibles) {
			if (producto.getCodigo().equals(codigoDeProducto)) {
				productosDisponibles.remove(producto);
				return producto;
			}
		}
		throw new ProductoSinStock();
	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en funci�n de su n�mero identificatorio
		for (Map.Entry<Integer, Venta> entry : this.ventasRealizadas.entrySet()) {
			Integer key = entry.getKey();
			Venta val = entry.getValue();
			if (key.equals(nueroDeVenta)) {
				return val;
			}

		}
		return null;
	}
	

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		Venta venta = getVenta(numeroDeVenta);
		
		Boolean existe = productoExiste(codigoDeProducto);
		if(existe = true && venta != null) {
			Producto producto = getProductoPorCodigo(codigoDeProducto);
			venta.getCarritoDeCompra().add(producto);
			
		}
		
		
	}

}
