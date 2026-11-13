
import java.util.Scanner;

public class coverte_unidade_de_tempo_exercicio6{
    public static void main (String[]args)

    {
        Scanner teclado = new Scanner (System.in);

        int segundos , horas, minutos, tempo;

        System.out.print("\n DIGITA O VALOR  EM SEGUNDO (s) QUE SERÁ CONVERTIDO: ");

        tempo = teclado.nextInt();
        // Processamento dos dados

        horas = tempo/3600;
        minutos =(horas%3600)/60;
        segundos = minutos%60;


        System.out.print("\n O VALOR DIGETADO : "+tempo+" EM SEGUNDOS");
        System.out.print("; CORRESPONDE: "+horas+" HORAS ");
        System.out.print( +minutos+" MINUTOS E "+segundos+" SEGUNDOS." );

    }
}