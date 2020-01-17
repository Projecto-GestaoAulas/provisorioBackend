package javaGestaoAulas.businessClasses;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


import javaGestaoAulas.models.Note;
import javaGestaoAulas.models.converters.NoteConverter;
import javaGestaoAulas.models.entityDTOs.NoteDTO;
import javaGestaoAulas.repositoriesClasses.NoteRepository;

@RequestScoped
public class NoteBusiness extends EntityBusiness<NoteRepository, Note, NoteDTO>{

	@Inject NoteConverter converter;
	
	
	public List<NoteDTO> getNotesByLessonId(long id){
		return repository.getNotesByLessonsIds(id).stream().map(note -> converter.toDTO(note)).collect(Collectors.toList());
		
	}
	
	
}
