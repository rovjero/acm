package es.acm.entities;
// Generated 06-ene-2018 19:38:01 by Hibernate Tools 5.2.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoActividad generated by hbm2java
 */
@Entity
@Table(name = "tipo_actividad", catalog = "acm")
public class TipoActividad implements java.io.Serializable {

	private int idtipoActividad;
	private String descripcionTipoActividad;
	private Set<Actividad> actividads = new HashSet<Actividad>(0);

	public TipoActividad() {
	}

	public TipoActividad(int idtipoActividad, String descripcionTipoActividad) {
		this.idtipoActividad = idtipoActividad;
		this.descripcionTipoActividad = descripcionTipoActividad;
	}

	public TipoActividad(int idtipoActividad, String descripcionTipoActividad, Set<Actividad> actividads) {
		this.idtipoActividad = idtipoActividad;
		this.descripcionTipoActividad = descripcionTipoActividad;
		this.actividads = actividads;
	}

	@Id

	@Column(name = "idtipo_actividad", unique = true, nullable = false)
	public int getIdtipoActividad() {
		return this.idtipoActividad;
	}

	public void setIdtipoActividad(int idtipoActividad) {
		this.idtipoActividad = idtipoActividad;
	}

	@Column(name = "descripcion_tipo_actividad", nullable = false, length = 200)
	public String getDescripcionTipoActividad() {
		return this.descripcionTipoActividad;
	}

	public void setDescripcionTipoActividad(String descripcionTipoActividad) {
		this.descripcionTipoActividad = descripcionTipoActividad;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoActividad")
	public Set<Actividad> getActividads() {
		return this.actividads;
	}

	public void setActividads(Set<Actividad> actividads) {
		this.actividads = actividads;
	}

}
