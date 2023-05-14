import java.text.DecimalFormat;
import java.util.Scanner;

public class exerciciosUni4 {

    static void exe1() {
        Scanner w = new Scanner(System.in);

        System.out.println("Horas trabalhadas no mes : ");
        double horasM = w.nextDouble();

        System.out.println("valor pago por hora: ");
        double valorH = w.nextDouble();

        double salarioTotal = horasM * valorH;
        double salarioExtra = 0;
        if (horasM > 160) {
            salarioExtra = (horasM - 160) * (valorH / 2);
        } else {
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.println(" O salario total é : " + salarioTotal);

    }

    static void exe2() {
        Scanner w = new Scanner(System.in);

        System.out.println("escreva um valor inteiro maior que 0: ");
        int valor = w.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Numero é par");

        } else {
            System.out.println("Numero Impar");
        }

    }

    static void exe3() {
        Scanner w = new Scanner(System.in);

        System.out.println("escreva um numero inteiro numero 1: ");
        int num1 = w.nextInt();
        System.out.println("escreva um numero inteiro numero 2:");
        int num2 = w.nextInt();

        if (num1 > num2) {
            System.out.println("numero 1: " + num1 + " é maior que numero2: " + num2);
        } else {
            System.out.println("numero 2: " + num2 + " é maior que numero1: " + num1);
        }

    }

    static void exe4() {
        Scanner w = new Scanner(System.in);

        System.out.println("digitem um numero: ");
        double num1 = w.nextDouble();

        if (num1 == (int) num1) {
            System.out.println("o numero nao tem casas decimais");
        } else {
            System.out.println("o numero tem casas decimais ");
        }

    }

    static void exe5() {
        Scanner w = new Scanner(System.in);

        System.out.print("A cor é azul? (true/false): ");
        boolean resposta = w.nextBoolean();

        if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }

    static void exe6() {
        Scanner w = new Scanner(System.in);

        System.out.println("digite uma letra representando o sexo: ");
        String letra = w.next().toUpperCase();

        switch (letra) {

            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            case "I":
                System.out.println("Não informado");
                break;
            default:
                System.out.println("Entrada incorreta");
        }

    }

    static void exe7() {
        Scanner w = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        System.out.println("Peso da sua carta: ");
        double peso = w.nextDouble();

        double valorPagar = 0;

        if (peso <= 50) {
            valorPagar = 0.45;
        } else {
            double pesoExcedido = peso - 50;
            double qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45 + 0.45 * qtAdicional;
        }
        System.out.println("Custo do selo R$=" + d.format(valorPagar));

    }

    static void exe8() {
        Scanner w = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = w.nextLine().toLowerCase();

        switch (letra) {

            case "a":
                System.out.println("é vogal");
                break;
            case "e":
                System.out.println("é vogal");
                break;
            case "i":
                System.out.println("é vogal");
                break;
            case "u":
                System.out.println("é vogal");
                break;
            case "o":
                System.out.println("é vogal");
                break;
            default:
                System.out.println("nao é vogal");

        }

    }

    static void exe9() {
        Scanner w = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int a = w.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int b = w.nextInt();

        int multiplo = a * b;
        int multiplos = a / multiplo;

        if (a % b == 0) {
            System.out.println("Os valores são múltiplos.");
        } else {
            System.out.println("Os valores não são múltiplos.");
        }

        System.out.println("multiplos são: " + multiplos + "se 0 então é multiplo");

    }

    static void exe10() {
        Scanner w = new Scanner(System.in);
        System.out.println("digite a idade de Marquinhos: ");
        int a = w.nextInt();
        System.out.println("digite a idade de Zezinho:");
        int b = w.nextInt();
        System.out.println("digite a idade de Luluzinha:");
        int c = w.nextInt();

        if (a < b && a < c) {
            System.out.println("Maquinhos é o caçula");
        }
        if (b < a && b < c) {
            System.out.println("Zezinho é o caçula");
        }
        if (c < a && c < b) {
            System.out.println("Luluzinha é a caçula");
        }

    }

