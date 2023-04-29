package Juego;
// Componentes Jlabel con texto e iconos. 
import java.awt.FlowLayout; 
// especifica cómo se van a ordenar los componentes 
import javax.swing.JLabel; 
// muestra texto e imágenes 
import javax.swing.JPanel; 
// constantes comunes utilizadas con Swing 
import javax.swing.Icon; 
// interfaz utilizada para manipular imágenes 
import javax.swing.ImageIcon; 
// carga las imágenes
 public class PanelEtiqueta extends JPanel { 
    private JLabel etiqueta1; // JLabel sólo con texto 
    private JLabel etiqueta2; // JLabel construida con texto y un icono 
    // El constructor de LabelFrame agrega objetos JLabel a JFrame 
    public PanelEtiqueta() { 
        super(); 
        setLayout(new FlowLayout()); 
        // establece el esquema del marco 
        // Constructor de JLabel con un argumento String 
        etiqueta1 = new JLabel("Etiqueta con texto");

etiqueta1.setToolTipText("Esta es etiqueta1");
//etiqueta de ayuda 
// Constructor de JLabel con argumentos de cadena, Icono y alineación 
Icon insecto = new ImageIcon("imagenes/tableros/tablero_default.png"); 
etiqueta2 = new JLabel(insecto); 
// constructor de JLabel sin argumentos 
add(etiqueta2); // agrega etiqueta2 a JPanel 

} 
} 
// fin de la clase LabelFrame
