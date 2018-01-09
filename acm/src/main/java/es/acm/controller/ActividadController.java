package es.acm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import es.acm.entities.Actividad;
import es.acm.services.AcmService;
import es.acm.services.ActividadService;

@Controller
public class ActividadController {
	
	@Autowired
	private ActividadService actividadService;
	
	@Autowired
	private AcmService acmService;
	
	@RequestMapping("/actividades")
	public String welcome(Map<String, Object> model) {
		//Iterable<Actividad> listaActividades = actividadService.getListaAllActividades();
		List<Actividad> listaActividades = acmService.getActividades();
		model.put("listaActividades", listaActividades);
		return "actividades";
	}

	public ActividadService getActividadService() {
		return actividadService;
	}

	public void setActividadService(ActividadService actividadService) {
		this.actividadService = actividadService;
	}

}
