package personnel;
import util.MyDate;
public class Individu {
	    private String nom;
	    private String prenom;
	    private Sexe sexe;
	    private MyDate dateNaissance;

	    public Individu(String nom, String prenom, Sexe sexe, MyDate dateNaissance) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.sexe = sexe;
	        this.dateNaissance = dateNaissance;
	    }

	    // Getters and Setters
	    // ...

	    @Override
	    public String toString() {
	        return String.format("%-10s %-10s %-6s %-10s", prenom, nom, sexe, dateNaissance);
	    }

}
