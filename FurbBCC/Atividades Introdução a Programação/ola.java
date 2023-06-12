import java.util.Scanner;

public class ola {

    static void exe1() {
        Scanner w = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = w.nextInt();
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

    public static void main(String[] args) {
        exe1();

    }
}