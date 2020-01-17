package javaGestaoAulas.controllersClasses;

import javax.transaction.Transactional;

import pt.upacademy.stockManagementProjectMysql.business.EntityBusiness;
import pt.upacademy.stockManagementProjectMysql.models.EntityDTO;
import pt.upacademy.stockManagementProjectMysql.models.MyEntity;
import pt.upacademy.stockManagementProjectMysql.repositories.EntityRepository;

@Transactional 
public class entityController <T extends EntityBusiness <R, E, D>, R extends EntityRepository <E,D>, E extends Entity_<D>, D extends EntityDTO> {

	
}
