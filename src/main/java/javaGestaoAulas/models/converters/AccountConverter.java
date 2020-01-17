package javaGestaoAulas.models.converters;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import javaGestaoAulas.businessClasses.AcademyBusiness;
import javaGestaoAulas.businessClasses.AccountBusiness;
import javaGestaoAulas.businessClasses.AnswerBusiness;
import javaGestaoAulas.businessClasses.EventBusiness;
import javaGestaoAulas.businessClasses.LessonBusiness;
import javaGestaoAulas.businessClasses.QuestionBusiness;
import javaGestaoAulas.businessClasses.UserBusiness;
import javaGestaoAulas.models.Academy;
import javaGestaoAulas.models.Account;
import javaGestaoAulas.models.entityDTOs.AccountDTO;
import pt.upacademy.stockManagementProjectMysql.models.Product;
import pt.upacademy.stockManagementProjectMysql.models.Shelf;

public class AccountConverter extends EntityConverter <Account,AccountDTO> {
	
	@Inject
	private AcademyBusiness academyBus;
	
	@Inject
	private NoteBusiness noteBus;
	
	@Inject
	private LessonBusiness lessonBus;
	
	@Inject
	private QuestionBusiness questionBus;
	
	@Inject
	private AnswerBusiness answerBus;
	
	@Inject
	private UserBusiness userBus;
	
	@Inject
	private EventBusiness eventBus;

	@Override
	public Account toEntity(AccountDTO dto) {
		
		Account account = new Account ();
		
		if(dto.getId() > 0) {
			account.setId(dto.getId());
		}
		
			account.setAcademies(dto.getAcademiesIds().stream().map(entityId -> {
				Academy academy = 
				
			}));
	 		account.setAnswers(answers);
	 		account.setLessons(lessons);
	 		account.setNotes(notes);
	 		account.setQuestions(questions);
	 		account.setEvents(events);
	 		account.setUser(user);
	 		
	 	return account;
		
	}

	@Override
	public AccountDTO toDTO(Account ent) {
		AccountDTO accountDTO = new AccountDTO (
				ent.getUser,
				ent.getAcademies(),
				ent.getLessons(),
				ent.getNotes(),
				ent.getQuestions(),
				ent.getAnswers(),
				ent.getEvents()
				);
		
		return accountDTO;
	}
	
	

}
