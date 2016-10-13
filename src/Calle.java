/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tomas Salgado
 */
public class Calle {
    public Laberinto laberinto;
    public Celda carretera;
    
    public Calle(Laberinto laberinto){
        this.laberinto=laberinto;       
        insertarCarretera();
    }
    
    public void insertarCarretera(){
        //horizontal
        for(int i=3;i<10;i++){
            carretera=new Celda(i,3,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(i,9,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
        }
        //vertical
        for(int i=4;i<9;i++){
            carretera=new Celda(3,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(9,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';            
        }
        //horizontal
        for(int i=10;i<17;i++){
            carretera=new Celda(i,3,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(i,9,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
        }
        //vertical
        for(int i=4;i<9;i++){
            carretera=new Celda(10,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(16,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';            
        }
        //horizontal
        for(int i=3;i<10;i++){
            carretera=new Celda(i,10,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(i,16,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
        }
        //vertical
        for(int i=11;i<17;i++){
            carretera=new Celda(3,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(9,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';            
        }
        //horizontal
        for(int i=10;i<17;i++){
            carretera=new Celda(i,10,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(i,16,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
        }
        //vertical
        for(int i=10;i<16;i++){
            carretera=new Celda(10,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(16,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';            
        }
    }
}
