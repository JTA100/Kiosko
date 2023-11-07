package ar.edu.unlam.fifa;

public class CapacidadMaximaException extends Exception {
	public CapacidadMaximaException() {
		super("El equipo ha alcanzado su capacidad maxima (23 jugadores)");
		}
}
