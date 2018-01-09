package es.acm.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import es.acm.entities.Actividad;
import es.acm.entities.Lugar;

@Transactional
public interface ActividadRepository extends CrudRepository<Actividad, Integer> {

	// custom query example and return a stream
    @Query("select actividad from Actividad actividad join actividad.lugar lugar where lugar.idlugar = :idLugar")
    Stream<Actividad> findByLugarlReturnStream(@Param("idLugar") Long idLugar);
	
    List<Actividad> findByLugar(Lugar lugar);
    
}
