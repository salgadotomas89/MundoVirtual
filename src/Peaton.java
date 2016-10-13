import java.util.TimerTask;

/**
 *
 * @author Tomas Salgado
 */
//extends TimerTask
public class Peaton implements Constantes{
    public Laberinto laberinto;
    public Celda celdaPeaton;
    
    //contructor de la clase Peaton
    public Peaton(Laberinto laberinto){
        this.laberinto=laberinto;
        celdaPeaton=new Celda(6,4,'A');
        laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';              
    }
    /*
    public void mover(){
        if(celdaPeaton.x>1){
            if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo!='J'){
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                celdaPeaton.x=celdaPeaton.x-1;
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';    
            }              
        }
       
        
        
                         
    }
    
    
    
    @Override
    public void run(){
        mover();
        laberinto.lienzoPadre.repaint();
    }
    */
}
