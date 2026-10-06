package ma.projet.bean;

public class test {
	

	    public static void main(String[] args) {

	        // Création des catégories
	        Categorie c1 = new Categorie("Ordinateur Portable", "O PR");
	        Categorie c2 = new Categorie("Ordinateur Poste", "O PO");

	        // Tableau des catégories
	        Categorie[] categories = {c1, c2};

	        // Création des articles
	        Article a1 = new Article(14, "DELL INSPIRON", c1);
	        Article a2 = new Article(4, "SONY VAIO", c1);
	        Article a3 = new Article(74, "TERRA", c2);
	        Article a4 = new Article(785, "HP Compaq", c2);

	        // Tableau des articles
	        Article[] articles = {a1, a2, a3, a4};

	        // Affichage par catégorie
	        for (Categorie categorie : categories) {

	            System.out.println(categorie.getLibelle() + " :");

	            for (Article article : articles) {

	                if (article.getCategorie().getId() == categorie.getId()) {
	                    System.out.println("  - " + article);
	                }
	            }

	            System.out.println();
	        }
	    }
	}


