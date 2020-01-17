package javaGestaoAulas.models.converters;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.Event;
import javaGestaoAulas.models.entityDTOs.EventDTO;

@RequestScoped
public class EventConverter extends EntityConverter <Event, EventDTO>{

	@Override
	public Event toEntity(EventDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventDTO toDTO(Event ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
