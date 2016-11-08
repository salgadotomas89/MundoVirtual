import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Tomas Salgado
 */
public interface Constantes {
    public final int anchuraCelda=16;
    public final int alturaCelda=16;
    public final int anchuraMundoVirtual=80;
    public final int alturaMundoVirtual=42;
    
    //Para manejar los tipos de celdas
    public final char CARTERO='J';
    public final char PORTAL='P';
    public final char CARRETERA='C';
    public final char PEATON='A';
    public final char PARED='W';
    public final char PASO='Z';
    public final char VEREDA='B';
    
    //mostrar las celdas por encima del fondo
    public final int ALFA=50;
    public final Color COLORFONDO=new Color(153,217,234,ALFA);
    public final String RUTA="file://"+System.getProperty( "user.dir" );
    
    default int numeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        int numero_aleatorio = random.nextInt((maximo - minimo) + 1) + minimo;
        return numero_aleatorio;
    }

}
