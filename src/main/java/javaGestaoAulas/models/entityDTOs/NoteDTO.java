package javaGestaoAulas.models.entityDTOs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javaGestaoAulas.models.Note;

public class NoteDTO extends EntityDTO<Note> {
	
	private static final long serialVersionUID = 1L;
	
	private List<Long> listLessons = new ArrayList <Long> ();
	private Date dateOfNote;
	private Long userId;
	
	
	public NoteDTO() {	
	}
	

	public NoteDTO(List<Long> listLessons, Date dateOfNote, Long userId) {
		this.listLessons = listLessons;
		this.dateOfNote = dateOfNote;
		this.userId = userId;
	}

	public List<Long> getListLessons() {
		return listLessons;
	}
	public void setListLessons(List<Long> listLessons) {
		this.listLessons = listLessons;
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
		return "NoteDTO [listClasses=" + listClasses + ", dateOfNote=" + dateOfNote + ", userId=" + userId + "]";
	}
	
	
	

}
