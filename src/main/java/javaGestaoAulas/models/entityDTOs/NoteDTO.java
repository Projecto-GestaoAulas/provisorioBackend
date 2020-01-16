package javaGestaoAulas.models.entityDTOs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javaGestaoAulas.models.Class;

public class NoteDTO extends EntityDTO {
	
	private static final long serialVersionUID = 1L;
	
	private List<Long> listClasses = new ArrayList <Long> ();
	private Date dateOfNote;
	private Long userId;

}
