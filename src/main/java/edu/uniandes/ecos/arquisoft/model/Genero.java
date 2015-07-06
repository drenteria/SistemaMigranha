package edu.uniandes.ecos.arquisoft.model;

/**
 * Enumeración que representa el género de una persona
 * @author drenteria
 *
 */
public enum Genero {
	NO_DEFINIDO (1, "No definido"),
	MASCULINO (2, "Hombre"),
	FEMENINO (3, "Mujer");
	
	private int idGenero;
	
	private String nombreGenero;
	
	private Genero(int id, String nombre){
		this.setIdGenero(id);
		this.setNombreGenero(nombre);
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	
}
