import java.util.TimerTask;
/**
 *
 * @author Tomas Salgado
 */
public class Auto extends TimerTask{
    public Laberinto laberinto;
    public Celda celdaAuto;
    public int x,y,izquierda,abajo,derecha,arriba,girar,cont,direccion,paso;
    
    public Auto(Laberinto laberinto,int x,int y,int izquierda,int abajo,int derecha, int arriba,int direccion,int girar){
        this.x=x;
        this.y=y;
        this.izquierda=izquierda;
        this.abajo=abajo;
        this.arriba=arriba;
        this.derecha=derecha;
        this.direccion=direccion;
        this.girar=girar;
        cont=0;
        paso=0;
        this.laberinto=laberinto; 
        celdaAuto=new Celda(x,y,'K');
        laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K'; 
    }
    public void moverIzquierda(){
        if(izquierda!=cont){
            if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='J'){
                if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='A'){
                    if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='B'){
                        if(laberinto.celdas[celdaAuto.x-1][celdaAuto.y].tipo!='Z'){
                            if(paso==0){
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                                celdaAuto.x=celdaAuto.x-1;
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                                cont=cont+1;
                            }else{
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='Z';
                                celdaAuto.x=celdaAuto.x-1;
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                                cont=cont+1;
                                paso=0;
                            }
                        }else{
                            laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                            celdaAuto.x=celdaAuto.x-1;
                            laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                            cont=cont+1;
                            paso++;
                        }
                    }else{
                    }
                }else{
                    
                }
            }else{
          
            }
        }else{
            if(direccion==1){
                cont=0;
                girar=1;
            }else{
                cont=0;
                girar=3;
            }          
        }
    }
    public void moverDerecha(){
        if(derecha!=cont){
        if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y].tipo!='B'){
                    if(laberinto.celdas[celdaAuto.x+1][celdaAuto.y].tipo!='Z'){
                            if(paso==0){
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                                celdaAuto.x=celdaAuto.x+1;
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                                cont=cont+1;
                            }else{
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='Z';
                                celdaAuto.x=celdaAuto.x+1;
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                                cont=cont+1;
                                paso=0;
                            }
                        }else{
                            laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                            celdaAuto.x=celdaAuto.x+1;
                            laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                            cont=cont+1;
                            paso++;
                        }
                }else{
                }
            }
        }
        }else{
            if(direccion==1){
                cont=0;
                girar=3;
            }else{
                cont=0;
                girar=1;
            }           
        }
    }
    public void moverArriba(){
        if(arriba!=cont){
        if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='B'){
                    if(laberinto.celdas[celdaAuto.x][celdaAuto.y-1].tipo!='Z'){
                            if(paso==0){
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                                celdaAuto.y=celdaAuto.y-1;
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                                cont=cont+1;
                            }else{
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='Z';
                                celdaAuto.y=celdaAuto.y-1;
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                                cont=cont+1;
                                paso=0;
                            }
                    }else{
                            laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                            celdaAuto.y=celdaAuto.y-1;
                            laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                            cont=cont+1;
                            paso++;
                        }
                }else{
                }
            }
        }
        }else{
            if(direccion==1){
                cont=0;
                girar=0;
            }else{
                cont=0;
                girar=2;
            }           
        }
    }
    public void moverAbajo(){
        if(abajo!=cont){
            if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='J'){
            if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='A'){
                if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='B'){
                    if(laberinto.celdas[celdaAuto.x][celdaAuto.y+1].tipo!='Z'){
                            if(paso==0){
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                                celdaAuto.y=celdaAuto.y+1;
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                                cont=cont+1;
                            }else{
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='Z';
                                celdaAuto.y=celdaAuto.y+1;
                                laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                                cont=cont+1;
                                paso=0;
                            }
                    }else{
                            laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='C';
                            celdaAuto.y=celdaAuto.y+1;
                            laberinto.celdas[celdaAuto.x][celdaAuto.y].tipo='K';
                            cont=cont+1;
                            paso++;
                        }
                }else{
                }
            }
            }
        }else{
            if(direccion==1){
                cont=0;
                girar=2;
            }else{
                cont=0;
                girar=0;
            }           
        }
        
    }
    
    @Override
    public void run(){
       
           if(girar==0){
            moverIzquierda();
            }
           if(girar==1){
                moverAbajo();
            }
            if(girar==2){
                moverDerecha();
            }
            if(girar==3){
                moverArriba();
            }      
                 
         
        laberinto.lienzoPadre.repaint();
    }
}
