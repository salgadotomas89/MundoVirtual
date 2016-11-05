
/**
 *
 * @author Tomas Salgado
 */
public class Paso {
    public Laberinto laberinto;
    public Celda celdaPaso;    
    public int x,y;
    
    public Paso(Laberinto laberinto,int x,int y){
        this.x=x;
        this.y=y;
        this.laberinto=laberinto; 
        celdaPaso=new Celda(x,y,'Z');
        laberinto.celdas[celdaPaso.x][celdaPaso.y].tipo='Z';         
    } 
}
