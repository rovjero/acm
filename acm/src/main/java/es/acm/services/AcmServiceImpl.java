package es.acm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.acm.entities.Actividad;
import es.acm.repository.AcmRepository;

@Service
public class AcmServiceImpl implements AcmService{

	@Autowired
	private AcmRepository acmRepository;
	
	@Override
	public List<Actividad> getActividades() {
		// TODO Auto-generated method stub
		return acmRepository.getActividades();
	}

}
