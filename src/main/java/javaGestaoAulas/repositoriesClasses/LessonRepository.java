package javaGestaoAulas.repositoriesClasses;

import javax.enterprise.context.ApplicationScoped;

import javaGestaoAulas.models.Lesson;
import javaGestaoAulas.models.entityDTOs.LessonDTO;


@ApplicationScoped
public class LessonRepository extends EntityRepository <Lesson, LessonDTO> {

	@Override
	protected Class<Lesson> getEntityClass() {
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
