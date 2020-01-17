package javaGestaoAulas.repositoriesClasses;

import javax.enterprise.context.ApplicationScoped;
import javaGestaoAulas.models.Account;
import javaGestaoAulas.models.entityDTOs.AccountDTO;

@ApplicationScoped
public class AccountRepository extends EntityRepository <Account, AccountDTO>{

	@Override
	protected Class<Account> getEntityClass() {
		return Account.class;
	}

	@Override
	protected String getAllEntities() {
		return Account.GET_ALL_ACCOUNTS;
	}

	@Override
	protected String getAllEntitiesIds() {
		return Account.GET_ALL_ACCOUNT_IDs;
	}

	@Override
	protected String getEntitiesCount() {
		return Account.GET_ACCOUNT_COUNT;
	}

}