    static void exe11() {
        Scanner w = new Scanner(System.in);

        int[] anoNascimento = new int[3];

        System.out.println("digite o ano de nascimento do primeiro irmão:");
        anoNascimento[0] = w.nextInt();
        System.out.println("digite o ano de nascimento do segundo irmão:");
        anoNascimento[1] = w.nextInt();
        System.out.println("digite o ano de nascimento do terceiro irmão:");
        anoNascimento[2] = w.nextInt();

        if(anoNascimento[0] == anoNascimento[1] && anoNascimento[0] == anoNascimento[2]){
            System.out.println(" os irmaos são trigêmeos");
        }else if ((anoNascimento[0] == anoNascimento[1] && anoNascimento[0] != anoNascimento[2] ||
        anoNascimento[0] == anoNascimento[2] && anoNascimento[0] != anoNascimento[1] ||
        anoNascimento[1] == anoNascimento[2] && anoNascimento[1] != anoNascimento[0])){
            System.out.println("Os irmãos são gêmeos.");
        }else{
            System.out.println("são apenas irmão normais ");
        }
    

    }
    static void exe12(){
        Scanner w = new Scanner(System.in);

        System.out.println("digite o valor do lado1: ");
        int lado1 = w.nextInt();
        System.out.println("digite o valor do lado2: ");
        int lado2 = w.nextInt();
        System.out.println("digite o valor do lado3: ");
        int lado3 = w.nextInt();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("triângulo isósceles");
            } else {
                System.out.println("triângulo escaleno");
            }
        } else {
            System.out.println("os valores não formam um triângulo");
        }
    }
    static void exe13(){
        Scanner w = new Scanner(System.in);

        System.out.println("Informe a 1º carta: ");
        int carta1 = w.nextInt();
        System.out.println("Informe a 2º carta: ");
        int carta2 = w.nextInt();
        System.out.println("Informe a 3º carta: ");
        int carta3 = w.nextInt();

        int qtCartasBoas = 0;
        
        if(carta1 == 1 || carta1 == 2 || carta1 == 3){
            qtCartasBoas +=1;
        }if(carta2 == 1 || carta2 == 2 || carta2 == 3){
            qtCartasBoas +=1;
        }if(carta3 == 1 || carta3 == 2 || carta3 == 3){
            qtCartasBoas +=1;
        }if(qtCartasBoas == 1){
            System.out.println("Truco");
        }if(qtCartasBoas == 2){
            System.out.println("Seis");
        }if(qtCartasBoas == 3){
            System.out.println("Nove");
        }

    }
    static void exe14(){
        Scanner w = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String dataStr = w.nextLine();
    

        int dia = Integer.parseInt(dataStr.substring(0, 2));
        int mes = Integer.parseInt(dataStr.substring(3, 5));
        int ano = Integer.parseInt(dataStr.substring(6));
    
        if (mes < 1 || mes > 12) {
          System.out.println("Mês inválido!");
          return;
        }
        boolean diaValido = false;
        if (mes == 2) {
          if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            if (dia >= 1 && dia <= 29) {
              diaValido = true;
            }
          }else {
            if (dia >= 1 && dia <= 28) {
              diaValido = true;
            }
          }
        }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
          if (dia >= 1 && dia <= 30) {
            diaValido = true;
          }
        }else{
          if (dia >= 1 && dia <= 31) {
            diaValido = true;
          }
        }
    
        if (!diaValido) {
          System.out.println("Dia inválido!");
          return;
        }else{
        System.out.println("Data válida!");
        }
    }
    static void exe15(){
        Scanner w = new Scanner(System.in);

        System.out.println("Digite o mes de admissão: ");
        int mesesAdmissao = w.nextInt();

        double reajuste =0 ;
        if (mesesAdmissao < 12) {
            reajuste = 0.05;
        }if (mesesAdmissao >= 13 && mesesAdmissao <= 48) {
            reajuste = 0.07;
        } if (mesesAdmissao == 0 || mesesAdmissao >48){
             System.out.println("O funcionário não tem direito a reajuste.");
        } else {
            System.out.printf("O funcionário receberá um reajuste de %.2f%% no salário.\n", reajuste * 100);
        }
    }
    static void exe16(){
        Scanner w = new Scanner(System.in);
        
        int mulherMaisNova=0, hMaisV=0, hMaisN=0, mulherMaisVelha=0;
        int idadeHomem1 =0, idadeHomem2=0, idadeMulher1=0, idadeMulher2=0;
        while ((idadeHomem1 == idadeMulher1) || (idadeHomem1 == idadeMulher2) || (idadeHomem2 == idadeMulher1) || (idadeHomem2 == idadeMulher2)){
        System.out.println("Digite a idade do primeiro homem: ");
        idadeHomem1 = w.nextInt();

        System.out.println("Digite a idade da primeira mulher: ");
        idadeMulher1 = w.nextInt();

        System.out.println("Digite a idade do segundo homem: ");
        idadeHomem2 = w.nextInt();

        System.out.println("Digite a idade da segunda mulher: ");
        idadeMulher2 = w.nextInt();
        }

        if(idadeMulher1 < idadeMulher2){
             mulherMaisNova = idadeMulher1;
        }if(idadeMulher2 < idadeMulher1){
             mulherMaisNova = idadeMulher2;
        }if(idadeHomem1 > idadeHomem2){
             hMaisV = idadeHomem1;
        }if(idadeHomem2>idadeHomem1){
            hMaisV = idadeHomem2;
        }if(idadeMulher1 > idadeMulher2){
            mulherMaisVelha = idadeMulher1;
       }if(idadeMulher2 > idadeMulher1){
            mulherMaisVelha = idadeMulher2;
       }if(idadeHomem1 < idadeHomem2){
            hMaisN = idadeHomem1;
       }if(idadeHomem2<idadeHomem1){
           hMaisN = idadeHomem2;
       }

        int soma = hMaisV + mulherMaisNova;
        int produto = hMaisN * mulherMaisVelha;


        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto);
    }
    static void exe17(){
        Scanner w = new Scanner(System.in);
        
        System.out.print("Digite a renda anual: ");
        double rendaAnual = w.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int numDependentes = w.nextInt();

        double rendaLiquida = rendaAnual - (rendaAnual * (numDependentes * 0.02));

        double imposto;
        if (rendaLiquida <= 2000.0) {
            imposto = 0.0;
        } else if (rendaLiquida > 2000.0 && rendaLiquida <= 5000.0) {
            imposto = rendaLiquida * 0.05;
        } else if (rendaLiquida > 5000.0 && rendaLiquida <= 10000.0) {
            imposto = rendaLiquida * 0.10;
        } else {
            imposto = rendaLiquida * 0.15;
        }

        System.out.printf("Imposto a ser pago: R$ %.2f%n", imposto);

    }
    static void exe18(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite o dia do vencimento: ");
        int diaVencimento = w.nextInt();

        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = w.nextInt();

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = w.nextDouble();

        if (diaPagamento <= diaVencimento) {
            double valorPago = valorPrestacao * 0.9;
            System.out.printf("Pagamento em dia. Valor a ser pago: R$ %.2f", valorPago);
        } else if (diaPagamento <= diaVencimento + 5) {
            System.out.printf("Pagamento com atraso. Valor a ser pago: R$ %.2f", valorPrestacao);
        } else {
            int diasAtraso = diaPagamento - diaVencimento - 5;
            double multa = valorPrestacao * (diasAtraso * 0.02);
            double valorPago = valorPrestacao + multa;
            System.out.printf("Pagamento com atraso superior a cinco dias. Multa de R$ %.2f. Valor a ser pago: R$ %.2f", multa, valorPago);
        }


    }
    static void exe19(){
        Scanner w = new Scanner(System.in);

        System.out.println("possição X = ");
        double x = w.nextDouble();
        System.out.println("possição y = ");
        double y = w.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Quadrante 0");
        }if(x>0 && y>0){
            System.out.println("Quadrante 1");
        }if(x>0 && y < 0){
            System.out.println("Quadrante 2");
        }if(x<0 && y<0){
            System.out.println("Quadrante 3");
        }if(x< 0 && y>0){
            System.out.println("Quadrante 4");
        }

    }
    static void exe20(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite a nota da prova 1: ");
        double notaProva1 = w.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        double notaProva2 = w.nextDouble();

        System.out.print("Digite a nota da prova 3: ");
        double notaProva3 = w.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = w.nextDouble();

        double mediaAproveitamento = (notaProva1 + notaProva2*2 + notaProva3*3 + mediaExercicios) / 7;

        String conceito;
        if (mediaAproveitamento >= 9) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6) {
            conceito = "C";
        } else if (mediaAproveitamento >= 4) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.printf("Média de aproveitamento: %.2f\n", mediaAproveitamento);
        System.out.printf("Conceito: %s\n", conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
    static void exe21(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite a sua massa em kg: ");
        double massa = w.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = w.nextDouble();

        double imc = massa / (altura * altura);

        System.out.printf("Seu IMC é %.2f. Classificação: ", imc);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc < 25) {
            System.out.println("Saudável");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }

    }
    static void exe22(){
        Scanner w = new Scanner(System.in);

        System.out.print("Informe a opção do curso (1 - Ciência da Computação, 2 - Licenciatura da Computação, 3 - Sistemas de Informação): ");
        int opcao = w.nextInt();
        String titulo = "";
        switch(opcao) {
            case 1:
                titulo = "Bacharel em Ciência da Computação";
                break;
            case 2:
                titulo = "Licenciado em Computação";
                break;
            case 3:
                titulo = "Bacharel em Sistemas de Informação";
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }
        System.out.println("O título que você receberá é: " + titulo);

    }
    static void exe23(){
        Scanner w = new Scanner(System.in);
        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = w.nextInt();
       
        String mesPorExtenso;
        switch (mes) {
            case 1:
                mesPorExtenso = "Janeiro";
                break;
            case 2:
                mesPorExtenso = "Fevereiro";
                break;
            case 3:
                mesPorExtenso = "Março";
                break;
            case 4:
                mesPorExtenso = "Abril";
                break;
            case 5:
                mesPorExtenso = "Maio";
                break;
            case 6:
                mesPorExtenso = "Junho";
                break;
            case 7:
                mesPorExtenso = "Julho";
                break;
            case 8:
                mesPorExtenso = "Agosto";
                break;
            case 9:
                mesPorExtenso = "Setembro";
                break;
            case 10:
                mesPorExtenso = "Outubro";
                break;
            case 11:
                mesPorExtenso = "Novembro";
                break;
            case 12:
                mesPorExtenso = "Dezembro";
                break;
            default:
                mesPorExtenso = "Valor inválido";
        }
        
        System.out.println(mesPorExtenso);

    }
    static void exe24(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = w.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = w.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = w.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        int opcao = w.nextInt();

        switch (opcao) {
            case 1:
                if (valor1 <= valor2 && valor2 <= valor3) {
                    System.out.println(valor1 + " " + valor2 + " " + valor3);
                } else if (valor1 <= valor3 && valor3 <= valor2) {
                    System.out.println(valor1 + " " + valor3 + " " + valor2);
                } else if (valor2 <= valor1 && valor1 <= valor3) {
                    System.out.println(valor2 + " " + valor1 + " " + valor3);
                } else if (valor2 <= valor3 && valor3 <= valor1) {
                    System.out.println(valor2 + " " + valor3 + " " + valor1);
                } else if (valor3 <= valor1 && valor1 <= valor2) {
                    System.out.println(valor3 + " " + valor1 + " " + valor2);
                } else {
                    System.out.println(valor3 + " " + valor2 + " " + valor1);
                }
                break;

            case 2:
                if (valor1 >= valor2 && valor2 >= valor3) {
                    System.out.println(valor1 + " " + valor2 + " " + valor3);
                } else if (valor1 >= valor3 && valor3 >= valor2) {
                    System.out.println(valor1 + " " + valor3 + " " + valor2);
                } else if (valor2 >= valor1 && valor1 >= valor3) {
                    System.out.println(valor2 + " " + valor1 + " " + valor3);
                } else if (valor2 >= valor3 && valor3 >= valor1) {
                    System.out.println(valor2 + " " + valor3 + " " + valor1);
                } else if (valor3 >= valor1 && valor1 >= valor2) {
                    System.out.println(valor3 + " " + valor1 + " " + valor2);
                } else {
                    System.out.println(valor3 + " " + valor2 + " " + valor1);
                }
                break;

            case 3:
                if (valor1 >= valor2 && valor1 >= valor3) {
                    if (valor2 >= valor3) {
                        System.out.println(valor2 + " " + valor1 + " " + valor3);
                    } else {
                        System.out.println(valor3 + " " + valor1 + " " + valor2);
                    }
                } else if (valor2 >= valor1 && valor2 >= valor3) {
                    if (valor1 >= valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                    }
                }else if (valor3 >= valor1 && valor3 >= valor2){
                    if(valor2 >= valor1)
                    System.out.println(valor2 + " " + valor3 + " " + valor1);
                } 
            }
    }
    static void exe25(){
        Scanner w = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Soma de dois números.");
            System.out.println("2 - Diferença entre dois números.");
            System.out.println("3 - Produto entre dois números.");
            System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
            System.out.println("0 - Sair.");

            System.out.print("Opção: ");
            opcao = w.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = w.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = w.nextDouble();
                    double soma = num1 + num2;
                    System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + soma);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = w.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = w.nextDouble();
                    double diferenca = num1 - num2;
                    System.out.println("A diferença entre " + num1 + " e " + num2 + " é igual a " + diferenca);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = w.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = w.nextDouble();
                    double produto = num1 * num2;
                    System.out.println("O produto de " + num1 + " e " + num2 + " é igual a " + produto);
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = w.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = w.nextDouble();
                    if (num2 != 0) {
                        double divisao = num1 / num2;
                        System.out.println("A divisão de " + num1 + " por " + num2 + " é igual a " + divisao);
                    } else {
                        System.out.println("Erro: o denominador não pode ser zero.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

    }
    static void exe26(){
        Scanner w = new Scanner(System.in);

        System.out.println("escolha opção");
        System.out.println("T: calcular a area de um triangulo de base b e altura h");
        System.out.println("Q: calcular a area de um quadrado de lado l");
        System.out.println("R: calcular a area de um triangulo de base b e altura h");
        System.out.println("C: calcular a area de um circulo de raio q");
        String opcao = w.next().toUpperCase();
        switch(opcao){

            case "T": 
            System.out.println("digite a base e altura da cacerna do triangulo:");
            double base = w.nextByte();      
            System.out.println("");
            double altura = w.nextDouble();
            double areaTriangulo = + base * altura;
            System.out.println("areado triangulo: "+ areaTriangulo);
            break;

            case "Q": 
            System.out.println("digite o lado l:");
            double lado = w.nextDouble();
            double area = lado*lado;
            System.out.println("area do quadrado: "+area);
            break;

            case "R": 
            System.out.println("digite a base");
            base = w.nextDouble();
            System.out.println("digite a altura do retangulo:");
            altura = w.nextDouble();
            double areaRetan = base * altura;
            System.out.println("area do retangulo "+areaRetan);
            break;

            case "C": 
            System.out.println("digite o raio r: ");
            double raio = w.nextDouble();
            double areaCirculo =  Math.PI * Math.pow(raio,2);
            System.out.println("area do circulo "+areaCirculo);
            break;

        } 

    }
    static void exe27(){
        Scanner w = new Scanner(System.in);

        System.out.print("Informe a hora de chegada (hh mm): ");
        int horaChegada = w.nextInt();
        int minChegada = w.nextInt();

        System.out.print("Informe a hora de saída (hh mm): ");
        int horaSaida = w.nextInt();
        int minSaida = w.nextInt();

        int horas = horaSaida - horaChegada;
        int minutos = minSaida - minChegada;

        if (minutos < 0) {
            minutos += 60;
            horas--;
        }
        int totalHoras = (horas < 0) ? horas + 24 : horas;

        if (totalHoras == 0 && minutos < 30) {
            totalHoras = 1;
        } else if (minutos > 30) {
            totalHoras++;
        }
        double valor = 0;
        if (totalHoras <= 2) {
            valor = totalHoras * 5.0;
        } else if (totalHoras <= 4) {
            valor = 2 * 5.0 + (totalHoras - 2) * 7.5;
        } else {
            valor = 2 * 5.0 + 2 * 7.5 + (totalHoras - 4) * 10.0;
        }
        System.out.println("Tempo estacionado: " + totalHoras + " hora(s) e " + minutos + " minuto(s)");
        System.out.printf("Valor a ser pago: R$ %.2f%n", valor);

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
        //exe11();
        //exe12();
        //exe13();
        //exe14();
        //exe15();
        //exe16();
        //exe17();
       // exe18();
       // exe19();
        //exe20();
        //exe21();
        //exe22();
        //exe23();
        //exe24();
       // exe25();
        //exe26();
        exe27();


    }
}