package javaGestaoAulas.controllersClasses;

import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.businessClasses.EditionBusiness;
import javaGestaoAulas.models.Edition;
import javaGestaoAulas.models.converters.EditionConverter.EditionConverter;
import javaGestaoAulas.models.entityDTOs.EditionDTO;
import javaGestaoAulas.repositoriesClasses.EditionRepository;


@RequestScoped

public class EditionController extends EntityController <EditionBusiness, EditionRepository, EditionConverter, Edition, EditionDTO> {

}
