import java.util.TimerTask;


/**
 *
 * @author Tomas Salgado
 */
public class Auto extends TimerTask{
    public Laberinto laberinto;
    public Celda celdaAuto;
    public int direccion;
    public int x,y;
    
    public Auto(Laberinto laberinto){
        this.laberinto=laberinto; 
        celdaAuto=new Celda(15,3,'K');
        laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K'; 
        direccion=0;
    }
    public void moverIzquierda(){
        if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='B'){
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                    celdaAuto.x=celdaAuto.x-1;
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                }else{
                    direccion=1;
                }
            }
        }
    }
    public void moverDerecha(){
        if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y].tipo!='B'){
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                    celdaAuto.x=celdaAuto.x+1;
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                }else{
                    direccion=3;
                }
            }
        }
    }
    public void moverArriba(){
        if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='B'){
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                    celdaAuto.y=celdaAuto.y-1;
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                }else{
                    direccion=0;
                }
            }
        }
    }
    public void moverAbajo(){
        if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='B'){
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                    celdaAuto.y=celdaAuto.y+1;
                    laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                }else{
                    direccion=2;
                }
            }
        }
    }
    
    @Override
    public void run(){
        if(direccion==0){
            moverIzquierda();
        }
        if(direccion==1){
            moverAbajo();
        }
        if(direccion==2){
            moverDerecha();
        }
        if(direccion==3){
            moverArriba();
        }
        
        
        
        laberinto.lienzoPadre.repaint();
    }
}
