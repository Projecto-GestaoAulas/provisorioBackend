package javaGestaoAulas.repositoriesClasses;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;

import javaGestaoAulas.models.Note;
import javaGestaoAulas.models.entityDTOs.NoteDTO;


@ApplicationScoped
public class NoteRepository extends EntityRepository<Note, NoteDTO>{

	@Override
	protected Class<Note> getEntityClass() {
		return Note.class;
	}

	@Override
	protected String getAllEntities() {
		return Note.GET_ALL_NOTES;
	}

	@Override
	protected String getAllEntitiesIds() {
		return Note.GET_ALL_NOTES_IDS;
	}

	@Override
	protected String getEntitiesCount() {
		return Note.GET_NOTES_COUNT;
	}
	
	
	public List <Note> getNotesByLessonsIds(long id) {
		TypedQuery<Note> query = em.createNamedQuery(Note.GET_NOTES_BY_LESSONS_IDS, Note.class);
		query.setParameter("lessonId", id);
		return query.getResultList();	
		
		
	}
	
}
