package edu.uniandes.ecos.arquisoft.service;

import java.util.List;

import edu.uniandes.ecos.arquisoft.model.Paciente;
import edu.uniandes.ecos.arquisoft.persistence.PacienteDAO;

/**
 * Clase que efectúa la gestión de pacientes
 * @author drenteria
 *
 */
public class GestionPacientes {

	private PacienteDAO pacienteDao;
	
	public GestionPacientes() {
		pacienteDao = new PacienteDAO();
	}
	
	public void registrarPaciente(Paciente nuevoPaciente){
		pacienteDao.guardar(nuevoPaciente);
	}
	
	@SuppressWarnings("rawtypes")
	public List listarPacientes(){
		return pacienteDao.listarTodos();
	}
	
	public Paciente buscarPaciente(int idPaciente){
		return (Paciente) pacienteDao.buscar(idPaciente);
	}
	
}
