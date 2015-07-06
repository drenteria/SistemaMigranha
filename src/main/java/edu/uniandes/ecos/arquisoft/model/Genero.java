package edu.uniandes.ecos.arquisoft.model;

import edu.uniandes.ecos.arquisoft.persistence.PersistentEnum;

/**
 * Enumeración que representa el género de una persona
 * @author drenteria
 *
 */
public enum Genero implements PersistentEnum {
	NO_DEFINIDO (1, "No definido"),
	MASCULINO (2, "Hombre"),
	FEMENINO (3, "Mujer");
	
	private int id;
	
	private String nombreGenero;
	
	private Genero(int id, String nombre){
		this.setId(id);
		this.setNombreGenero(nombre);
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	public int getId() {
		return id;
	}

	public void setId(int idGenero) {
		this.id = idGenero;
	}
	
}
