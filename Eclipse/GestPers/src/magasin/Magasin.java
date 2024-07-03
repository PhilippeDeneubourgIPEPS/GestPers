package magasin;
import java.util.ArrayList;
import java.util.List;
public class Magasin {


	    private List<String> produits;

	    public Magasin() {
	        produits = new ArrayList<>();
	    }

	    public void ajouterProduit(String produit) {
	        produits.add(produit);
	    }

	    public List<String> getProduits() {
	        return produits;
	    }

}
