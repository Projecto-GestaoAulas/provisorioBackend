package javaGestaoAulas.controllersClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import javaGestaoAulas.businessClasses.EntityBusiness;
import javaGestaoAulas.models.Entity_;
import javaGestaoAulas.models.converters.EntityConverter;
import javaGestaoAulas.models.entityDTOs.EntityDTO;
import javaGestaoAulas.repositoriesClasses.EntityRepository;

@Transactional 
public class EntityController <T extends EntityBusiness <R, E, D>, R extends EntityRepository <E,D>, C extends EntityConverter <E,D>, E extends Entity_<D>, D extends EntityDTO> {

	@Inject
	protected T busEnt;
	
	@Inject 
	protected C converter;
	
	@Context
	 protected UriInfo context;
		
	@GET 
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN)
		 public String status () {
			 return "Url: " + context.getRequestUri().toString() + " is Ok";
		 }
	
	 @GET
	 @Produces (MediaType.APPLICATION_JSON)
	 public List<D> consultAllEnts () {
		 return busEnt.getAllEnts().stream().map(entity -> converter.toDTO(entity)).collect(Collectors.toList());
		 
	 }
	 
	 @GET
	 @Path("/{id}")
	 @Produces (MediaType.APPLICATION_JSON)
	 public D consultEntById (@PathParam("id") long id) {
		 return  busEnt.getEntById(id).toDTO();
			 
		
	 }
	 
	 @POST 
	 @Consumes (MediaType.APPLICATION_JSON)
	 @Produces (MediaType.APPLICATION_JSON)
	 public D addEntity (D entDTO)  {
		 	E ent = this.toEntity(entDTO);
		 	E savedEnt = busEnt.save(ent);
		 	D eNew = savedEnt.toDTO();
		 		return eNew;
		
	 }
	 
	 @POST 
	 @Path("list")
	 @Consumes (MediaType.APPLICATION_JSON)
	 @Produces (MediaType.APPLICATION_JSON)
	 public List <D> addEntityList (List <D> listEntsDTO) {
		 List <D> listentsDTONew = new ArrayList <D> ();
			 for (D entDTO : listEntsDTO) {
				 D pNew = this.addEntity(entDTO);
				 listentsDTONew.add(pNew);
			 }
			 
		 return listentsDTONew;	
	 }
	 

	 
	 @PUT
	 @Path("/{id}")
	 @Consumes (MediaType.APPLICATION_JSON)
	 @Produces (MediaType.APPLICATION_JSON)
	 public D updateEnt (@PathParam("id") long id, D entDTO) {
			E ent = this.toEntity(entDTO);
			 E updatedEnt = busEnt.update(ent); 
			 D eNew = updatedEnt.toDTO();
			 return eNew;
		
	 }


	 @PUT
	 @Path("/list")
	 @Consumes (MediaType.APPLICATION_JSON)
	 @Produces (MediaType.APPLICATION_JSON)
	 public List <D> updateEntList (@PathParam("id") long id, List <D> listEntsDTOs) {
		 List <D> listentDTONew = new ArrayList <D> ();
			 for (D entDTO : listEntsDTOs) {
				 E ent = this.toEntity(entDTO);
				 E updatedEnt = busEnt.update(ent); 
				 D eNew = updatedEnt.toDTO();
				 listentDTONew.add(eNew);
			 }
		 return listentDTONew;	
	 }
	 


	 
	 @DELETE 
	 @Path("/{id}")
	 @Produces (MediaType.TEXT_PLAIN)
	 public void deleteEnt (@PathParam("id") long id) {
			 busEnt.delete(id); 
	 }
	 

	 
	 }
	 