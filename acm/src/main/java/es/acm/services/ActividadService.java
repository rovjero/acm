package es.acm.services;

import es.acm.entities.Actividad;

public interface ActividadService {

	public Iterable<Actividad> getListaAllActividades();
	
	public Iterable<Actividad> getActividadById(Integer id);
	
	public Actividad saveActividad (Actividad actividad);
	
	public Actividad deleteActividad (Actividad actividad);
}
