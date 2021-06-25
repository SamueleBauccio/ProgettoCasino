package peronal.project.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Session {

	@Id
	@GeneratedValue(generator = "id_session", strategy = GenerationType.IDENTITY)
	private Long id;

	private Player player;
	private Game game;
	private Deck deck;
	private LocalDate startTime;
	private LocalDate endTime;
	private double pointEarned;

}
