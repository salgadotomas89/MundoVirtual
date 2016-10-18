
/**
 *
 * @author Tomas Salgado
 */
public class Vereda {
    public Laberinto laberinto;
    public Celda celdaVereda;
    
    public Vereda(Laberinto laberinto){
        this.laberinto=laberinto; 
        insertarVereda();
    }
    
    public void insertarVereda(){
        //horizontal
        
        for(int i=2;i<70;i++){
            celdaVereda=new Celda(i,2,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(i,5,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
        }
        for(int i=2;i<66;i++){
            celdaVereda=new Celda(i,12,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(i,15,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
        }
        for(int i=2;i<66;i++){
            celdaVereda=new Celda(i,22,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(i,25,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
        }
        for(int i=2;i<66;i++){
            celdaVereda=new Celda(i,32,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(i,35,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
        }
        //vertical
        
        for(int i=2;i<35;i++){
            celdaVereda=new Celda(2,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(5,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';         
        }
        for(int i=2;i<35;i++){
            celdaVereda=new Celda(22,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(25,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';         
        }
        for(int i=2;i<35;i++){
            celdaVereda=new Celda(42,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(45,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';         
        }
        for(int i=2;i<35;i++){
            celdaVereda=new Celda(62,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(65,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';         
        }
        
    }
}
