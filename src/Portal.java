


/**
 *
 * @author Tomas Salgado
 */
public class Portal {
    public Laberinto laberinto;
    public Celda portal;
    
    public Portal(Laberinto laberinto){
        this.laberinto=laberinto;
        portal=new Celda(5,5,'P');
        laberinto.celdas[portal.x][portal.y].tipo='P';
    }
    
    
    
}
