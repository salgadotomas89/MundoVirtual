import java.awt.Graphics;
/**
 *
 * @author Tomas Salgado
 */
public class Cartero implements Constantes{
    public Laberinto laberinto;
    public Celda celdaCartero;
    public Graphics g;
    public int h=1;
    public int paso;
    //contructor de la clase cartero a la que le pasamos como argumento un objeto laberinto
    public Cartero(Laberinto laberinto){
        this.laberinto=laberinto;
        paso=0;
        celdaCartero=new Celda(4,4,'J');
        laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';        
    }
    
    //metodos para mover la celdaCartero 
    public void moverCeldaArriba(){
        if (celdaCartero.y > 1 ) {
            if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo=='V'
            ||laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo=='V'||laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo=='P'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo=='P'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo=='P'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo!='K'&&laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo!='K'&&laberinto.celdas[celdaCartero.x+2][celdaCartero.y-1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-2][celdaCartero.y-1].tipo!='K'&&laberinto.celdas[celdaCartero.x+3][celdaCartero.y-1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-3][celdaCartero.y-1].tipo!='K'&&laberinto.celdas[celdaCartero.x+4][celdaCartero.y-1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-4][celdaCartero.y-1].tipo!='K'&&laberinto.celdas[celdaCartero.x+5][celdaCartero.y-1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-5][celdaCartero.y-1].tipo!='K'){
                    if(laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo!='V'){
                        if(laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo!='A'){
                            if(laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo!='Z'){
                                if(laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo!='P'){//si la celda x+1 != de portal
                                    if(laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo!='P'){
                                        laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';//vereda
                                        celdaCartero.y=celdaCartero.y-1;
                                        laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                    }else{
                                        laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='P';
                                        celdaCartero.y=celdaCartero.y-1;
                                        laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                        laberinto.lienzoPadre.esta(1);
                                    }                            
                                }else{
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';
                                    celdaCartero.y=celdaCartero.y-1;
                                    laberinto.lienzoPadre.esta(2);
                                } 
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';//vereda
                                celdaCartero.y=celdaCartero.y-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }                                                   
                        }
                    }
                }
            }else{//si estamos en la calle                
                if(laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo!='K'){//auto
                    if(laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo!='A'){//peaton
                        if(laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo!='Z'){//paso
                            if(paso==0){
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='C';
                                celdaCartero.y=celdaCartero.y-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='Z';
                                celdaCartero.y=celdaCartero.y-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=0;
                            }
                        }else{
                            if(paso==1){
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='Z';
                                celdaCartero.y=celdaCartero.y-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='C';
                                celdaCartero.y=celdaCartero.y-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1; 
                            }
                        }
                    }
                }                
            } 
        }
    }
    public void moverCeldaAbajo(){
        if (celdaCartero.y < alturaMundoVirtual ) {
           if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo=='V'
            ||laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo=='V'||laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo=='P'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo=='P'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo=='P'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo!='K'&&laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo!='K'&&laberinto.celdas[celdaCartero.x+2][celdaCartero.y+1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-2][celdaCartero.y+1].tipo!='K'&&laberinto.celdas[celdaCartero.x+3][celdaCartero.y+1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-3][celdaCartero.y+1].tipo!='K'&&laberinto.celdas[celdaCartero.x+4][celdaCartero.y+1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-4][celdaCartero.y+1].tipo!='K'&&laberinto.celdas[celdaCartero.x+5][celdaCartero.y+1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-5][celdaCartero.y+1].tipo!='K'){
                    if(laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo!='A'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo!='Z'){
                                if(laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo!='P'){//si la celda x+1 != de portal
                                if(laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo!='P'){
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';
                                    celdaCartero.y=celdaCartero.y+1;
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                }else{
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='P';
                                    celdaCartero.y=celdaCartero.y+1;
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                    laberinto.lienzoPadre.esta(1);
                                }                            
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';
                                celdaCartero.y=celdaCartero.y+1;
                                laberinto.lienzoPadre.esta(2);
                            }  
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';//vereda
                                celdaCartero.y=celdaCartero.y+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }
                                                  
                        }
                    }
                }
            }else{//si estamos en la calle
                if(laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo!='K'){
                    if(laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo!='A'){
                        if(laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo!='Z'){//paso
                            if(paso==0){
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='C';
                                celdaCartero.y=celdaCartero.y+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='Z';
                                celdaCartero.y=celdaCartero.y+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=0;
                            }
                        }else{
                            if(paso==1){
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='Z';
                                celdaCartero.y=celdaCartero.y+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='C';
                                celdaCartero.y=celdaCartero.y+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }
                        }
                    }
                }
            } 
        }
    }
    public void moverCeldaIzquierda(){
        if (celdaCartero.x > 1 ) {
          if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo=='V'
            ||laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo=='V'||laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo=='P'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo=='P'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo=='P'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo!='K'&&laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo!='K'&&laberinto.celdas[celdaCartero.x-1][celdaCartero.y+2].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-1][celdaCartero.y-2].tipo!='K'&&laberinto.celdas[celdaCartero.x-1][celdaCartero.y+3].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-1][celdaCartero.y-3].tipo!='K'&&laberinto.celdas[celdaCartero.x-1][celdaCartero.y+4].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-1][celdaCartero.y-4].tipo!='K'&&laberinto.celdas[celdaCartero.x-1][celdaCartero.y+5].tipo!='K'
                &&laberinto.celdas[celdaCartero.x-1][celdaCartero.y-5].tipo!='K'){
                    if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo!='A'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo!='Z'){
                                if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo!='P'){//si la celda x+1 != de portal
                                if(laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo!='P'){
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';
                                    celdaCartero.x=celdaCartero.x-1;
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                }else{
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='P';
                                    celdaCartero.x=celdaCartero.x-1;
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                    laberinto.lienzoPadre.esta(1);
                                }                            
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';
                                celdaCartero.x=celdaCartero.x-1;
                                laberinto.lienzoPadre.esta(2);
                            }
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';//vereda
                                celdaCartero.x=celdaCartero.x-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }
                                                    
                        }
                    }
                }
            }else{//si estamos en la calle
                if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo!='K'){
                    if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo!='A'){
                        if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo!='Z'){//paso
                            if(paso==0){
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='C';
                                celdaCartero.x=celdaCartero.x-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='Z';
                                celdaCartero.x=celdaCartero.x-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=0;
                            }
                        }else{
                            if(paso==1){
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='Z';
                                celdaCartero.x=celdaCartero.x-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='C';
                                celdaCartero.x=celdaCartero.x-1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }
                        }
                    }
                }
            } 
        }
    }
    public void moverCeldaDerecha(){
        if (celdaCartero.x < anchuraMundoVirtual ) {
            if(laberinto.celdas[celdaCartero.x-1][celdaCartero.y].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo=='V'
            ||laberinto.celdas[celdaCartero.x][celdaCartero.y+1].tipo=='V'||laberinto.celdas[celdaCartero.x][celdaCartero.y-1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo=='V'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo=='V'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y-1].tipo=='P'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo=='P'
            ||laberinto.celdas[celdaCartero.x-1][celdaCartero.y+1].tipo=='P'||laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo=='P'){
                //estamos en la vereda
                if(laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo!='K'&&laberinto.celdas[celdaCartero.x+1][celdaCartero.y+1].tipo!='K'
                &&laberinto.celdas[celdaCartero.x+1][celdaCartero.y-1].tipo!='K'&&laberinto.celdas[celdaCartero.x+1][celdaCartero.y+2].tipo!='K'
                &&laberinto.celdas[celdaCartero.x+1][celdaCartero.y-2].tipo!='K'&&laberinto.celdas[celdaCartero.x+1][celdaCartero.y+3].tipo!='K'
                &&laberinto.celdas[celdaCartero.x+1][celdaCartero.y-3].tipo!='K'&&laberinto.celdas[celdaCartero.x+1][celdaCartero.y+4].tipo!='K'
                &&laberinto.celdas[celdaCartero.x+1][celdaCartero.y-4].tipo!='K'&&laberinto.celdas[celdaCartero.x+1][celdaCartero.y+5].tipo!='K'
                &&laberinto.celdas[celdaCartero.x+1][celdaCartero.y-5].tipo!='K'){
                    if(laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo!='V'){//si la celda x+1 no es auto
                        if(laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo!='A'){//si la celda x+1 no es adversario
                            if(laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo!='Z'){
                                if(laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo!='P'){//si la celda x+1 != de portal
                                if(laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo!='P'){
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';
                                    celdaCartero.x=celdaCartero.x+1;
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                }else{
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='P';
                                    celdaCartero.x=celdaCartero.x+1;
                                    laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                    laberinto.lienzoPadre.esta(1);
                                }                            
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';
                                celdaCartero.x=celdaCartero.x+1;
                                laberinto.lienzoPadre.esta(2);
                            } 
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='B';//vereda
                                celdaCartero.x=celdaCartero.x+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }
                                                   
                        }
                    }
                }
            }else{//si estamos en la calle
                if(laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo!='K'){
                    if(laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo!='A'){
                        if(laberinto.celdas[celdaCartero.x+1][celdaCartero.y].tipo!='Z'){//paso
                            if(paso==0){
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='C';
                                celdaCartero.x=celdaCartero.x+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='Z';
                                celdaCartero.x=celdaCartero.x+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=0;
                            }
                        }else{
                            if(paso==1){
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='Z';
                                celdaCartero.x=celdaCartero.x+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }else{
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='C';
                                celdaCartero.x=celdaCartero.x+1;
                                laberinto.celdas[celdaCartero.x][celdaCartero.y].tipo='J';
                                paso=1;
                            }
                        }
                    }
                }
            }              
        }
    }    
}
