
import java.util.Scanner;
public class produto_com_iva{
  public static void main (String[]args)
  
  {
    Scanner teclado = new Scanner (System.in);


    double iva = 0.15;

    System.out.print("Digita o nome do produto: ");
    String nome =teclado.nextLine();

    System.out.print("Digita o preço do produto: ");
    int preco = teclado.nextInt();

    System.out.print("Digita a quantideda do produto: ");
    int quantidade = teclado.nextInt();

    double subtotal = preco*quantidade;
    double total_iva = subtotal * iva;

    System.out.print("O SUBTOTAL É: " + subtotal);
System.out.print(". O PREÇO TOTAL É: " + total_iva);
  }

}