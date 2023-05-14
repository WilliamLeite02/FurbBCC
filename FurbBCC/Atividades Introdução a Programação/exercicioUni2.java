
import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicioUni2 {

    static void atividade1() {
        Scanner ler = new Scanner(System.in);

        System.out.println("somar num1: ");
        int num1 = ler.nextInt();
        System.out.print(num1);

        System.out.println("somar num2: ");
        int num2 = ler.nextInt();
        System.out.print(num2);

        int soma = num1 + num2;

        System.out.println("soma é " + soma);
    }

    static void atividade2() {
        Scanner ler = new Scanner(System.in);

        System.out.println("multiplicar num1: ");
        int num1 = ler.nextInt();

        System.out.println("multiplicar num2: ");
        int num2 = ler.nextInt();

        int multiplicar = num1 * num2;

        System.out.println("a multipliçao é " + multiplicar);
    }

    static void atividade4() {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2;
        double media;

        System.out.println("informe nota 1 ");
        nota1 = ler.nextDouble();
        if (nota1 < 0 || nota1 > 10)
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("a nota deve estar entre 0 e 10 insira nota 1 novamente");
                nota1 = ler.nextDouble();
            }

        System.out.println("informe nota 2 ");
        nota2 = ler.nextDouble();
        if (nota2 < 0 || nota2 > 10)
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("nota deve estar entre 0 a 10 insira nota 2 novamente");
                nota2 = ler.nextDouble();

            }
        media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.println("sua media é " + media);
    }

    static void atividade3() {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        double pi = 3.14159;
        System.out.println("informe o raio ");
        double raio = ler.nextDouble();

        double area = pi * raio * raio;

        System.out.println("A=" + df_4.format(area));

    }

    static void atividade5() {
        Scanner ler = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("digite a ");
        a = ler.nextInt();
        System.out.println("digite b ");
        b = ler.nextInt();
        System.out.println("digite c ");
        c = ler.nextInt();
        System.out.println("digite d ");
        d = ler.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println(diferenca);

    }

    static void atividade6() {
        Scanner ler = new Scanner(System.in);

    }

    public static void main(String[] args) {
        // atividade1();
        // atividade2();
        // atividade4();
        // atividade3();
        // atividade5();
        // atividade6();
    }

}
/*
 * area = raio * raio * 3.14159
 * escreva("area é " + area)
 * 
 */