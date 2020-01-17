package javaGestaoAulas.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javaGestaoAulas.models.entityDTOs.NoteDTO;

@Entity
@NamedQueries({ @NamedQuery(name = Note.GET_ALL_NOTES, query = "SELECT n FROM Note n"),
	@NamedQuery(name = Note.GET_ALL_NOTES_IDS, query = "SELECT n.id FROM Note n"),
	@NamedQuery(name = Note.GET_NOTES_COUNT, query = "SELECT COUNT(n.id) FROM Note n"),
	@NamedQuery(name = Note.GET_NOTES_BY_LESSONS_IDS, query = "SELECT n FROM Note n WHERE n.lesson.id = :lessonId")
	 })
public class Note extends Entity_<NoteDTO>{
	
	public static final String GET_ALL_NOTES = "getAllNotes";
	public static final String GET_ALL_NOTES_IDS = "getAllNotesIds";
	public static final String GET_NOTES_COUNT = "getNotesCount";
	public static final String GET_NOTES_BY_LESSONS_IDS = "getNotesByLessonsIds";
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Lesson lesson;
	private Date dateOfNote;
	private User user;
	
	
	public static String getClassName() {
		return "Note";
	}
	
	public Note() {
	}

	public Note(Lesson lesson, Date dateOfNote, User user) {
		super();
		this.lesson = lesson;
		this.dateOfNote = dateOfNote;
		this.user = user;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public Date getDateOfNote() {
		return dateOfNote;
	}

	public void setDateOfNote(Date dateOfNote) {
		this.dateOfNote = dateOfNote;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Note [lesson=" + lesson + ", dateOfNote=" + dateOfNote + ", user=" + user + "]";
	}
	
	
}
