package javaGestaoAulas.models.converters;

import javax.inject.Inject;

import javaGestaoAulas.businessClasses.AccountBusiness;
import javaGestaoAulas.models.Account;
import javaGestaoAulas.models.entityDTOs.AccountDTO;

public class AccountConverter extends EntityConverter <Account,AccountDTO> {
	
	@Inject
	private AccountBusiness accountBus;

	@Override
	public Account toEntity(AccountDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDTO toDTO(Account ent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
