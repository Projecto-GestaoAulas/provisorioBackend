package javaGestaoAulas.businessClasses;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.QuestionForum;
import javaGestaoAulas.models.entityDTOs.QuestionForumDTO;
import javaGestaoAulas.repositoriesClasses.QuestionRepository;


@RequestScoped
public class QuestionBusiness extends EntityBusiness <QuestionRepository, QuestionForum, QuestionForumDTO>{

}
