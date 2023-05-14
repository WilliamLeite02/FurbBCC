
import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_4 = new DecimalFormat("0.0000");

    // Entrada
    double pi = 3.14159; // já informado no enunciado
    double raio = teclado.nextDouble();

    // Processo
    // double area = pi * raio * raio;
    double area = pi * Math.pow(raio, 2); // usar Math

    // Saída
    System.out.println("A=" + df_4.format(area));
    teclado.close();
  }
}

/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * 2.00
 * A=12.5664
 * _ Caso 2 ___
 * 100.64
 * A=31819.3103
 * _ Caso 3 ___
 * 150.00
 * A=70685.7750
 */