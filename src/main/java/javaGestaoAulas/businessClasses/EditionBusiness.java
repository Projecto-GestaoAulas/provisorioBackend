package javaGestaoAulas.businessClasses;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.models.Edition;
import javaGestaoAulas.models.entityDTOs.EditionDTO;
import javaGestaoAulas.repositoriesClasses.EditionRepository;


@RequestScoped
public class EditionBusiness extends  EntityBusiness <EditionRepository, Edition, EditionDTO>{

}
