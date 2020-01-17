package javaGestaoAulas.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;

import javaGestaoAulas.models.entityDTOs.LessonDTO;

@Entity
@NamedQueries ({
	
})
public class Lesson extends Entity_<LessonDTO>{
	
	private static final long serialVersionUID = 1L;

	private List <Academy> listAcademies = new ArrayList <Academy> ();
	private List <String> listUrls = new ArrayList <String> ();
	private List <Note> listNotes = new ArrayList <Note> ();
	private List <String> listCode = new ArrayList <String> ();
	
	public Lesson() {
		
	}
	
	public Lesson(List<Academy> listAcademies, List<String> listUrls, List<Note> listNotes, List<String> listCode) {
		this.listAcademies = listAcademies;
		this.listUrls = listUrls;
		this.listNotes = listNotes;
		this.listCode = listCode;
	}


	public List<Academy> getListAcademies() {
		return listAcademies;
	}
	public void setListAcademies(List<Academy> listAcademies) {
		this.listAcademies = listAcademies;
	}
	public List<String> getListUrls() {
		return listUrls;
	}
	public void setListUrls(List<String> listUrls) {
		this.listUrls = listUrls;
	}
	public List<Note> getListNotes() {
		return listNotes;
	}
	public void setListNotes(List<Note> listNotes) {
		this.listNotes = listNotes;
	}
	public List<String> getListCode() {
		return listCode;
	}
	public void setListCode(List<String> listCode) {
		this.listCode = listCode;
	}

	@Override
	public String toString() {
		return "Class [listAcademies=" + listAcademies + ", listUrls=" + listUrls + ", listNotes=" + listNotes
				+ ", listCode=" + listCode + "]";
	} 
	
	
	
	
	
}
