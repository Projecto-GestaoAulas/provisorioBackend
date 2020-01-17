package javaGestaoAulas.repositoriesClasses;

import javax.enterprise.context.ApplicationScoped;

import javaGestaoAulas.models.Event;
import javaGestaoAulas.models.entityDTOs.EventDTO;

@ApplicationScoped
public class EventRepository extends EntityRepository <Event, EventDTO>{

	@Override
	protected Class<Event> getEntityClass() {
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
