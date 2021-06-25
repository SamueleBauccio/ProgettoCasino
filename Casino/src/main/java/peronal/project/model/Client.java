package peronal.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Client {

	@Id
	@GeneratedValue(generator = "id_client", strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String surname;
	private String password;

	@ManyToMany
	@JoinTable(name = "client_role", joinColumns = @JoinColumn(name = "id_client"), inverseJoinColumns = @JoinColumn(name = "id_role"))
	private List<Roles> role;

}
