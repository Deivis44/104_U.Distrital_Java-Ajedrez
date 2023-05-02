package Juego;

// import java.awt.Dimension;
// import java.awt.Image;
import java.io.File;
import javax.swing.*;

public class Prueba extends JFrame{
    
    public Prueba() {
        // int largo = 1200;
        // int ancho = 800;
        // int posX = (1920 - largo) / 2;
        // int posY = (1080 - ancho) / 2;

        setTitle("U Distrital - Ajedrez");
        // setLocation(360, 140);;
        setSize(1200, 844);
        // setSize(1200, 800);
        setLocationRelativeTo(null); // pone la ventana en el centro de la pantalla
        // setBounds(posX, posY, largo, ancho);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        fondo_juego();
    }

    private void fondo_juego() {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);

        File archivo = new File("imagenes/Previews/layout-juego4.png");
        String rutaCompleta = archivo.getAbsolutePath();
        ImageIcon fondo = new ImageIcon(rutaCompleta); 
        JLabel imagen = new JLabel(fondo);
        panel.add(imagen);
        
        // ImageIcon fondo = new ImageIcon("imagenes/Previews/layout-juego1.png"); 
        // Image imagen = fondo.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
        // ImageIcon imagenAjustada = new ImageIcon(imagen);
        // JLabel cosita = new JLabel(imagenAjustada);
        // cosita.setPreferredSize(new Dimension(1200,800));
        // panel.add(cosita);
    }
}
