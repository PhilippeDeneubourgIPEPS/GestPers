package personnel;
import util.MyDate;
	public class Personnel extends Individu {
	    private int idPersonnel;
	    private String email;
	    private Departement departement;
	    private boolean actif;

	    public Personnel(int id, String nom, String prenom, Sexe sexe, MyDate dateNaissance, String email, Departement departement) {
	        super(nom, prenom, sexe, dateNaissance);
	        this.idPersonnel = id;
	        this.email = email;
	        this.departement = departement;
	        this.actif = true;
	    }

	    // Getters and Setters
	    // ...

	    @Override
	    public String toString() {
	        return String.format("%-12s %-10s %-10s %-6s %-12s %-20s", departement, super.toString(), email);
	    }

}
