
import java.util.Scanner;

 public class conversao_para_fahrenheit_execicio4{
    public static void main (String[]args)

    {
        Scanner teclado = new Scanner (System.in);

        float C;

          System.out.print("\n DIGITA O VALOR DA TEMPERATURA EM GRAU CELSIUS À SER CONVERTIDA: ");

             C = teclado.nextFloat();
                 int  F = (int) C * 9/5+32;

                     System.out.print("\n O VALOR DIGETADO CONVERTIDO EM FAHRENHEIT É: " +F);



    }
}