/*
 Copyright (c) 2010 - 2030 by ACI Worldwide Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

package edu.uniandes.ecos.arquisoft.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.uniandes.ecos.arquisoft.model.Paciente;
import edu.uniandes.ecos.arquisoft.service.GestionPacientes;

/**
 * Clase que se encarga de efectuar los llamados para listar los pacientes
 * via servicios REST
 *
 */
@RestController
public class ControladorRestPaciente
{
	
	GestionPacientes servicioGestionPacientes;
	
	public ControladorRestPaciente() {
		servicioGestionPacientes = new GestionPacientes();
	}
	
	@RequestMapping(name="/listadoPacientes", method=RequestMethod.GET)
	public List<Paciente> listarPacientes(){
		return servicioGestionPacientes.listarPacientes();
	}
	
}

