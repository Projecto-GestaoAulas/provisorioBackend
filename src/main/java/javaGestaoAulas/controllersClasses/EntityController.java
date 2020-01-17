package javaGestaoAulas.controllersClasses;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import javaGestaoAulas.businessClasses.EntityBusiness;
import javaGestaoAulas.models.Entity_;
import javaGestaoAulas.models.entityDTOs.EntityDTO;
import javaGestaoAulas.repositoriesClasses.EntityRepository;

@Transactional 
public class EntityController <T extends EntityBusiness <R, E, D>, R extends EntityRepository <E,D>, E extends Entity_<D>, D extends EntityDTO> {

	@Inject
	protected T busEnt;
	
	@Context
	 protected UriInfo context;
		
	@GET 
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN)
		 public String status () {
			 return "Url: " + context.getRequestUri().toString() + " is Ok";
		 }

	
}
