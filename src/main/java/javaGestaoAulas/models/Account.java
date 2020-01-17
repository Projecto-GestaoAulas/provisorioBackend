package javaGestaoAulas.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;

import javaGestaoAulas.models.entityDTOs.AccountDTO;
import javaGestaoAulas.models.Event;


@Entity
@NamedQueries({
})

public class Account extends Entity_<AccountDTO>  {
	
	private static final long serialVersionUID = 1L;


	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	public static final String GET_ALL_ACCOUNT_IDs = "getAllAccountsIds";
	public static final String GET_ACCOUNT_COUNT = "getAccountCount";
	
	private User user;
	private List <Academy>  academies;
	private List <Lesson> lessons;
	private List <Note> notes;
	private List <QuestionForum> questions;
	private List <AnswerForum> answers;
	private List <Event> events;
	
	
	
	public Account(User user, List<Academy> academies, List<Lesson> lessons, List<Note> notes,
			List<QuestionForum> questions, List<AnswerForum> answers, List<Event> events) {
		this.user = user;
		this.academies = academies;
		this.lessons = lessons;
		this.notes = notes;
		this.questions = questions;
		this.answers = answers;
		this.events = events;
	}
	
	
	public Account() {
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Academy> getAcademies() {
		return academies;
	}
	public void setAcademies(List<Academy> academies) {
		this.academies = academies;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	public List<QuestionForum> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionForum> questions) {
		this.questions = questions;
	}
	public List<AnswerForum> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnswerForum> answers) {
		this.answers = answers;
	}
	
	
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	@Override
	public String toString() {
		return "Account [user=" + user + ", academies=" + academies + ", lessons=" + lessons 
				+ ", notes=" + notes + ", questions=" + questions +", answers=" + answers + ", events=" + events + "]";
	}
	

}
