package edu.uniandes.ecos.arquisoft.view;

import java.sql.Date;

import edu.uniandes.ecos.arquisoft.model.Genero;
import edu.uniandes.ecos.arquisoft.model.Paciente;
import edu.uniandes.ecos.arquisoft.model.TipoIdentificacion;
import edu.uniandes.ecos.arquisoft.service.GestionPacientes;

public class ConsoleView {

	public static void main(String[] args) {
		try{
			Paciente elPaciente = new Paciente();
			elPaciente.setNombresPaciente("Plutarco");
			elPaciente.setApellidosPaciente("Chinome");
			elPaciente.setDocIdentificacion(Long.valueOf("1026263068"));
			elPaciente.setDireccionResidencia("Kr 78K 40S 93 In 15 Ap 203");
			elPaciente.setTelefonoFijo("+5714537964");
			elPaciente.setTelefonoMovil("+573012649514");
			elPaciente.setFechaNacimiento(Date.valueOf("1985-05-07"));
			elPaciente.setGeneroPaciente(Genero.MASCULINO);
			elPaciente.setTipoIdPaciente(TipoIdentificacion.CEDULA_CIUDADANIA);
			
			GestionPacientes gestorPaciente = new GestionPacientes();
			gestorPaciente.registrarPaciente(elPaciente);
		}
		catch (Exception ex){
			ex.printStackTrace();
			System.exit(1);
		}
		
	}

}
