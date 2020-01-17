package javaGestaoAulas.businessClasses;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import javaGestaoAulas.models.Entity_;
import javaGestaoAulas.models.entityDTOs.EntityDTO;
import javaGestaoAulas.repositoriesClasses.EntityRepository;

public class EntityBusiness <R extends EntityRepository <E,D>, E extends Entity_<D>, D extends EntityDTO> {
	
	@Inject
	protected R repository;
	
	public E getEntById (long id) {
		return repository.consultEntById (id);
	}

	public List<E> getAllEnts() {
		return repository.consultAllEnts();
	}

	public Collection<Long> getAllIds() {
		return repository.consultAllEntsByIds();
	}

	
	public E save(E entity) {
	    return repository.createEnt (entity);
	}

	public E update(E entity)  {
		//validate (entity.getId());
		E updEnt = repository.editEntity(entity);
		 return updEnt;
		
	}


	public void delete (long id) {
		repository.removeEntity(id);
		
	}
	
//	public void validate (long Id) throws IllegalArgumentException {
//		if (repository.consultEntById (Id) == null) {
//			throw new IllegalArgumentException (String.format("No %s with ID %d", getEntityClassName(), Id));
//		}
//	}

	//protected abstract String getEntityClassName();
	


}
