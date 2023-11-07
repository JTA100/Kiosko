package ar.edu.unlam.fifa;

public class JugadoreInexistenteException extends Exception {
	public JugadoreInexistenteException(String nombre) {
		super("El jugador " + nombre + " no esta en el equipo");
	}

}
