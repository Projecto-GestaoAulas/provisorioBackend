package javaGestaoAulas.repositoriesClasses;


import javax.enterprise.context.ApplicationScoped;

import javaGestaoAulas.models.Edition;
import javaGestaoAulas.models.entityDTOs.EditionDTO;


@ApplicationScoped
public class EditionRepository extends EntityRepository <Edition, EditionDTO>{

	@Override
	protected Class<Edition> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllEntitiesIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getEntitiesCount() {
		// TODO Auto-generated method stub
		return null;
	}



}
