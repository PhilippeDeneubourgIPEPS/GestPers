package gui;
	import magasin.*;
	import personnel.*;
	import util.*;
	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.List;

	public class GestionPersonnelApp extends JFrame {
	    private List<Personnel> personnelList;
	    private Magasin magasin;
	    private Pret pret;
	    private boolean personnelLoaded;

	    public GestionPersonnelApp() {
	        personnelList = new ArrayList<>();
	        magasin = new Magasin();
	        pret = new Pret();
	        personnelLoaded = false;
	        
	        setTitle("Gestion du Personnel");
	        setSize(800, 600);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

	        JButton btnLoad = new JButton("Charger Personnel");
	        JButton btnAffichage = new JButton("Afficher Personnel");
	        JButton btnModifPersonnel = new JButton("Modifier Personnel");
	        JButton btnSupprimerPersonnel = new JButton("Supprimer Personnel");
	        JButton btnAjoutPersonnel = new JButton("Ajouter Personnel");
	        JButton btnMag = new JButton("Créer Magasin");
	        JButton btnPret = new JButton("Emprunter Matériel");
	        JButton btnRetour = new JButton("Restituer Matériel");
	        JButton btnSauvegarde = new JButton("Sauvegarder");
	        JButton btnClose = new JButton("Fermer");

	        btnLoad.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (!personnelLoaded) {
	                    chargerPersonnel();
	                    personnelLoaded = true;
	                } else {
	                    JOptionPane.showMessageDialog(null, "Le personnel est déjà chargé.");
	                }
	            }
	        });

	        btnAffichage.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (personnelLoaded) {
	                    afficherPersonnel();
	                } else {
	                    JOptionPane.showMessageDialog(null, "Veuillez charger le personnel d'abord.");
	                }
	            }
	        });

	        btnModifPersonnel.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (personnelLoaded) {
	                    modifierPersonnel();
	                } else {
	                    JOptionPane.showMessageDialog(null, "Veuillez charger le personnel d'abord.");
	                }
	            }
	        });

	        btnSupprimerPersonnel.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (personnelLoaded) {
	                    supprimerPersonnel();
	                } else {
	                    JOptionPane.showMessageDialog(null, "Veuillez charger le personnel d'abord.");
	                }
	            }
	        });

	        btnAjoutPersonnel.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (personnelLoaded) {
	                    ajouterPersonnel();
	                } else {
	                    JOptionPane.showMessageDialog(null, "Veuillez charger le personnel d'abord.");
	                }
	            }
	        });

	        btnMag.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                creerMagasin();
	            }
	        });

	        btnPret.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (personnelLoaded) {
	                    emprunterMateriel();
	                } else {
	                    JOptionPane.showMessageDialog(null, "Veuillez charger le personnel et créer le magasin d'abord.");
	                }
	            }
	        });

	        btnRetour.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                restituerMateriel();
	            }
	        });

	        btnSauvegarde.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                sauvegarder();
	            }
	        });

	        btnClose.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });

	        add(btnLoad);
	        add(btnAffichage);
	        add(btnModifPersonnel);
	        add(btnSupprimerPersonnel);
	        add(btnAjoutPersonnel);
	        add(btnMag);
	        add(btnPret);
	        add(btnRetour);
	        add(btnSauvegarde);
	        add(btnClose);
	    }

	    private void chargerPersonnel() {
	        // Chargement initial des membres du personnel
	        // Exemple d'ajout :
	        personnelList.add(new Personnel(1, "Doe", "John", Sexe.HOMME, new MyDate("01/01/1980"), "john.doe@example.com", Departement.IT));
	        // Ajouter d'autres membres...
	    }

	    private void afficherPersonnel() {
	        // Afficher la liste du personnel dans la console
	        System.out.println("+---------------+--------------+--------------+--------+---------------+---------------------+");
	        System.out.println("| Département   | Prénom       | Nom          | Sexe   | Naissance     | Email               |");
	        System.out.println("+---------------+--------------+--------------+--------+---------------+---------------------+");
	        for (Personnel p : personnelList) {
	            if (p.isActif()) {
	                System.out.println(p);
	            }
	        }
	        System.out.println("+---------------+--------------+--------------+--------+---------------+---------------------+");
	    }

	    private void modifierPersonnel() {
	        // Modifier les données d'une personne spécifique
	        // Code de modification...
	    }

	    private void supprimerPersonnel() {
	        // Suppression logique d'un membre du personnel
	        // Code de suppression...
	    }

	    private void ajouterPersonnel() {
	        // Ajouter un nouveau membre du personnel
	        // Code d'ajout...
	    }

	    private void creerMagasin() {
	        // Créer le magasin et ajouter des produits
	        magasin.ajouterProduit("Stylo");
	        magasin.ajouterProduit("Papier");
	        // Ajouter d'autres produits...
	    }

	   

}
