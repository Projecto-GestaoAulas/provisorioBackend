package javaGestaoAulas.businessClasses;

import javaGestaoAulas.models.Entity_;
import javaGestaoAulas.models.entityDTOs.EntityDTO;
import javaGestaoAulas.repositoriesClasses.EntityRepository;

public class EntityBusiness <R extends EntityRepository <E,D>, E extends Entity_<D>, D extends EntityDTO> {

}
