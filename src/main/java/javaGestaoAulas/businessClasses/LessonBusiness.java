package javaGestaoAulas.businessClasses;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.Lesson;
import javaGestaoAulas.models.entityDTOs.LessonDTO;
import javaGestaoAulas.repositoriesClasses.LessonRepository;

@RequestScoped
public class LessonBusiness extends EntityBusiness <LessonRepository, Lesson, LessonDTO> {

}
