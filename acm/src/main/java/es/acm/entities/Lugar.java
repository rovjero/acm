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
 * Lugar generated by hbm2java
 */
@Entity
@Table(name = "lugar", catalog = "acm")
public class Lugar implements java.io.Serializable {

	private int idlugar;
	private String descripcion;
	private Set<Actividad> actividads = new HashSet<Actividad>(0);

	public Lugar() {
	}

	public Lugar(int idlugar, String descripcion) {
		this.idlugar = idlugar;
		this.descripcion = descripcion;
	}

	public Lugar(int idlugar, String descripcion, Set<Actividad> actividads) {
		this.idlugar = idlugar;
		this.descripcion = descripcion;
		this.actividads = actividads;
	}

	@Id

	@Column(name = "idlugar", unique = true, nullable = false)
	public int getIdlugar() {
		return this.idlugar;
	}

	public void setIdlugar(int idlugar) {
		this.idlugar = idlugar;
	}

	@Column(name = "descripcion", nullable = false, length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lugar")
	public Set<Actividad> getActividads() {
		return this.actividads;
	}

	public void setActividads(Set<Actividad> actividads) {
		this.actividads = actividads;
	}

}
