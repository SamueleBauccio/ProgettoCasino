package peronal.project.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Player {

	@Id
	@GeneratedValue(generator = "id_player", strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String surname;
	private String username;
	private Long points;
	private LocalDate registrationDate;
	private String password;

	@Enumerated(EnumType.STRING)
	private Level level;

}
