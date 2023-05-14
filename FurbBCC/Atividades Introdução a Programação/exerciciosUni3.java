import java.util.Scanner;
import java.text.DecimalFormat;

public class exerciciosUni3 {

    static void exe1() {

        Scanner w = new Scanner(System.in);

        System.out.println("Informe base 1: ");
        int base1 = w.nextInt();

        System.out.println("Informe altura 1:");
        int altura1 = w.nextInt();

        int perimetro = (base1 * 2) + (altura1 * 2);
        int area = base1 * altura1;

        System.out.println("O perimetro do retangulo é: " + perimetro);
        System.out.println("A área do retangulo é: " + area);

    }

    static void exe2() {
        Scanner w = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");

        System.out.println("Informe o valor do sapato: ");
        double sapato = w.nextDouble();

        double desconto = (sapato * 0.12);
        double sapatod = (sapato - desconto);

        System.out.println("O valor do desconto é de R$: " + d.format(desconto));
        System.out.println("valor com desconto " + d.format(sapatod));
    }

    static void exe3() {
        Scanner w = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("Infome o valor da gasolina: ");
        double valor = w.nextDouble();
        System.out.println("Informe o valor a abastecer: ");
        double valor2 = w.nextDouble();

        double litros = valor2 / valor;

        System.out.println("total de litros: " + d.format(litros));

    }

    static void exe4() {
        Scanner w = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        double nota1, nota2, nota3;

        nota1 = w.nextDouble();
        if (nota1 < 0 || nota1 > 10)
            while (nota1 < 0 || nota1 > 10) {
                nota1 = w.nextDouble();
            }

        nota2 = w.nextDouble();
        if (nota2 < 0 || nota2 > 10)
            while (nota2 < 0 || nota2 > 10) {
                nota2 = w.nextDouble();
            }
        nota3 = w.nextDouble();
        if (nota3 < 0 || nota3 > 10)
            while (nota3 < 0 || nota3 > 10) {
                nota3 = w.nextDouble();
            }

        double peso = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;

        System.out.println("Sua média é de: " + peso);
    }

    static void exe5() {
        Scanner w = new Scanner(System.in);

        System.out.println("informe quantidade de frangos: ");
        int frango = w.nextInt();

        float gasto = frango * 11;

        System.out.println("Gasto total com os frangos marcados 3 chips R$: " + gasto);

    }

    static void exe6() {
        Scanner w = new Scanner(System.in);

        double pesoPrato = 0.75; // em quilos
        double precoQuilo = 25.0;

        System.out.print("Digite o peso do prato: ");
        double prato = w.nextDouble();

        double precoAPagar = prato * precoQuilo;

        System.out.println("O valor a pagar é de R$" + precoAPagar);

    }

    static void exe7() {
        Scanner w = new Scanner(System.in);

        System.out.println("digite a quantidade a comprar de 350ml: ");
        int qtd350 = w.nextInt();
        System.out.println("digite a quantidade a comprar de 600ml: ");
        int qtd600 = w.nextInt();
        System.out.println("digite a quantidade a comprar de 2litros: ");
        int qtd2l = w.nextInt();

        int litros = (qtd350 * 350) + (qtd600 * 600) + (qtd2l * 2000);

        System.out.println("total de litros: " + litros);

    }

    static void exe8() {
        Scanner w = new Scanner(System.in);

        System.out.println("informe o valor a trocar por Real R$: ");
        double dolar = w.nextDouble();

        double cambio = dolar * 5.20;

        System.out.println("valor a receber R$: " + cambio);

    }

    static void exe9() {
        Scanner w = new Scanner(System.in);

        System.out.println("informe raio: ");
        double raio = w.nextDouble();
        System.out.println("informe altura da lata: ");
        double altura = w.nextDouble();

        double volume = 3.14159 * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata é de :" + volume);

    }

    static void exe10() {
        Scanner w = new Scanner(System.in);

        System.out.print("Digite o comprimento do cateto 1: ");
        double cateto1 = w.nextDouble();

        System.out.print("Digite o comprimento do cateto 2: ");
        double cateto2 = w.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("A hipotenusa tem comprimento " + (int) hipotenusa);

    }

    static void exe11() {
        Scanner w = new Scanner(System.in);

        System.out.println("informe o valor a converter a Fahrenheit: ");
        double far = w.nextDouble();

        double F = (9 / 5) + far + 32;

        System.out.println("temperatura é de: " + F + " graus");

    }

    static void exe12() {
        Scanner w = new Scanner(System.in);
        System.out.print("Informe o nome do funcionário: ");
        String nome = w.nextLine();

        System.out.print("Informe o número de horas trabalhadas mensais: ");
        int horasTrabalhadas = w.nextInt();

        System.out.print("Informe o número de dependentes: ");
        int numDependentes = w.nextInt();

        double salarioBruto = (horasTrabalhadas * 10) + (numDependentes * 60);
        double inss = salarioBruto * 0.085;
        double impostoRenda = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - inss - impostoRenda;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

    }

    static void exe13() {
        Scanner w = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("informe o comprimento: ");
        float comprimento = w.nextFloat();
        System.out.println("informe a altura: ");
        float altura = w.nextFloat();

        double area = comprimento * altura;
        double azuleijo = area * 9;
        double valor = azuleijo * 12.50;

        System.out.println("o valor será de: " + d.format(valor) + " total de azuleijos: " + azuleijo);

    }

    static void exe14() {
        Scanner w = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.print("Distância percorrida km: ");
        double distancia = w.nextDouble();

        System.out.print("Tempo de viajem: ");
        double tempo = w.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double combustivelGasto = distancia / 12;

        System.out.println("Velocidade média: " + d.format(velocidadeMedia) + "km/h");
        System.out.println("Quantidade de combustível gasto: " + combustivelGasto + " litros");

    }

    static void exe15() {
        Scanner w = new Scanner(System.in);

        System.out.println("informe um valor inteiro até 3 casas: ");
        int valor = w.nextInt();
        int centena = 0;
        int dezena = 0;
        int unidade = 0;

        while (valor >= 100) {
            centena = centena + 1;
            valor = valor - 100;
        }
        while (valor >= 10) {
            dezena = dezena + 1;
            valor = valor - 10;
        }
        while (valor >= 1) {
            unidade = unidade + 1;
            valor = valor - 1;
        }
        System.out.println("centenas: " + centena + " dezenas: " + dezena + " unidades: " + unidade);
    }
    static void exe16(){
        Scanner w = new Scanner(System.in);

    System.out.print("Valor da compra: ");
   double valorCompra = w.nextDouble();

   System.out.print("Valor pago: ");
   double valorPago = w.nextDouble();

   int valorTroco = (int) (valorPago - valorCompra);

   int nota100 = valorTroco / 100;
   valorTroco = valorTroco % 100;

   int nota10 = valorTroco / 10;
   valorTroco = valorTroco % 10;

   int nota1 = valorTroco;

   System.out.println("NOTAS DE R$100: " + nota100);
   System.out.println("NOTAS DE R$10: " + nota10);
   System.out.println("NOTAS DE R$1: " + nota1);
    }
    public static void main(String[] args) {

        // exe1();
        // exe2();
        // exe3();
        // exe4();
        // exe5();
        // exe6();
        // exe7();
        // exe8();
        // exe9();
        // exe10();
        // exe11();
        // exe12();
        // exe13();
        // exe14();
        //exe15();
        //exe16();
    }
}