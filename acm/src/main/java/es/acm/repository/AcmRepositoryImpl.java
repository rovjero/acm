package es.acm.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import es.acm.entities.Actividad;

@Component
public class AcmRepositoryImpl implements AcmRepository {

	@PersistenceContext
    private EntityManager entityManager;

	public List<Actividad> getActividades() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Actividad.class);
		/*
		  TypedQuery<Country> query = em.createQuery(q);
  List<Country> results = query.getResultList();
  *************
  *TypedQuery<Country> query =
      em.createQuery("SELECT c FROM Country c", Country.class);
  List<Country> results = query.getResultList();
  *****************++
  CriteriaBuilder cb = em.getCriteriaBuilder();

  CriteriaQuery<Country> q = cb.createQuery(Country.class);
  Root<Country> c = q.from(Country.class);
  ParameterExpression<Integer> p = cb.parameter(Integer.class);
  q.select(c).where(cb.gt(c.get("population"), p));
  
		 */
		return criteria.list();
	}
	
}
