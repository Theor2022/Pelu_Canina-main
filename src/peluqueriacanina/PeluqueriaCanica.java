package peluqueriacanina;

import peluqueriacanina.igu.Principal;
import java.awt.Component;

public class PeluqueriaCanica {
    public PeluqueriaCanica() {
    }

    public static void main(String[] args) {
        //Conectamos con Principal y con cargador de datos
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
    }
    
}
