
/**
 *
 * @author Tomas Salgado
 */
public class Auto {
    public Laberinto laberinto;
    public Celda celdaAuto;
    
    public Auto(Laberinto laberinto){
        this.laberinto=laberinto; 
        celdaAuto=new Celda(8,3,'K');
        laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K'; 
    }
}
