package edu.uniandes.ecos.arquisoft.persistence;

import java.util.List;

import edu.uniandes.ecos.arquisoft.model.Paciente;

public interface IPacienteDAO {
	
	public boolean guardarPaciente(Paciente elPaciente);
	
	public List<Paciente> listarTodos();
	
	public Paciente buscarPaciente(int idPaciente);
}
