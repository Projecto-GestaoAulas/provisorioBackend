package javaGestaoAulas.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.registry.infomodel.User;

import javaGestaoAulas.models.entityDTOs.QuestionForumDTO;

@Entity
@NamedQueries({ @NamedQuery(name = QuestionForum.GET_ALL_QF, query = "SELECT q FROM QuestionForum q"),
		@NamedQuery(name = QuestionForum.GET_ALL_IDS, query = "SELECT q.id FROM QuestionForum q"), })
public class QuestionForum extends Entity_ <QuestionForumDTO>  {

	public static final String GET_ALL_QF = "getAllQuestionsForum";
	public static final String GET_ALL_IDS = "getAllQuestionsIds";
	// o que quisermos pedir a base de dados
	private static final long serialVersionUID = 1L;

	private int id;
	private List<User> usersIds;
//	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, mappedBy = "question", fetch = FetchType.EAGER)
	private List<AnswerForum> answers;
	private LocalDateTime createAt = LocalDateTime.now();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<User> getUsersIds() {
		return usersIds;
	}

	public void setUsersIds(List<User> usersIds) {
		this.usersIds = usersIds;
	}

	public List<AnswerForum> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerForum> answers) {
		this.answers = answers;
	}

}
