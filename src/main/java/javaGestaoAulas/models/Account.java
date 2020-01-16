package javaGestaoAulas.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;

import javaGestaoAulas.models.entityDTOs.AccountDTO;


@Entity
@NamedQueries({
})

public class Account extends Entity_ <AccountDTO> {
	
	private static final long serialVersionUID = 1L;

	
	private User user;
	private List <Academy>  academies;
	private List <Class> classes;
	private List <Note> notes;
	private List <QuestionForum> questions;
	private List <AnswerForum> answers;
	private List <Event> events;
	
	
	
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
	public List<Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
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
		return "Account [user=" + user + ", academies=" + academies + ", classes=" + classes 
				+ ", notes=" + notes + ", questions=" + questions +", answers=" + answers + ", events=" + events + "]";
	}
	

}
