package javaGestaoAulas.models.converters;


import java.util.Date;

import javax.inject.Inject;

import javaGestaoAulas.businessClasses.LessonBusiness;
import javaGestaoAulas.models.Note;

import javaGestaoAulas.models.entityDTOs.NoteDTO;

public class NoteConverter extends EntityConverter<Note, NoteDTO>{

	@Inject
	LessonBusiness LB;
	UserBusiness UB;
	
	
	@Override
	public Note toEntity(NoteDTO noteDTO) {
		Note note = new Note();
		
		if(noteDTO.getId()>0) {
			note.setId(noteDTO.getId());
			}
		
		note.setLesson(noteDTO.getLessonId() > 0 ? LB.getEntById(noteDTO.getLessonId()): null);
		note.setDateOfNote(noteDTO.getDateOfNote());
		note.setUser(noteDTO.getId() > 0 ? UB.getEntById(noteDTO.getUserId()) : null); // verificar métodos do user do core quando tivermos

		return note;
	}

	@Override
	public NoteDTO toDTO(Note note) {
		
		return new NoteDTO(
				note.getId(),
				(note.getLesson()==null) ? 0 : note.getLesson().getId(),
				note.getDateOfNote(),
				(note.getUser()==null) ? 0 : note.getUser().getId()
				);
				
		
		
	}

}
