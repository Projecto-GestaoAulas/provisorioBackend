package javaGestaoAulas.models.converters;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.QuestionForum;
import javaGestaoAulas.models.entityDTOs.QuestionForumDTO;

@RequestScoped
public class QuestionForumConverter extends EntityConverter <QuestionForum, QuestionForumDTO>{

	@Override
	public QuestionForum toEntity(QuestionForumDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionForumDTO toDTO(QuestionForum ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
