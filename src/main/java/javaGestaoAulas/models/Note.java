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
	
	
	
	

}
