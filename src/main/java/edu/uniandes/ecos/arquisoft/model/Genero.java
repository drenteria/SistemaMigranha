package edu.uniandes.ecos.arquisoft.model;

/**
 * Clase que representa el género de una persona
 * @author drenteria
 *
 */
public class Genero {
	
	private int idGenero;
	
	private String nombreGenero;

	public Genero(String nombreGenero){
		this.nombreGenero = nombreGenero;
	}
	
	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}
	
	

}
