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
        for(int i=3;i<65;i++){
            carretera=new Celda(i,3,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(i,4,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
        }
        for(int i=3;i<65;i++){
            carretera=new Celda(i,13,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(i,14,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
        }
        for(int i=3;i<65;i++){
            carretera=new Celda(i,23,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(i,24,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
        }
        for(int i=3;i<65;i++){
            carretera=new Celda(i,33,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(i,34,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
        }
        //vertical
        for(int i=3;i<34;i++){
            carretera=new Celda(3,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(4,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';          
        }
        for(int i=3;i<34;i++){
            carretera=new Celda(23,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(24,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';          
        }
        for(int i=3;i<34;i++){
            carretera=new Celda(43,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(44,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';          
        }
         for(int i=3;i<34;i++){
            carretera=new Celda(63,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';
            carretera=new Celda(64,i,'C');
            laberinto.celdas[carretera.x][carretera.y].tipo='C';          
        }
        
    }
}
