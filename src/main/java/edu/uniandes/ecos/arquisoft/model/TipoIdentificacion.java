package edu.uniandes.ecos.arquisoft.model;

import edu.uniandes.ecos.arquisoft.persistence.PersistentEnum;

/**
 * Clase que representa el tipo de identificación
 * de una persona
 * @author drenteria
 *
 */
<<<<<<< HEAD
public enum TipoIdentificacion implements PersistentEnum{
	
	CEDULA_CIUDADANIA (1, "Cedula Ciudadania", "CC"),
	CEDULA_EXTRANJERIA (2, "Cedula Extranjeria", "CE"),
	REGISTRO_CIVIL (3, "Registro Civil", "RC"),
	TARJETA_IDENTIDAD (4, "Tarjeta de Identidad", "TI"),
	NUIP (5, "Numero Unico Identificacion", "NU"),
	PASAPORTE (6, "Pasaporte", "PS"),
	PERMISO_ESPECIAL (7, "Permiso Especial", "PE");
	
	private int id;
	
	private String nombreTipoId;
	
	private String abreviaturaTipoId;

	private TipoIdentificacion(int id, String nombre, String abreviado){
		this.id = id;
		this.nombreTipoId = nombre;
		this.abreviaturaTipoId = abreviado;
	}

	public int getId() {
		return id;
	}

	public void setId(int idTipoId) {
		this.id = idTipoId;
	}

	public String getNombreTipoId() {
		return nombreTipoId;
	}

	public void setNombreTipoId(String nombreTipoId) {
		this.nombreTipoId = nombreTipoId;
	}

	public String getAbreviaturaTipoId() {
		return abreviaturaTipoId;
	}

	public void setAbreviaturaTipoId(String abreviaturaTipoId) {
		this.abreviaturaTipoId = abreviaturaTipoId;
	}
=======
public enum TipoIdentificacion {
	
	CEDULA_CIUDADANIA,
	CEDULA_EXTRANJERIA,
	REGISTRO_CIVIL,
	TARJETA_IDENTIDAD,
	NUIP,
	PASAPORTE,
	PERMISO_ESPECIAL;
>>>>>>> 401b283dca8437bfb8524e665b8b74bb810f9e96
	
}
