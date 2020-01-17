package javaGestaoAulas.businessClasses;

import javax.enterprise.context.RequestScoped;
import javaGestaoAulas.models.Account;
import javaGestaoAulas.models.entityDTOs.AccountDTO;
import javaGestaoAulas.repositoriesClasses.AccountRepository;

@RequestScoped
public class AccountBusiness extends EntityBusiness <AccountRepository, Account, AccountDTO> {

}
