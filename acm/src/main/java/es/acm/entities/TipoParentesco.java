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
 * TipoParentesco generated by hbm2java
 */
@Entity
@Table(name = "tipo_parentesco", catalog = "acm_schema")
public class TipoParentesco implements java.io.Serializable {

	private int idParentesco;
	private String descripcion;
	private Set<RelParticipanteTutor> relParticipanteTutors = new HashSet<RelParticipanteTutor>(0);

	public TipoParentesco() {
	}

	public TipoParentesco(int idParentesco, String descripcion) {
		this.idParentesco = idParentesco;
		this.descripcion = descripcion;
	}

	public TipoParentesco(int idParentesco, String descripcion, Set<RelParticipanteTutor> relParticipanteTutors) {
		this.idParentesco = idParentesco;
		this.descripcion = descripcion;
		this.relParticipanteTutors = relParticipanteTutors;
	}

	@Id

	@Column(name = "id_parentesco", unique = true, nullable = false)
	public int getIdParentesco() {
		return this.idParentesco;
	}

	public void setIdParentesco(int idParentesco) {
		this.idParentesco = idParentesco;
	}

	@Column(name = "descripcion", nullable = false, length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoParentesco")
	public Set<RelParticipanteTutor> getRelParticipanteTutors() {
		return this.relParticipanteTutors;
	}

	public void setRelParticipanteTutors(Set<RelParticipanteTutor> relParticipanteTutors) {
		this.relParticipanteTutors = relParticipanteTutors;
	}

}
