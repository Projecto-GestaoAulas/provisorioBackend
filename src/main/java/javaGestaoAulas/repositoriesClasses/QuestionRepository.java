package javaGestaoAulas.repositoriesClasses;

import javax.enterprise.context.ApplicationScoped;

import javaGestaoAulas.models.QuestionForum;
import javaGestaoAulas.models.entityDTOs.QuestionForumDTO;


@ApplicationScoped
public class QuestionRepository extends EntityRepository <QuestionForum, QuestionForumDTO> {

	@Override
	protected Class<QuestionForum> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllEntitiesIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getEntitiesCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
