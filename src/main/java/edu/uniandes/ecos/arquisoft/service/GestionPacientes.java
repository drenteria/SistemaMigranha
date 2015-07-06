package edu.uniandes.ecos.arquisoft.service;

import java.util.Date;
import java.util.List;

import edu.uniandes.ecos.arquisoft.model.Paciente;
import edu.uniandes.ecos.arquisoft.persistence.IPacienteDAO;
import edu.uniandes.ecos.arquisoft.persistence.PacienteDAO;

/**
 * Clase que efectúa la gestión de pacientes
 * @author drenteria
 *
 */
public class GestionPacientes {

	private IPacienteDAO pacienteDao;
	
	public GestionPacientes() {
		pacienteDao = new PacienteDAO();
	}
	
	public void registrarPaciente(Paciente nuevoPaciente){
		nuevoPaciente.setFechaRegistro(new Date());
		pacienteDao.guardarPaciente(nuevoPaciente);
	}
	
	public List<Paciente> listarPacientes(){
		return pacienteDao.listarTodos();
	}
	
	public Paciente buscarPaciente(int idPaciente){
		return (Paciente) pacienteDao.buscarPaciente(idPaciente);
	}
	
}
