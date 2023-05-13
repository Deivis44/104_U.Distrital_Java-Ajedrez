package A.Juego;


public class Interfaz extends Tablero{
    
    public Interfaz() {
    }
    
    public void iniciarInterfaz() {
        Tablero ventana = new Tablero();
        ventana.setVisible(true);

        // F_Peones peones = new F_Peones();
        // imagen.add(peones.crear_peones());
    }

}