package javaGestaoAulas.businessClasses;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.Event;
import javaGestaoAulas.models.entityDTOs.EventDTO;
import javaGestaoAulas.repositoriesClasses.EventRepository;

@RequestScoped
public class EventBusiness extends EntityBusiness <EventRepository, Event, EventDTO>{

}
