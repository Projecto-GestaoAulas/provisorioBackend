package javaGestaoAulas.models.converters;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.Lesson;
import javaGestaoAulas.models.entityDTOs.LessonDTO;

@RequestScoped
public class LessonConverter extends EntityConverter <Lesson, LessonDTO> {

	@Override
	public Lesson toEntity(LessonDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LessonDTO toDTO(Lesson ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
