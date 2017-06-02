package src.fr.ascadis.model;

public class Figures extends Tetrimino {

	public Figures() {
		// TODO Auto-generated constructor stub
		
	}

	public Figures(String nom, String couleur, String valeur) {
		super(nom, couleur, valeur);
		// TODO Auto-generated constructor stub
		
Block block = new Block();	}

	
	

	@Override
	public void setNombreDeFigures(int nombreDeFigures) {
		// TODO Auto-generated method stub
		super.setNombreDeFigures(nombreDeFigures);
	}

	@Override
	public String getValeur() {
		// TODO Auto-generated method stub
		return super.getValeur();
	}

	@Override
	public void setValeur(String valeur) {
		// TODO Auto-generated method stub
		super.setValeur(valeur);
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	@Override
	public String getCouleur() {
		// TODO Auto-generated method stub
		return super.getCouleur();
	}

	@Override
	public void setCouleur(String couleur) {
		// TODO Auto-generated method stub
		super.setCouleur(couleur);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	private int nombreDeBlocks;


	public int getNombreDeBlocks() {
		return nombreDeBlocks;
	}

	public void setNombreDeBlocks(int nombreDeBlocks) {
		this.nombreDeBlocks = nombreDeBlocks;
	}
}
