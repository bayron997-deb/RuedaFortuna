import java.util.Random;
import java.util.Scanner;

public class RuedaFortuna {
    private int[] casillas;
    Random rnum = new Random();
    Scanner in = new Scanner(System.in);

    public void inicializarRueda(int numeroCasillas) {
        numeroCasillas = preguntaNumeroCasillas();
        //crear arreglo con largo definido
        casillas = new int[numeroCasillas];
        //ciclo para inicializar la ruleta
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = rnum.nextInt(100)*100;
            //para que no se repita se hara otro arreglo de largo de verificacion, para que no se repitan el numero
            for (int j = 0; j < i; j++) {
                //si casillas i = casillas j se reducira i y buscara otro numero hasta que sean distintos y el programa siga con su trayecto
                if (casillas[i] == casillas[j]) {
                    i--;
                }
            }
        }
        for (int i = 0; i <casillas.length; i++) {
            System.out.println(casillas[i]);

        }
    }

    public int lanzarRueda() {
        //..
        return 0;
    }

    public int preguntaNumeroCasillas() {
        System.out.println("ingrese el número de casillas de la ruleta");
        int a = in.nextInt();
        return a;
    }

    public int validacion() {
        return 0;
    }
}
