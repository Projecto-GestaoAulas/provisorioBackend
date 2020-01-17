package javaGestaoAulas.controllersClasses;

import javax.ws.rs.Path;

import javaGestaoAulas.businessClasses.AccountBusiness;
import javaGestaoAulas.models.Account;
import javaGestaoAulas.models.entityDTOs.AccountDTO;
import javaGestaoAulas.repositoriesClasses.AccountRepository;

@Path (" ")
public class AccountController extends EntityController <AccountBusiness, AccountRepository, Account, AccountDTO>{

	
	
}
