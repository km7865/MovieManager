package movie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACTOR")
public class Actor
{
	@Id
	@Column(name = "ACTOR_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ACTOR_NAME")
	private String name;
	@Column(name = "ACTOR_ROLE_NAME")
	private String roleName;
	@Column(name = "ACTOR_ROLE")
	@Enumerated(EnumType.STRING)
	private Role role;

}
