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
    public Auto auto, auto1, auto2, auto3,auto4,auto5;
    public Peaton peaton, peaton1;
    public Calle calle;
    public Paso paso;
    public Vereda vereda;
    public Portal portal;
    public int estado=1;
    public Timer lanzadorPeaton, lanzadorAuto,lanzadorPeaton1;
    
    public Lienzo(){
        laberinto=new Laberinto(this);
        vereda= new Vereda(laberinto);
        calle=new Calle(laberinto);
        auto=new Auto(laberinto,63,4,59,29,59,29,1,0);//int izquierda,int abajo,int derecha, int arriba,int direccion,int girar
        auto1=new Auto(laberinto,43,14,19,9,19,9,1,0);
        auto2=new Auto(laberinto,3,34,61,31,61,31,0,3);
        auto3=new Auto(laberinto,3,3,61,31,61,31,0,2);
        auto4=new Auto(laberinto,64,3,61,31,61,31,0,1);
        auto5=new Auto(laberinto,64,34,61,31,61,31,0,0);
        cartero=new Cartero(laberinto);
        peaton=new Peaton(laberinto,14,5);
        peaton1=new Peaton(laberinto,31,15);
        portal=new Portal(laberinto);
        
        paso=new Paso(laberinto,5,13);
        paso=new Paso(laberinto,5,14);
               
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
        
        lanzadorPeaton1=new Timer();
        lanzadorPeaton1.scheduleAtFixedRate(peaton1,0,900);
        
        lanzadorAuto=new Timer();
        lanzadorAuto.scheduleAtFixedRate(auto,0,300);
        lanzadorAuto.scheduleAtFixedRate(auto1,0,300);
        lanzadorAuto.scheduleAtFixedRate(auto2,0,300);
        lanzadorAuto.scheduleAtFixedRate(auto3,0,300);
        lanzadorAuto.scheduleAtFixedRate(auto4,0,300);
        lanzadorAuto.scheduleAtFixedRate(auto5,0,300);

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
            g.drawString("EL CARTERO SE ENCUENTRA EN EL PORTAL", 700,20);

        }else{
            g.drawString("PORTAL", 700,20);
        }
        
    }
    
    //metodo llamada la primera que se pinta
    @Override
    public void paint(Graphics g) {
        update(g);
    }
    
    
        
}