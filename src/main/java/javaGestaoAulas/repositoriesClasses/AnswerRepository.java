package javaGestaoAulas.repositoriesClasses;

import javax.enterprise.context.ApplicationScoped;

import javaGestaoAulas.models.AnswerForum;
import javaGestaoAulas.models.entityDTOs.AnswerForumDTO;

@ApplicationScoped
public class AnswerRepository extends EntityRepository <AnswerForum, AnswerForumDTO> {

	@Override
	protected Class<AnswerForum> getEntityClass() {
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
