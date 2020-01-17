package javaGestaoAulas.controllersClasses;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

import javaGestaoAulas.businessClasses.NoteBusiness;
import javaGestaoAulas.models.Note;
import javaGestaoAulas.models.converters.NoteConverter;
import javaGestaoAulas.models.entityDTOs.NoteDTO;
import javaGestaoAulas.repositoriesClasses.NoteRepository;

@RequestScoped
@Path("notes")
public class NoteController extends EntityController<NoteBusiness, NoteRepository, NoteConverter, Note, NoteDTO>{

	
	@GET
	@Path("/notes/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<NoteDTO> getNotesByLessonId(@PathParam("id") long id) {
		return busEnt.getNotesByLessonId(id);
	}

	
	
	
	
	
}
