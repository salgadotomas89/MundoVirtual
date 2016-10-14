import java.util.TimerTask;

/**
 *
 * @author Tomas Salgado
 */

public class Peaton extends TimerTask implements Constantes{
    public Laberinto laberinto;
    public Celda celdaPeaton;
    
    //contructor de la clase Peaton
    public Peaton(Laberinto laberinto){
        this.laberinto=laberinto;
        celdaPeaton=new Celda(14,4,'A');
        laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';              
    }
    
    public void moverAbajo(){
        if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='V'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='V'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y-1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y-1].tipo=='P'
            ||laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y+1].tipo=='P'||laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='K'){
                    if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='J'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y+1].tipo!='P'){//si la celda x+1 != de portal
                                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo!='P'){
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                    celdaPeaton.y=celdaPeaton.y+1;
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
                                }else{
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='P';
                                    celdaPeaton.y=celdaPeaton.y+1;
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
                                    laberinto.lienzoPadre.esta(1);
                                }                            
                            }else{
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                celdaPeaton.y=celdaPeaton.y+1;
                                laberinto.lienzoPadre.esta(2);
                            }                        
                        }
                    }
                }
            }else{//si estamos en la calle
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                celdaPeaton.y=celdaPeaton.y+1;
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
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
                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='K'){
                    if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='J'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y-1].tipo!='P'){//si la celda x+1 != de portal
                                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo!='P'){
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                    celdaPeaton.y=celdaPeaton.y-1;
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
                                }else{
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='P';
                                    celdaPeaton.y=celdaPeaton.y-1;
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
                                    laberinto.lienzoPadre.esta(1);
                                }                            
                            }else{
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                celdaPeaton.y=celdaPeaton.y-1;
                                laberinto.lienzoPadre.esta(2);
                            }                        
                        }
                    }
                }
            }else{//si estamos en la calle
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                celdaPeaton.y=celdaPeaton.y-1;
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
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
                if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='K'){
                    if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='J'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaPeaton.x+1][celdaPeaton.y].tipo!='P'){//si la celda x+1 != de portal
                                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo!='P'){
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                    celdaPeaton.x=celdaPeaton.x+1;
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
                                }else{
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='P';
                                    celdaPeaton.x=celdaPeaton.x+1;
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
                                    laberinto.lienzoPadre.esta(1);
                                }                            
                            }else{
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                celdaPeaton.x=celdaPeaton.x+1;
                                laberinto.lienzoPadre.esta(2);
                            }                        
                        }
                    }
                }
            }else{//si estamos en la calle
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                celdaPeaton.x=celdaPeaton.x+1;
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
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
                if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='K'){
                    if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='V'){
                        if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='J'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaPeaton.x-1][celdaPeaton.y].tipo!='P'){//si la celda x+1 != de portal
                                if(laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo!='P'){
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                    celdaPeaton.x=celdaPeaton.x-1;
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
                                }else{
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='P';
                                    celdaPeaton.x=celdaPeaton.x-1;
                                    laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
                                    laberinto.lienzoPadre.esta(1);
                                }                            
                            }else{
                                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='B';
                                celdaPeaton.x=celdaPeaton.x-1;
                                laberinto.lienzoPadre.esta(2);
                            }                        
                        }
                    }
                }
            }else{//si estamos en la calle
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='C';
                celdaPeaton.x=celdaPeaton.x-1;
                laberinto.celdas[celdaPeaton.x][celdaPeaton.y].tipo='A';
            } 
    }
    @Override
    public void run(){
        if(celdaPeaton.x>4){
            moverIzquierda();
        }else{
            moverAbajo();
        }
        laberinto.lienzoPadre.repaint();
    }
}
