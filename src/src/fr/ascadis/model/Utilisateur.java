package src.fr.ascadis.model;

import java.util.List;

@Entity
@Table(name="utilisateur")

public class Utilisateur {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private int id;
	
	@Column(name="UTI_NOM")
	@NotNull
	private String nom;
	
	@Column(name="UTI_PRENOM")
	@NotNull
	private String prenom;
	
	@Column(name="UTI_USERNAME")
	@NotNull
	private String username;
	
	@Column(name="UTI_MDP")
	@NotNull
	private String mdp;
	
	@ManyToMany
	@JoinColumn(name="UTI_TETRIMINO_ID")
	private List<Tetrimino> liste_tetriminos;
}
