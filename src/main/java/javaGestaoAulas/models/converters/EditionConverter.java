package javaGestaoAulas.models.converters;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.Edition;
import javaGestaoAulas.models.entityDTOs.EditionDTO;

@RequestScoped
public class EditionConverter extends EntityConverter <Edition, EditionDTO> {

	@Override
	public Edition toEntity(EditionDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EditionDTO toDTO(Edition ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
