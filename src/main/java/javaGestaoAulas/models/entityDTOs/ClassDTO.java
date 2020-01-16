package javaGestaoAulas.models.entityDTOs;

import java.util.ArrayList;
import java.util.List;

import javaGestaoAulas.models.Academy;
import javaGestaoAulas.models.Note;

public class ClassDTO extends EntityDTO {
	
	private static final long serialVersionUID = 1L;
	
	private List <Long> listAcademies = new ArrayList <Long> ();
	private List <String> listUrls = new ArrayList <String> ();
	private List <Long> listNotes = new ArrayList <Long> ();
	private List <String> listCode = new ArrayList <String> (); 

}
