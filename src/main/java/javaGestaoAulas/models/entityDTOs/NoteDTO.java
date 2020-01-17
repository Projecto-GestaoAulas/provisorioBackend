package javaGestaoAulas.models.entityDTOs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javaGestaoAulas.models.Lesson;

public class NoteDTO extends EntityDTO {
	
	private static final long serialVersionUID = 1L;
	
	private List<Long> listClasses = new ArrayList <Long> ();
	private Date dateOfNote;
	private Long userId;
	
	
	public NoteDTO() {	
	}
	

	public NoteDTO(List<Long> listClasses, Date dateOfNote, Long userId) {
		this.listClasses = listClasses;
		this.dateOfNote = dateOfNote;
		this.userId = userId;
	}

	public List<Long> getListClasses() {
		return listClasses;
	}
	public void setListClasses(List<Long> listClasses) {
		this.listClasses = listClasses;
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
