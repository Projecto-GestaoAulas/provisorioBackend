package javaGestaoAulas.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;

import javaGestaoAulas.models.entityDTOs.ClassDTO;

@Entity
@NamedQueries ({
	
})
public class Class extends Entity_<ClassDTO>{
	
	private static final long serialVersionUID = 1L;

	private List <Academy> listAcademies = new ArrayList <Academy> ();
	private List <String> listUrls = new ArrayList <String> ();
	private List <Note> listNotes = new ArrayList <Note> ();
	private List <String> listCode = new ArrayList <String> (); 
	
	
}
