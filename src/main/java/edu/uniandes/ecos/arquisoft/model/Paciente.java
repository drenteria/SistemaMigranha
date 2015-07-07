package edu.uniandes.ecos.arquisoft.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que representa a un paciente
 * que se registra en el sistema
 * @author drenteria
 *
 */
@XmlRootElement(name="paciente")
@XmlAccessorType(XmlAccessType.NONE)
public class Paciente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@XmlAttribute
	private int idPaciente;
	
	@XmlAttribute
	private String nombresPaciente;
	
	@XmlAttribute
	private String apellidosPaciente;
	
	@XmlAttribute
	private long docIdentificacion;
	
	@XmlAttribute
	private Date fechaNacimiento;
	
	@XmlAttribute
	private String direccionResidencia;
	
	@XmlAttribute
	private String telefonoFijo;
	
	@XmlAttribute
	private String telefonoMovil;
	
	@XmlAttribute
	private Date fechaRegistro;
	
	private Genero generoPaciente;
	
	@XmlAttribute
	private TipoIdentificacion tipoIdPaciente;
	
	public Paciente(){
		nombresPaciente = "Nombre";
		apellidosPaciente = "Apellido";
		docIdentificacion = 0L;
		fechaNacimiento = null;
		direccionResidencia = "Cl Busquela Cr Encuentrela";
		telefonoFijo = "0";
		telefonoMovil = "0";
		fechaRegistro = null;
	}
	
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

	public Genero getGeneroPaciente() {
		return generoPaciente;
	}

	public void setGeneroPaciente(Genero generoPaciente) {
		this.generoPaciente = generoPaciente;
	}

	public TipoIdentificacion getTipoIdPaciente() {
		return tipoIdPaciente;
	}

	public void setTipoIdPaciente(TipoIdentificacion tipoIdPaciente) {
		this.tipoIdPaciente = tipoIdPaciente;
	}

}