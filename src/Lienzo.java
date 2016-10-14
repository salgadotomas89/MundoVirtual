import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import javax.imageio.ImageIO;
/**
 *
 * @author Tomas Salgado
 */
public class Lienzo extends Canvas implements Constantes{
    public Laberinto laberinto;
    public Image fondo;
    //para implementar el doble buffer para que no se repinten los elementos
    public Graphics graficoBuffer;
    public Image imagenBuffer;
    //entidades del juego
    public Cartero cartero;
    public Auto auto;
    public Peaton peaton;
    public Calle calle;
    public Vereda vereda;
    public Portal portal;
    public int estado=1;
    public Timer lanzadorPeaton, lanzadorAuto;
    
    public Lienzo(){
        laberinto=new Laberinto(this);
        vereda= new Vereda(laberinto);
        calle=new Calle(laberinto);
        auto=new Auto(laberinto);
        cartero=new Cartero(laberinto);
        peaton=new Peaton(laberinto);
        portal=new Portal(laberinto);
               
        try {
        fondo = ImageIO.read(new File("imagenes/fondo.jpg"));
        }catch (IOException e){
            System.out.println(e.toString());
        }
        //dimensiones del lienzo
        this.setSize(laberinto.anchuraLaberinto,laberinto.alturaLaberinto);
               
        //escuchador eventos de teclado
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
            laberinto.moverCelda(e);//lanzamos el metodo moverCelda de la clase Laberinto
            repaint();//se actualiza el lienzo
            }
        });
        
        lanzadorPeaton=new Timer();
        lanzadorPeaton.scheduleAtFixedRate(peaton,0,1000);
        lanzadorAuto=new Timer();
        lanzadorAuto.scheduleAtFixedRate(auto,0,1000);
    }
    
    public void esta(int x){
        estado=x;
    }
    
    @Override
    public void update(Graphics g) {
        //inicialización del buffer gráfico mediante la imagen
        if(graficoBuffer==null){
            imagenBuffer=createImage(this.getWidth(),this.getHeight());
            graficoBuffer=imagenBuffer.getGraphics();
        }
        //volcamos color de fondo e imagen en el nuevo buffer grafico
        graficoBuffer.setColor(getBackground());
        graficoBuffer.fillRect(0,0,this.getWidth(),this.getHeight());
        graficoBuffer.drawImage(fondo, 0, 0, null);
        laberinto.update(graficoBuffer);
        //pintamos la imagen previa
        g.drawImage(imagenBuffer, 0, 0, null);
        if(estado!=1){
            g.drawString("EL CARTERO SE ENCUENTRA EN EL PORTAL", 700,60);

        }else{
            g.drawString("PORTAL", 700,60);
        }
        
    }
    
    //metodo llamada la primera que se pinta
    @Override
    public void paint(Graphics g) {
        update(g);
    }
    
    
        
}