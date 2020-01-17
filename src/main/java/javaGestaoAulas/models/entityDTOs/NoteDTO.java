package javaGestaoAulas.models.entityDTOs;

import java.util.Date;

import javaGestaoAulas.models.Note;


public class NoteDTO extends EntityDTO <Note>{
		
	private Long lessonId;
	private Date dateOfNote;
	private Long userId;
	
	
	public NoteDTO() {	
	}
	
	public NoteDTO(Long lessonId, Date dateOfNote, Long userId) {
		this.lessonId = lessonId;
		this.dateOfNote = dateOfNote;
		this.userId = userId;
	}


	public Long getLessonId() {
		return lessonId;
	}

	public void setLessonId(Long lessonId) {
		this.lessonId = lessonId;
	}

	public Date getDateOfNote() {
		return dateOfNote;
	}

	public void setDateOfNote(Date dateOfNote) {
		this.dateOfNote = dateOfNote;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "NoteDTO [lessonId=" + lessonId + ", dateOfNote=" + dateOfNote + ", userId=" + userId + "]";
	}
	
	
	

}
