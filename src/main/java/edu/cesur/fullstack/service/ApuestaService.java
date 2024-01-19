package edu.cesur.fullstack.service;

import java.util.ArrayList;

import edu.cesur.fullstack.DTO.ApuestaDTO;

public interface ApuestaService {
	public ApuestaDTO CrearApuesta();
	public ArrayList<ApuestaDTO> VerMisApuestas();
	public ApuestaDTO CancelarApuesta();
	public ArrayList<ApuestaDTO> VerApuestasDirecto();
}
