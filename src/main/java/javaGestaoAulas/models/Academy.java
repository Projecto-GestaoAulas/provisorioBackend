package javaGestaoAulas.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


import javaGestaoAulas.models.entityDTOs.AcademyDTO;

@Entity
@NamedQueries({ @NamedQuery(name = Academy.GET_ALL_ACADEMIES, query = "SELECT a FROM Academy a")
})

public class Academy extends Entity_ <AcademyDTO>  {
	
	public static final String GET_ALL_ACADEMIES = "getAllAcademies";
		
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "Academy [name=" + name + ", type=" + type + "]";
	}
	
	

}
