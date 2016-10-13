import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.io.IOException;
/**
 *
 * @author Tomas Salgado
 */

public class VentanaPrincipal extends JFrame {
    //nuestra clase se compone de un lienzo de dibujo (herada de canvas)
    public Lienzo lienzo;
    //constructor
    public VentanaPrincipal() {
        lienzo=new Lienzo();
        lienzo.setFocusable(true);
        lienzo.requestFocus();
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(lienzo);
        this.setSize(lienzo.getWidth(),lienzo.getHeight());
    }
}