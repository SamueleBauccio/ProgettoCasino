package peronal.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Deck {

	@Id
	@GeneratedValue(generator = "id_deck", strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer numberOfCards;
}
