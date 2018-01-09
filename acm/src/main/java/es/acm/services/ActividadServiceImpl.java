package es.acm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.acm.entities.Actividad;
import es.acm.repository.ActividadRepository;

@Service
public class ActividadServiceImpl implements ActividadService {

	@Autowired
	private ActividadRepository actividadRepository; 
	
	@Override
	public Iterable<Actividad> getListaAllActividades() {
		// TODO Auto-generated method stub
		return actividadRepository.findAll();
	}

	@Override
	public Iterable<Actividad> getActividadById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actividad saveActividad(Actividad actividad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actividad deleteActividad(Actividad actividad) {
		// TODO Auto-generated method stub
		return null;
	}

}
