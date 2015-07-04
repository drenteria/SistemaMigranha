package edu.uniandes.ecos.arquisoft.model;

import java.util.Date;

/**
 * Clase que representa a un paciente
 * que se registra en el sistema
 * @author drenteria
 *
 */
public class Paciente {
	
	private int idPaciente;
	
	private String nombresPaciente;
	
	private String apellidosPaciente;
	
	private long docIdentificacion;
	
	private Date fechaNacimiento;
	
	private String direccionResidencia;
	
	private String telefonoFijo;
	
	private String telefonoMovil;
	
	private Date fechaRegistro;
	
	public Paciente(String nombres, String apellidos,
			long numDocumento, Date fechaNacimiento, String direccion,
			String telFijo, String telMovil){
		this.nombresPaciente = nombres;
		this.apellidosPaciente = apellidos;
		this.docIdentificacion = numDocumento;
		this.fechaNacimiento = fechaNacimiento;
		this.direccionResidencia = direccion;
		this.telefonoFijo = telFijo;
		this.telefonoMovil = telMovil;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombresPaciente() {
		return nombresPaciente;
	}

	public void setNombresPaciente(String nombresPaciente) {
		this.nombresPaciente = nombresPaciente;
	}

	public String getApellidosPaciente() {
		return apellidosPaciente;
	}

	public void setApellidosPaciente(String apellidosPaciente) {
		this.apellidosPaciente = apellidosPaciente;
	}

	public long getDocIdentificacion() {
		return docIdentificacion;
	}

	public void setDocIdentificacion(long docIdentificacion) {
		this.docIdentificacion = docIdentificacion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccionResidencia() {
		return direccionResidencia;
	}

	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
