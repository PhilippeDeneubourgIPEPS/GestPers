import javax.swing.*;
import gui.GestionPersonnelApp;
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GestionPersonnelApp gestionPersonnelApp = new GestionPersonnelApp();

                gestionPersonnelApp.setVisible(true);
            }
        });
    }
}

