package ma.projet.bean;

public class Article {
	private static int compteur = 0;
    private int id;
    private String designation ;
    private Categorie categorie ;
    private int code ;
    
	public Article(String designation, Categorie categorie, int code) {
		this.id = ++compteur;
		this.designation = designation;
		this.categorie = categorie;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", designation=" + designation + ", categorie=" + categorie + ", code=" + code
				+ "]";
	}
    
	
    

}
