import java.util.Random;
import java.util.Scanner;

public class RuedaFortuna {
    private int[] casillas;
    Random rnum = new Random();
    Scanner in  = new Scanner(System.in);

    public void inicializarRueda(int numeroCasillas){
        numeroCasillas = preguntaNumeroCasillas();
    }
    public int lanzarRueda(){
        //..
        return 0;
    }
    public int preguntaNumeroCasillas(int a){
        System.out.println("ingrese el número de casillas de la ruleta");
         a = in.nextInt();
        return a;
    }

    public int validacion() {
        return 0;
    }
}
