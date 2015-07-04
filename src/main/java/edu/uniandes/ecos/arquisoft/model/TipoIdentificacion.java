package edu.uniandes.ecos.arquisoft.model;

/**
 * Clase que representa el tipo de identificación
 * de una persona
 * @author drenteria
 *
 */
public class TipoIdentificacion {

	private int idTipoID;
	
	private String nombreTipoID;
	
	private String abreviadoTipoID;
	
	public TipoIdentificacion(String nombre, String abreviado){
		this.nombreTipoID = nombre;
		this.abreviadoTipoID = abreviado;
	}

	public int getIdTipoID() {
		return idTipoID;
	}

	public void setIdTipoID(int idTipoID) {
		this.idTipoID = idTipoID;
	}

	public String getNombreTipoID() {
		return nombreTipoID;
	}

	public void setNombreTipoID(String nombreTipoID) {
		this.nombreTipoID = nombreTipoID;
	}

	public String getAbreviadoTipoID() {
		return abreviadoTipoID;
	}

	public void setAbreviadoTipoID(String abreviadoTipoID) {
		this.abreviadoTipoID = abreviadoTipoID;
	}
	
}
