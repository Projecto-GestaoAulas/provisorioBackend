package javaGestaoAulas.businessClasses;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.AnswerForum;
import javaGestaoAulas.models.entityDTOs.AnswerForumDTO;
import javaGestaoAulas.repositoriesClasses.AnswerRepository;


@RequestScoped
public class AnswerBusiness extends EntityBusiness <AnswerRepository, AnswerForum, AnswerForumDTO> {

}
