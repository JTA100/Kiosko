package ar.edu.unlam.fifa;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {
	
	private String nombre;
	private Set<Jugador> jugadores;
	
	public EquipoDeFutbol(String nombre) {
		
		this.nombre = nombre;
		this.jugadores = new HashSet<>();
		
	}



	/*
	 * La capacidad máxima de un equipo es 23. Cualquier intento de agregar más
	 * jugadores generará una excepción (CapacidadMaximaException). Además, no
	 * deberá permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {
		
		if(jugadores.size() >= 23 ) {
			throw new CapacidadMaximaException();
		}
		if (jugadores.contains(jugador) ) {
			throw new JugadorDuplicadoException(jugador.getNombre());
		}
		jugadores.add(jugador);

	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generará una excepción
	 * (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadoreInexistenteException{
		
		if(jugadores.contains(saliente)) {
			jugadores.remove(saliente);
			jugadores.add(entrante);
			return(true);
		}
		
		throw new JugadoreInexistenteException(saliente.getNombre());
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
        TreeSet<Jugador> jugadoresOrdenadosPorNombre = new TreeSet<>(
                Comparator.comparing(Jugador::getNombre));
        jugadoresOrdenadosPorNombre.addAll(jugadores);
        return jugadoresOrdenadosPorNombre;
	}
	

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
        TreeSet<Jugador> jugadoresOrdenadosPorPrecio = new TreeSet<>(
                Comparator.comparingLong(Jugador::getPrecioCompra));
        jugadoresOrdenadosPorPrecio.addAll(jugadores);
        return jugadoresOrdenadosPorPrecio;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
        TreeSet<Jugador> jugadoresOrdenadosPorCamiseta = new TreeSet<>(
                Comparator.comparingInt(Jugador::getNumeroCamiseta));
        jugadoresOrdenadosPorCamiseta.addAll(jugadores);
        return jugadoresOrdenadosPorCamiseta;
	}
	
	//// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}