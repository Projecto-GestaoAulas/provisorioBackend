package javaGestaoAulas.models.converters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javaGestaoAulas.businessClasses.EditionBusiness;
import javaGestaoAulas.businessClasses.AccountBusiness;
import javaGestaoAulas.businessClasses.AnswerBusiness;
import javaGestaoAulas.businessClasses.EventBusiness;
import javaGestaoAulas.businessClasses.LessonBusiness;
import javaGestaoAulas.businessClasses.QuestionBusiness;
import javaGestaoAulas.businessClasses.UserBusiness;
import javaGestaoAulas.models.Edition;
import javaGestaoAulas.models.Account;
import javaGestaoAulas.models.AnswerForum;
import javaGestaoAulas.models.Event;
import javaGestaoAulas.models.Lesson;
import javaGestaoAulas.models.Note;
import javaGestaoAulas.models.QuestionForum;
import javaGestaoAulas.models.entityDTOs.AccountDTO;
import pt.upacademy.stockManagementProjectMysql.models.Product;
import pt.upacademy.stockManagementProjectMysql.models.Shelf;

@RequestScoped
public class AccountConverter extends EntityConverter <Account,AccountDTO> {
	
	@Inject
	private EditionBusiness editionBus;
	
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
		
			account.setEditions(dto.getEditionsIds().stream().map(entityId -> {
				Edition edition = editionBus.getEntById(entityId);
				return edition;
			}).collect(Collectors.toList()));
			
	 		account.setAnswers(dto.getAnswersIds().stream().map(entityId -> {
				AnswerForum answer = answerBus.getEntById(entityId);
				return answer;
			}).collect(Collectors.toList()));
			
	 		account.setLessons(dto.getLessonsIds().stream().map(entityId -> {
	 			Lesson lesson = lessonBus.getEntById(entityId);
	 				return lesson;
	 			}).collect(Collectors.toList()));
	 		
	 		account.setNotes(dto.getNotesIds().stream().map(entityId -> {
	 			Note notes = noteBus.getEntById(entityId);
 				return notes;
 			}).collect(Collectors.toList()));

	 		account.setQuestions(dto.getQuestionsIds().stream().map(entityId -> {
	 			QuestionForum question = questionBus.getEntById(entityId);
 				return question;
 			}).collect(Collectors.toList()));
	 		
	 		account.setEvents(dto.getEventsIds().stream().map(entityId -> {
	 			Event event = eventBus.getEntById(entityId);
 				return event;
 			}).collect(Collectors.toList()));
	 		
	 		account.setUser(dto.getUserId()); //TODO
	 		
	 	return account;
		
	}

	@Override
	public AccountDTO toDTO(Account ent) {
		AccountDTO accountDTO = new AccountDTO (
				ent.getUser, //TODO
				ent.getEditions().stream().map(Edition :: getId).collect(Collectors.toList()),
				ent.getLessons().stream().map(Lesson :: getId).collect(Collectors.toList()),
				ent.getNotes().stream().map(Note :: getId).collect(Collectors.toList()),
				ent.getQuestions().stream().map(QuestionForum :: getId).collect(Collectors.toList()),
				ent.getAnswers().stream().map(AnswerForum :: getId).collect(Collectors.toList()),
				ent.getEvents().stream().map(Event :: getId).collect(Collectors.toList())
				);
		
		return accountDTO;
	}
	
	

}
