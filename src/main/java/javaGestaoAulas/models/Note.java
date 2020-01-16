package javaGestaoAulas.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;

import javaGestaoAulas.models.entityDTOs.NoteDTO;

@Entity
@NamedQueries ({
	
})
public class Note extends Entity_<NoteDTO>{
	
	private static final long serialVersionUID = 1L;
	
	private List<Class> listClasses = new ArrayList <Class> ();
	private Date dateOfNote;
	private User userId;
	
	
	public Note() {
	}

	public Note(List<Class> listClasses, Date dateOfNote, User userId) {
		this.listClasses = listClasses;
		this.dateOfNote = dateOfNote;
		this.userId = userId;
	}
	
	public List<Class> getListClasses() {
		return listClasses;
	}
	public void setListClasses(List<Class> listClasses) {
		this.listClasses = listClasses;
	}
	public Date getDateOfNote() {
		return dateOfNote;
	}
	public void setDateOfNote(Date dateOfNote) {
		this.dateOfNote = dateOfNote;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Note [listClasses=" + listClasses + ", dateOfNote=" + dateOfNote + "]";
	}
	
	
}
