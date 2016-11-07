


/**
 *
 * @author Tomas Salgado
 */
public class Portal {
    public Laberinto laberinto;
    public Celda portal;
    public int x,y;
    
    public Portal(Laberinto laberinto,int x, int y){
        this.laberinto=laberinto;
        this.x=x;
        this.y=y;
        portal=new Celda(x,y,'P');
        laberinto.celdas[portal.x][portal.y].tipo='P';
    }
    
    
    
}
