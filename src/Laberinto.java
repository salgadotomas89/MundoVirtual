import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;

/**
 *
 * @author Tomas Salgado
 */
public class Laberinto extends JComponent implements Constantes {
    public int anchuraLaberinto,alturaLaberinto;//dimensiones del laberinto
    public Celda[][] celdas;//las casillas n x m
    public Celda calle;
    public Lienzo lienzoPadre;
        
    public Laberinto(Lienzo lienzopadre) {
        this.lienzoPadre=lienzopadre;
        celdas=new Celda[anchuraMundoVirtual][alturaMundoVirtual];
        
        //inicializar el array de celdas
        for(int i=0; i < anchuraMundoVirtual; i++)
            for ( int j=0 ; j < alturaMundoVirtual ; j++)              
                celdas[i][j]=new Celda(i+(i*anchuraCelda),j+(j*alturaCelda),'V');
                
                //colocamos una celda en la posición 0,0 y la marcamos true para que aparezca en negrita
                //ancho y largo del laberinto
                this.anchuraLaberinto=anchuraMundoVirtual*anchuraCelda;
                this.alturaLaberinto=alturaMundoVirtual*alturaCelda;
                this.setSize(anchuraLaberinto,alturaLaberinto);
    }
        

    @Override
    public void update(Graphics g) {
        for(int i=0; i < anchuraMundoVirtual ; i++)
            for ( int j=0 ; j < alturaMundoVirtual; j++)
                celdas[i][j].update(g);
    }
        
    @Override
    public void paintComponent(Graphics g) {
        update(g);
    }
        
        
        
    public void moverCelda( KeyEvent evento ) {
        switch( evento.getKeyCode() ) {
        case KeyEvent.VK_UP:
            lienzoPadre.cartero.moverCeldaArriba();
        break;
        case KeyEvent.VK_DOWN:
            lienzoPadre.cartero.moverCeldaAbajo();
        break;
        case KeyEvent.VK_LEFT:
            lienzoPadre.cartero.moverCeldaIzquierda();
        break;
        case KeyEvent.VK_RIGHT:
            lienzoPadre.cartero.moverCeldaDerecha();
        break;
        }
    }
              
}
