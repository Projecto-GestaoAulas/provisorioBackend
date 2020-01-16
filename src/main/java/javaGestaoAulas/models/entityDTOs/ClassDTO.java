package javaGestaoAulas.models.entityDTOs;

import java.util.ArrayList;
import java.util.List;


public class ClassDTO extends EntityDTO {
	
	private static final long serialVersionUID = 1L;
	
	private List <Long> listAcademies = new ArrayList <Long> ();
	private List <String> listUrls = new ArrayList <String> ();
	private List <Long> listNotes = new ArrayList <Long> ();
	private List <String> listCode = new ArrayList <String> ();
	
	
	public ClassDTO() {
		
	}

	public ClassDTO(List<Long> listAcademies, List<String> listUrls, List<Long> listNotes, List<String> listCode) {
		this.listAcademies = listAcademies;
		this.listUrls = listUrls;
		this.listNotes = listNotes;
		this.listCode = listCode;
	}
	
	public List<Long> getListAcademies() {
		return listAcademies;
	}
	public void setListAcademies(List<Long> listAcademies) {
		this.listAcademies = listAcademies;
	}
	public List<String> getListUrls() {
		return listUrls;
	}
	public void setListUrls(List<String> listUrls) {
		this.listUrls = listUrls;
	}
	public List<Long> getListNotes() {
		return listNotes;
	}
	public void setListNotes(List<Long> listNotes) {
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
		return "ClassDTO [listAcademies=" + listAcademies + ", listUrls=" + listUrls + ", listNotes=" + listNotes
				+ ", listCode=" + listCode + "]";
	} 

	
	
}
