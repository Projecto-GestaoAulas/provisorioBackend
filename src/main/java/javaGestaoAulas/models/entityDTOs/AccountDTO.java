package javaGestaoAulas.models.entityDTOs;

import java.util.ArrayList;
import java.util.List;

public class AccountDTO extends EntityDTO {
	
	private long userId;
	private List <Long>  academiesIds = new ArrayList<Long>();
	private List <Long>  lessonsIds = new ArrayList<Long>();
	private List <Long> notesIds = new ArrayList<Long>();
	private List <Long> questionsIds = new ArrayList<Long>();
	private List <Long>  answersIds = new ArrayList<Long>();
	private List <Long>  eventsIds = new ArrayList<Long>();
			
	
	public AccountDTO() {
		}
		
	public AccountDTO(long userId, List<Long> academiesIds, List<Long> lessonsIds, List<Long> notesIds,
			List<Long> questionsIds, List<Long> answersIds, List<Long> eventsIds) {
		this.userId = userId;
		this.academiesIds = academiesIds;
		this.lessonsIds = lessonsIds;
		this.notesIds = notesIds;
		this.questionsIds = questionsIds;
		this.answersIds = answersIds;
		this.eventsIds = eventsIds;
	}


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public List<Long> getAcademiesIds() {
		return academiesIds;
	}
	public void setAcademiesIds(List<Long> academiesIds) {
		this.academiesIds = academiesIds;
	}
	public List<Long> getLessonsIds() {
		return lessonsIds;
	}
	public void setClassesIds(List<Long> lessonsIds) {
		this.lessonsIds = lessonsIds;
	}
	public List<Long> getNotesIds() {
		return notesIds;
	}
	public void setNotesIds(List<Long> notesIds) {
		this.notesIds = notesIds;
	}
	public List<Long> getQuestionsIds() {
		return questionsIds;
	}
	public void setQuestionsIds(List<Long> questionsIds) {
		this.questionsIds = questionsIds;
	}
	public List<Long> getAnswersIds() {
		return answersIds;
	}
	public void setAnswersIds(List<Long> answersIds) {
		this.answersIds = answersIds;
	}
	
	public List<Long> getEventsIds() {
		return eventsIds;
	}

	public void setEventsIds(List<Long> eventsIds) {
		this.eventsIds = eventsIds;
	}
	
	@Override
	public String toString() {
		return "AccountDTO [userId=" + userId + ", academiesIds=" + academiesIds + ", lessonsIds=" + lessonsIds 
				+ ", notesIds=" + notesIds + ", questionsIds=" + questionsIds +", answersIds=" + answersIds + ", eventsIds=" + eventsIds + "]";
	}
	
}
