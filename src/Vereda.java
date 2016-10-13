
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
        for(int i=4;i<9;i++){
            celdaVereda=new Celda(i,4,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(i,8,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
        }
        //vertical
        for(int i=5;i<8;i++){
            celdaVereda=new Celda(4,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(8,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            
        }
        //horizontal
        for(int i=11;i<16;i++){
            celdaVereda=new Celda(i,4,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(i,8,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
        }
        //vertical
        for(int i=5;i<8;i++){
            celdaVereda=new Celda(11,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(15,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            
        }
        //horizontal
        for(int i=11;i<16;i++){
            celdaVereda=new Celda(i,11,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(i,15,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
        }
        //vertical
        for(int i=11;i<16;i++){
            celdaVereda=new Celda(11,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(15,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            
        }
        //horizontal
        for(int i=4;i<9;i++){
            celdaVereda=new Celda(i,11,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(i,15,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
        }
        //vertical
        for(int i=11;i<16;i++){
            celdaVereda=new Celda(4,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            celdaVereda=new Celda(8,i,'B');
            laberinto.celdas[celdaVereda.x][celdaVereda.y].tipo='B';
            
        }
    }
}
