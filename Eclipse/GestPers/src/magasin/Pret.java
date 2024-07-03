package magasin;
import java.util.HashMap;
import java.util.Map;
import personnel.Personnel;
public class Pret {


	    private Map<Personnel, String> emprunts;

	    public Pret() {
	        emprunts = new HashMap<>();
	    }

	    public void ajouterEmprunt(Personnel personnel, String produit) {
	        emprunts.put(personnel, produit);
	    }

	    public Map<Personnel, String> getEmprunts() {
	        return emprunts;
	    }

}
