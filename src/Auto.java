import java.util.TimerTask;


/**
 *
 * @author Tomas Salgado
 */
public class Auto extends TimerTask{
    public Laberinto laberinto;
    public Celda celdaAuto;
    
    public Auto(Laberinto laberinto){
        this.laberinto=laberinto; 
        celdaAuto=new Celda(15,3,'K');
        laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K'; 
    }
    public void moverIzquierda(){
        if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='V'){
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                    celdaAuto.x=celdaAuto.x-1;
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                }
            }
        }
    }
    public void moverDerecha(){
        if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y-1].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y-1].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y-1].tipo!='V'){
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                    celdaAuto.x=celdaAuto.x+1;
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                }
            }
        }
    }
    public void moverArriba(){
        if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='V'){
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                    celdaAuto.y=celdaAuto.y-1;
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                }
            }
        }
    }
    public void moverAbajo(){
        if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='V'){
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                    celdaAuto.y=celdaAuto.y+1;
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                }
            }
        }
    }
    
    @Override
    public void run(){
        moverIzquierda();
    }
}
