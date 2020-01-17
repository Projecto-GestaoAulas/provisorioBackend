package javaGestaoAulas.repositoriesClasses;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javaGestaoAulas.models.Entity_;
import javaGestaoAulas.models.entityDTOs.EntityDTO;

public abstract class EntityRepository <E extends Entity_<D>, D extends EntityDTO> {

	@PersistenceContext(unitName = " ") //TODO 
	protected EntityManager em;

	
	public E createEnt (E newEnt) {
		return em.merge(newEnt);
	}

	protected abstract Class<E> getEntityClass();
	protected abstract String getAllEntities();
	protected abstract String getAllEntitiesIds();
	protected abstract String getEntitiesCount();
	
	public List<E> consultAllEnts (){
		return em.createNamedQuery(getAllEntities (), getEntityClass()).getResultList();
	}
	
	public List<Long> consultAllEntsByIds() {
		return em.createNamedQuery(getAllEntitiesIds(), Long.class).getResultList();
	}
	
	
	public E consultEntById (Long Id) {
		E entity = em.find(getEntityClass(), Id);
		return entity;
	}
	
	
	public void removeEntity (Long iD) {
		E ent = consultEntById(iD);
		if (ent != null) {
			em.remove(ent);
		}
	}
	
	public E editEntity (E newEnt) {
		return em.merge(newEnt);
	}
	
	
}
