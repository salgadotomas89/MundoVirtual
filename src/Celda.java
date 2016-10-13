import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author Tomas Salgado
 */
public class Celda extends JComponent implements Constantes {
        public int x, y;
        //tipo: guardara un caracter sobre el tipo de celda que se define
        public char tipo;
        public BufferedImage cartero,portal,pared,peaton,carretera,vereda,auto;

        
        //constructor
        public Celda(int x,int y,char tipo) {
            this.x=x;
            this.y=y;
            this.tipo=tipo;

            try {
            cartero = ImageIO.read(new File("imagenes/cartero.png"));
            portal = ImageIO.read(new File("imagenes/portal.png"));
            peaton = ImageIO.read(new File("imagenes/peaton.png"));
            carretera= ImageIO.read(new File("imagenes/carretera.png"));
            pared=ImageIO.read(new File("imagenes/pared.png"));
            vereda=ImageIO.read(new File("imagenes/vereda.png"));
            auto=ImageIO.read(new File("imagenes/auto.png"));
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        //metodo para dibujar celda, hace uso de drawRect
        @Override
        public void update(Graphics g) {
            switch(tipo) {
            case 'J': g.drawImage(cartero,x,y, null); break;
            case 'P': g.drawImage(portal,x,y, this); break;
            case 'C': g.drawImage(carretera,x,y, this); break;
            case 'A': g.drawImage(peaton,x,y, this); break;
            case 'W': g.drawImage(pared,x,y, this); break;
            case 'B': g.drawImage(vereda, x, y, this); break;
            case 'K': g.drawImage(auto, x, y, this); break;
            case 'V': g.setColor(COLORFONDO);
            g.fillRect(x, y,anchuraCelda,alturaCelda);
            break;

            }
        }
        
        @Override
        public void paintComponent(Graphics g) {
            update(g);
        }
     
        
}