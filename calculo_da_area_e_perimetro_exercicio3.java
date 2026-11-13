
import java.util.Scanner;

public class calculo_da_area_e_perimetro_exercicio3{
    public static void main (String[]args)

    {
        Scanner teclado = new Scanner (System.in);

        double raio;
        double area;
            double    perimetro;

        System.out.print("\n DIGITA O VALOR DO RAIO: ");

        raio = teclado.nextFloat();
        area =  Math.PI*raio*raio;
        perimetro =  2*Math.PI*raio;
                System.out.print("\n A ÁREA É: " +area);
        System.out.print("\n O PERIMETRO É: " +perimetro);



    }
}