package ar.edu.unlam.fifa;

public class JugadorDuplicadoException extends Exception {
    public JugadorDuplicadoException(String nombre) {
        super("El jugador " + nombre + " ya está en el equipo.");
    }
}
