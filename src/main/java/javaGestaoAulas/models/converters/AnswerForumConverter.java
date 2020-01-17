package javaGestaoAulas.models.converters;

import javax.enterprise.context.RequestScoped;
import javaGestaoAulas.models.AnswerForum;
import javaGestaoAulas.models.entityDTOs.AnswerForumDTO;

@RequestScoped
public class AnswerForumConverter extends EntityConverter <AnswerForum, AnswerForumDTO>{

	@Override
	public AnswerForum toEntity(AnswerForumDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnswerForumDTO toDTO(AnswerForum ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
