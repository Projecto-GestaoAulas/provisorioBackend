package javaGestaoAulas.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = AnswerForum.GET_ALL_AF, query = "SELECT a FROM AnswerForum a"),
		@NamedQuery(name = AnswerForum.GET_ALL_IDS, query = "SELECT a.id FROM AnswerForum a"), })

public class AnswerForum extends Entity_ implements Serializable {
	
	public static final String GET_ALL_AF = "getAllAnswersForum";
	public static final String GET_ALL_IDS = "getAllAnswersIds";
	// o que quisermos pedir a base de dados
	private static final long serialVersionUID = 1L;
	
	private int id;
	private List<User> usersIds;
	private LocalDateTime createAt = LocalDateTime.now();

}
