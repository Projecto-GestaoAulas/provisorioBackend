package javaGestaoAulas.controllersClasses;

import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;

import javaGestaoAulas.businessClasses.AccountBusiness;
import javaGestaoAulas.models.Account;
import javaGestaoAulas.models.converters.AccountConverter;
import javaGestaoAulas.models.entityDTOs.AccountDTO;
import javaGestaoAulas.repositoriesClasses.AccountRepository;

@RequestScoped
@Path (" ")
public class AccountController extends EntityController <AccountBusiness, AccountRepository, AccountConverter, Account, AccountDTO>{


	
	
}
