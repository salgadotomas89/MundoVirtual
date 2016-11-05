import java.util.TimerTask;

/**
 *
 * @author Tomas Salgado
 */

public class Peaton extends TimerTask implements Constantes{
    public Laberinto laberinto;
    public Celda celdaPeaton;
    public int direccion;
    public int x,y;
    
    //contructor de la clase Peaton
    public Peaton(Laberinto laberinto, int x,int y){
        this.x=x;
        this.y=y;
        this.laberinto=laberinto;
        celdaPeaton=new Celda(x,y,'A');//14y 5
        laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';    
        direccion=0;
    }
    
    public void moverAbajo(){
        if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='P'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='C'){
                    if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='J'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='Z'){
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                celdaPeaton.y=celdaPeaton.y+1;
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';        
                            }else{
                                direccion=2;
                            }                                                                                                                                 
                        }
                    }
                }else{
                        direccion=2;
                    
                    
                }
            }else{//si estamos en la calle
                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='K'){
                    if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='J'){//si la celda x+1 no es adversario
                            laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                            celdaPeaton.y=celdaPeaton.y+1;
                            laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';                                                                                                             
                        }
                    }
                }
            }                                     
    }
    public void moverArriba(){
        if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='P'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='C'){
                    if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='J'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='Z'){
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                celdaPeaton.y=celdaPeaton.y-1;
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';              
                            }else{
                                direccion=0;
                            }                                                                                                                   
                        }
                    }
                }else{
                    direccion=0;
                }
            }else{//si estamos en la calle
                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='K'){
                    if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='J'){//si la celda x+1 no es adversario                                
                            laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                            celdaPeaton.y=celdaPeaton.y-1;
                            laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';                                                                                                        
                        }
                    }
                }
            } 
    }
    public void moverDerecha(){
        if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='P'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='C'){
                    if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='V'){
                        if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='J'){//si la celda x+1 no es cartero 
                            if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='Z'){
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                celdaPeaton.x=celdaPeaton.x+1;
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';        
                            }else{
                                direccion=3;
                            }                                                                                                                     
                        }
                    }
                }else{
                    direccion=3;
                }
            }else{//si estamos en la calle
            
                if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='K'){
                    if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='J'){//si la celda x+1 no es adversario                           
                            laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                            celdaPeaton.x=celdaPeaton.x+1;
                            laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';                                                                                                 
                        }
                    }
                }
            
            }              
    }
    public void moverIzquierda(){
        if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='P'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='J'){
                    if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='V'){
                        if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='C'){//                           
                            if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='Z'){
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                celdaPeaton.x=celdaPeaton.x-1;
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';        
                            }else{
                                direccion=1;
                            }                           
                        }else{
                            direccion=1;
                        }
                    }
                }
            }else{//si estamos en la calle
                if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='J'){
                    if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='V'){
                        if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='K'){//si la celda x+1 no es adversario                            
                            laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                            celdaPeaton.x=celdaPeaton.x-1;
                            laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';                                
                        }
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
