import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5{


    static void exe1(){
        Scanner w = new Scanner(System.in);

        for(int i=0; i<=20; i++){
            System.out.println("escreva um numero: ");
            int num = w.nextInt();
            if(num % 2 == 0){
                System.out.println("numero "+num+ " é par:");
            }else{
                System.out.println("numero "+num+" é impar:");
            }
        }

    }
    static void exe2(){
        Scanner w = new Scanner(System.in);
            int par = 0;
            int impar = 0;
        for(int i=0; i<=100; i++){
            
            if(i % 2==0){
                System.out.println("numero "+i+" par");
                par= par +i;
                
            }else{
                System.out.println("numero "+i+" impar");
                impar = impar +i;
                
            }
            System.out.println("soma par: "+par);
            System.out.println("soma impar: "+impar);
        }

    }
    static void exe3(){
        Scanner w = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.0000");
        double soma = 0;

        for(int i=1; i<=100; i++){
            soma += 1.0/i;
        }
        System.out.println("soma "+soma);

    }
    static void exe4(){
        Scanner w = new Scanner(System.in);

        double s = 0;
        int N=3;
        int D=2;

        for (int i=0; i<=100; i++){
            N = N+2;
            D = D+i;
            s = s +(double) N/D;
        }
        System.out.println("soma: "+s);
    }
    static void exe5(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 2: ");
        int n = w.nextInt();
        
        if (n <= 2) {
            System.out.println("O número deve ser maior que 2.");
            
        }
        
        int a = 2;
        int b = 4;
        int c=0;
        for (int i = 2; i <=10; i++) {
            int d = a + b;
             c =( (a + b) -2);
            System.out.print(c+" ");
            System.out.print(d+" ");
            a = d;
            b = c;
        }
        

    }
    static void exe6(){
        Scanner w = new Scanner(System.in);

        int qtdPessoas = 20;
        double somaAlturas = 0;

        for (int i = 1; i <= qtdPessoas; i++) {
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = w.nextDouble();
            somaAlturas += altura;
        }

        double mediaAlturas = somaAlturas / qtdPessoas;
        System.out.println("A média de altura das " + qtdPessoas + " pessoas é: " + mediaAlturas + " metros.");


    }

    static void exe7(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem lidos: ");
        int n = w.nextInt();

        double maior=0;
        double menor=0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = w.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < maior) {
                menor = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

    }
    static void exe8(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem lidos: ");
        int n = w.nextInt();

        int menorNegativo = 0;
        int somaPositivos = 0;
        int contadorPositivos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = w.nextInt();

            if (numero < 0 && numero < menorNegativo) {
                menorNegativo = numero;
            }

            if (numero > 0) {
                somaPositivos += numero;
                contadorPositivos++;
            }
        }

        if (menorNegativo != 0) {
            System.out.println("O menor valor negativo é: " + menorNegativo);
        } else {
            System.out.println("Não foi encontrado nenhum valor negativo.");
        }

        if (contadorPositivos > 0) {
            double mediaPositivos = (double) somaPositivos / contadorPositivos;
            System.out.println("A média dos números positivos é: " + mediaPositivos);
        } else {
            System.out.println("Não foram encontrados números positivos.");
        }

    }

    static void exe9(){
        Scanner w = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int n = w.nextInt();

        w.nextLine();

        int acimaDe20 = 0;

        System.out.println("Digite o nome e a idade de cada aluno:");

        for (int i = 1; i <= n; i++) {
            System.out.println("Nome do aluno " + i + ": ");
            String nome = w.nextLine();

            System.out.println("Idade do aluno " + i + ": ");
            int idade = w.nextInt();

            w.nextLine();

            if (idade == 18) {
                System.out.println("Aluno com 18 anos: " + nome);
            }

            if (idade > 20) {
                acimaDe20++;
            }
        }

        System.out.println("Quantidade de alunos com idade acima de 20 anos: " + acimaDe20);

    }

    static void exe10(){

        
        int num = 10;
        int count =0;
        for (count = 0;count <=10; ) {
            int soma = (num / 100) + (num % 100);
            int quadrado = soma * soma;

            if (quadrado == num) {
                System.out.println(num);
                count++;
            }

            num++;
        }


    }
    static void exe11(){
        
        int horasPorDia = 16;
        int biscoitosQuebrados = 0;

        for (int hora = 1; hora <= horasPorDia; hora++) {
            int quantidadeQuebrada = (int) Math.pow(3, hora - 1);
            biscoitosQuebrados += quantidadeQuebrada;
        }

        System.out.println("No final do dia, foram quebrados " + biscoitosQuebrados + " biscoitos.");

    }
    static void exe12(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int n = w.nextInt();

        int num = 1;
        int linha = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= linha; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            linha++;
        }

    }
    static void exe13(){
        Scanner w = new Scanner(System.in);

        System.out.print("número total de reabastecimentos feitos: ");
        int numReabastecimentos = w.nextInt();

        double KmTotal = 0.0;
        double combustivelTotal = 0.0;

        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.println("Quilometragem no odômetro: ");
            double quilometragem = w.nextDouble();

            System.out.println("Quantidade de combustível comprado (em litros): ");
            double combustivel = w.nextDouble();

            double KmPorLitro = quilometragem / combustivel;
            System.out.println("Quilometragem por litro na parada " + i + ": " + KmPorLitro);

            KmTotal += quilometragem;
            combustivelTotal += combustivel;
        }

        double KmMedia = KmTotal / combustivelTotal;
        System.out.println("Quilometragem média por litro em toda a viagem: " + KmMedia);

    }



    static void exe14(){
        Scanner w = new Scanner(System.in);

        int numMercadorias = 20;
        int contadorLucroMenor10 = 0;
        int contadorLucroEntre10e20 = 0;
        int contadorLucroMaior20 = 0;
        double valorTotalCompra = 0.0;
        double valorTotalVenda = 0.0;

        System.out.println("Digite os dados para cada mercadoria:");

        for (int i = 1; i <= numMercadorias; i++) {
            System.out.println("Mercadoria " + i + ":");

            System.out.print("Nome: ");
            String nome = w.nextLine();

            System.out.print("Preço de compra: ");
            double precoCompra = w.nextDouble();

            System.out.print("Preço de venda: ");
            double precoVenda = w.nextDouble();

            w.nextLine(); 

            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucroPercentual < 10) {
                contadorLucroMenor10++;
            } else if (lucroPercentual >= 10 && lucroPercentual <= 20) {
                contadorLucroEntre10e20++;
            } else {
                contadorLucroMaior20++;
            }

            valorTotalCompra += precoCompra;
            valorTotalVenda += precoVenda;
        }

        double lucroTotal = valorTotalVenda - valorTotalCompra;

        System.out.println("Quantidade de mercadorias com lucro < 10%: " + contadorLucroMenor10);
        System.out.println("Quantidade de mercadorias com 10% <= lucro <= 20%: " + contadorLucroEntre10e20);
        System.out.println("Quantidade de mercadorias com lucro > 20%: " + contadorLucroMaior20);
        System.out.println("Valor total de compra: " + valorTotalCompra);
        System.out.println("Valor total de venda: " + valorTotalVenda);
        System.out.println("Lucro total: " + lucroTotal);

    }

    static void exe15(){
        Scanner w = new Scanner(System.in);

        String nomeAluno = "";
        double notaProva1, notaProva2;
        int contadorAlunos = 0;
        double somaNotas = 0.0;

        while (!nomeAluno.equalsIgnoreCase("fim")) {
            System.out.print("Nome do aluno: ");
            nomeAluno = w.nextLine();

            if (nomeAluno.equalsIgnoreCase("fim")) {
                break;
            }
            
            System.out.print("Nota da prova 1: ");
            notaProva1 = w.nextDouble();

            while (notaProva1 < 0 || notaProva1 > 10) {
                System.out.println("Nota inválida. Digite novamente:");
                notaProva1 = w.nextDouble();
            }

            System.out.print("Nota da prova 2: ");
            notaProva2 = w.nextDouble();

            while (notaProva2 < 0 || notaProva2 > 10) {
                System.out.println("Nota inválida. Digite novamente:");
                notaProva2 = w.nextDouble();
            }

            w.nextLine(); 

            double media = (notaProva1 + notaProva2) / 2;
            System.out.println("Média do aluno " + nomeAluno + ": " + media);

            contadorAlunos++;
            somaNotas += media;
        }

        double mediaTurma = somaNotas / contadorAlunos;
        System.out.println("Média da turma: " + mediaTurma);

    }

    static void exe16(){
        Scanner w = new Scanner(System.in);

        int contadorMulheres = 0;
        double somaAlturasMulheres = 0.0;
        int contadorPessoas = 0;
        double somaAlturas = 0.0;
        double altura=0.1;

        System.out.println("digite 0 na altura para encerar");
        while (altura != 0) {
            System.out.print("Altura: ");
            altura = w.nextDouble();

            if (altura == 0) {
                break;
            }

            w.nextLine();

            System.out.print("Sexo ('M'/'m' para masculino, 'F'/'f' para feminino): ");
            String sexo = w.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                contadorMulheres++;
                somaAlturasMulheres += altura;
            }

            contadorPessoas++;
            somaAlturas += altura;
        }

        double mediaAlturaMulheres = somaAlturasMulheres / contadorMulheres;
        double mediaAlturaGrupo = somaAlturas / contadorPessoas;

        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Média de altura do grupo: " + mediaAlturaGrupo);

    }

    static void exe17(){
        Scanner w = new Scanner(System.in);

        int numeroInscricao;
        double altura;
        
        int numeroInscricaoAtletaMaisAlto = 0;
        double alturaAtletaMaisAlto = 0;
        
        int numeroInscricaoAtletaMaisBaixo = 0;
        double alturaAtletaMaisBaixo = 9999;

        int contadorAtletas=0;
        double somaAlturas=0;
        
        do {
            System.out.print("Digite o número de inscrição (ou 0 para sair): ");
            numeroInscricao = w.nextInt();
            
            if (numeroInscricao != 0) {
                System.out.print("Digite a altura do atleta: ");
                altura = w.nextDouble();

                somaAlturas += altura;
                contadorAtletas++;
                
                if (altura > alturaAtletaMaisAlto) {
                    alturaAtletaMaisAlto = altura;
                    numeroInscricaoAtletaMaisAlto = numeroInscricao;
                }
                
                if (altura < alturaAtletaMaisBaixo) {
                    alturaAtletaMaisBaixo = altura;
                    numeroInscricaoAtletaMaisBaixo = numeroInscricao;
                }
            }
            
        } while (numeroInscricao != 0);
        
        if (numeroInscricaoAtletaMaisAlto != 0) {
            System.out.println("O atleta mais alto é o de número de inscrição " + numeroInscricaoAtletaMaisAlto +
                               " com altura de " + alturaAtletaMaisAlto + " metros.");
        }
        
        if (numeroInscricaoAtletaMaisBaixo != 0) {
            System.out.println("O atleta mais baixo é o de número de inscrição " + numeroInscricaoAtletaMaisBaixo +
                               " com altura de " + alturaAtletaMaisBaixo + " metros.");
        }
        if (contadorAtletas > 0) {
            double alturaMedia = somaAlturas / contadorAtletas;
            System.out.println("A altura média do grupo de atletas é de " + alturaMedia + " metros.");
        }


    }

    static void exe18(){
        Scanner w = new Scanner(System.in);


        int totalPessoas = 0;
        
        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;
        
        int canal;
        int pessoas;
        
        System.out.print("Digite o número do canal (4, 5, 9, 12) (ou 0 para sair): ");
        canal = w.nextInt();
        
        while (canal != 0) {
            switch (canal) {
                case 4:
                    System.out.print("Digite o número de pessoas assistindo: ");
                    pessoas = w.nextInt();
                    canal4 += pessoas;
                    totalPessoas += pessoas;
                    break;
                case 5:
                    System.out.print("Digite o número de pessoas assistindo: ");
                    pessoas = w.nextInt();
                    canal5 += pessoas;
                    totalPessoas += pessoas;
                    break;
                case 9:
                    System.out.print("Digite o número de pessoas assistindo: ");
                    pessoas = w.nextInt();
                    canal9 += pessoas;
                    totalPessoas += pessoas;
                    break;
                case 12:
                    System.out.print("Digite o número de pessoas assistindo: ");
                    pessoas = w.nextInt();
                    canal12 += pessoas;
                    totalPessoas += pessoas;
                    break;
                default:
                    System.out.println("Canal inválido!");
                    break;
            }
            
            System.out.print("Digite o número do canal (ou 0 para sair): ");
            canal = w.nextInt();
        }
        
        System.out.println("Percentual de audiência por emissora:");
        
        if (canal4 > 0) {
            double percentual4 = (canal4 / (double) totalPessoas) * 100;
            System.out.println("Canal 4: " + percentual4 + "%");
        }
        
        if (canal5 > 0) {
            double percentual5 = (canal5 / (double) totalPessoas) * 100;
            System.out.println("Canal 5: " + percentual5 + "%");
        }
        
        if (canal9 > 0) {
            double percentual9 = (canal9 / (double) totalPessoas) * 100;
            System.out.println("Canal 9: " + percentual9 + "%");
        }
        
        if (canal12 > 0) {
            double percentual12 = (canal12 / (double) totalPessoas) * 100;
            System.out.println("Canal 12: " + percentual12 + "%");
        }

    }

    static void exe19(){
        Scanner w = new Scanner(System.in);

        double valorCompra;
        double totalPagar = 0;
        double totalRecebido = 0;
        
        System.out.print("Digite o valor da compra (ou 0 para sair): R$");
        valorCompra = w.nextDouble();
        
        while (valorCompra != 0) {
            double desconto;
            
            if (valorCompra > 500) {
                desconto = valorCompra * 0.2; 
            } else {
                desconto = valorCompra * 0.15; 
            }
            
            double valorPagar = valorCompra - desconto;
            
            System.out.println("Total a pagar: R$" + valorPagar);
            
            totalPagar += valorPagar;
            totalRecebido += valorCompra;
            
            System.out.print("Digite o valor da compra (ou 0 para sair): R$");
            valorCompra = w.nextDouble();
        }
        
        System.out.println("Total recebido pela loja: R$" + totalRecebido);
        

    }

    static void exe20(){
        Scanner w = new Scanner(System.in);

        System.out.print("Digite a massa inicial em Kg: ");
        double a = w.nextDouble();
        double massaInicial = a;
        double massaFinal = 0.5; 
        int tempo = 0;
        
        while (massaInicial > massaFinal/100) { 
            massaInicial /= 2;
            tempo += 50;
        }
        
        System.out.println("Massa inicial: " + a + " Kg");
        System.out.println("Massa final: " + massaFinal  + " gramas");
        System.out.println("Tempo necessário: " + tempo + " segundos");
        

    }

    static void exe21(){

        double alturaChico = 1.50; 
        double alturaZe = 1.10; 
        int anos = 0;
        
        while (alturaZe <= alturaChico) {
            alturaChico += 0.02; 
            alturaZe += 0.03; 
            anos++;
        }
        
        System.out.println("Serão necessários " + anos + " anos para Zé ser maior do que Chico.");

    }

    static void exe22(){
        
        int anoContratacao = 1995;
        double salarioInicial = 2000.0; 
        double aumentoPercentual = 0.015; 
        
        int anoAtual = 2023; 
        
        int anos = anoAtual - anoContratacao;
        int i = 1;
        
        while (i <= anos) {
            if (i == 1) {
                salarioInicial += salarioInicial * aumentoPercentual;
            } else {
                aumentoPercentual *= 2;
                salarioInicial += salarioInicial * aumentoPercentual;
            }
            
            i++;
        }
        
        System.out.println("ano " + anoAtual + " é: R$" + salarioInicial);
    }


        static void exe23(){
        Scanner w = new Scanner(System.in);


        String opcao = "s";
        
        while (opcao.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = w.nextLine();
            
            System.out.print("Digite o número de produtos vendidos: ");
            int numeroProdutos = w.nextInt();
            
            double totalVendas = 0.0;
            
            for (int i = 1; i <= numeroProdutos; i++) {
                System.out.println("Produto #" + i);
                
                System.out.print("Digite o preço unitário do produto: R$");
                double precoUnitario = w.nextDouble();
                
                System.out.print("Digite a quantidade vendida do produto: ");
                int quantidade = w.nextInt();
                
                double valorVenda = precoUnitario * quantidade;
                totalVendas += valorVenda;
            }
            
            double salario = totalVendas * 0.3;
            
            System.out.println("Relatório de Vendas");
            System.out.println("Nome do vendedor: " + nome);
            System.out.println("Total de vendas: R$" + totalVendas);
            System.out.println("Salário: R$" + salario);
            
            System.out.println("------------------------------");
            
            System.out.print("Deseja digitar os dados de mais um vendedor? (s/n): ");
            w.nextLine(); 
            opcao = w.nextLine();
        }
}


static void exe24(){
    Scanner w = new Scanner(System.in);

    
    System.out.print("Digite o limite diário de peso de pesca (em kg): ");
    double limiteDiario = w.nextDouble();
    
    double pesoTotal = 0;
    String opcao = "s";
    
    while (opcao.equalsIgnoreCase("s")) {
        System.out.print("Digite o peso do peixe em gramas: ");
        double pesoPeixe = w.nextDouble();
        
        pesoTotal += pesoPeixe / 1000; 
        if (pesoTotal > limiteDiario) {
            System.out.println("Limite diário excedido!");
            break;
        }
        
        System.out.println("Peso total da pesca até agora: " + pesoTotal + " kg");
        
        System.out.print("Deseja informar o peso de mais um peixe? (s/n): ");
        opcao = w.next();
    }


}
static void exe25(){
    Scanner w = new Scanner(System.in);

    int pontosDireita = 0;
    int pontosEsquerda = 0;
    
    while (true) {
        System.out.print("Digite D para ponto para Direita ou E para ponto Esquerda. (D/E): ");
        String codigoPonto = w.nextLine().toUpperCase();
        
        if (codigoPonto.equalsIgnoreCase("D")) {
            pontosDireita++;
        } else if (codigoPonto.equalsIgnoreCase("E")) {
            pontosEsquerda++;
        } else {
            System.out.println("Código de ponto inválido. Digite D para ponto da direita ou E para ponto da esquerda.");
            continue;
        }
        
        if ((pontosDireita >= 21 || pontosEsquerda >= 21) && Math.abs(pontosDireita - pontosEsquerda) >= 2) {
            break;
        }
    }
    
    String vencedor;
    
    if (pontosDireita > pontosEsquerda) {
        vencedor = "Direita";
    } else {
        vencedor = "Esquerda";
    }
    
    System.out.println("Vencedor: " + vencedor);

    
}

static void exe26(){
    Scanner w = new Scanner(System.in);

    System.out.print("Digite o valor do pedágio ao qual se nega a pagar: ");
    double valorNegado = w.nextDouble();
    
    int trechosAcimaPedagioNegado = 0;
    int totalTrechos = 0;
    int trechosAcima150Km = 0;
    
    while (true) {
        System.out.print("Digite o custo do pedágio (-1 para encerrar): ");
        double custoPedagio = w.nextDouble();
        
        if (custoPedagio < 0) {
            break;
        }
        
        System.out.print("Digite a distância do trecho (em km): ");
        int distanciaTrecho = w.nextInt();
        
        if (custoPedagio > valorNegado) {
            trechosAcimaPedagioNegado++;
        }
        
        totalTrechos++;
        
        if (distanciaTrecho > 150 && custoPedagio <= valorNegado) {
            trechosAcima150Km++;
        }
    }
    
    System.out.println("Trechos com valor de pedágio acima do qual  nega-se a pagar: " + trechosAcimaPedagioNegado);
    System.out.println("Quantidade de trechos informados: " + totalTrechos);
    System.out.println("Trechos acima de 150 km com valor de pedágio aceito: " + trechosAcima150Km);
    
}

static void exe27(){
    Scanner w = new Scanner(System.in);
    DecimalFormat d = new DecimalFormat("0.00");
    int maiorProducao = 0;
        int diaMaiorProducao = 0;
        int totalProducaoManha = 0;
        int totalProducaoTarde = 0;
        int totalProducao = 0;

        while (true) {
            System.out.println("Digite o dia do mês de abril (1 a 30): ");
            int dia = w.nextInt();

            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido. Digite um valor válido para o mês de abril (1 a 30).");
                continue;
            }

            System.out.print("Digite o total de peças produzidas no turno da manhã: ");
            int producaoManha = w.nextInt();

            System.out.print("Digite o total de peças produzidas no turno da tarde: ");
            int producaoTarde = w.nextInt();

            double valorDiario;
            if (dia <= 15) {
                if (producaoManha >= 30 && producaoTarde >= 30 && (producaoManha + producaoTarde) > 100) {
                    valorDiario = 0.80;
                } else {
                    valorDiario = 0.50;
                }
            } else {
                valorDiario = 0.40 + 0.30;
            }

            double salario = (producaoManha * valorDiario) + (producaoTarde * valorDiario);

            System.out.println("O funcionário receberá R$" + d.format(salario) + " no dia " + dia);

            if (producaoManha + producaoTarde > maiorProducao) {
                maiorProducao = producaoManha + producaoTarde;
                diaMaiorProducao = dia;
            }

            if (producaoManha > totalProducaoManha) {
                totalProducaoManha = producaoManha;
            }

            if (producaoTarde > totalProducaoTarde) {
                totalProducaoTarde = producaoTarde;
            }

            totalProducao += producaoManha + producaoTarde;

            System.out.print("Novo funcionário (1. Sim / 2. Não)? ");
            int resposta = w.nextInt();

            if (resposta == 2) {
                break;
            }
        }

        System.out.println("Dia de maior produção: " + diaMaiorProducao);
        System.out.println("Período de maior produção: " + (totalProducaoManha > totalProducaoTarde ? "Manhã" : "Tarde"));
        System.out.println("Quantidade total de peças produzidas: " + totalProducao);

}

static void exe28(){
    Scanner w = new Scanner(System.in);

    int totalVotos = 0;
    int votos1 = 0;
    int votos2 = 0;
    int votos3 = 0;
    int votos4 = 0;

    while (true) {
        System.out.print("Mais um voto? (s - SIM / n - NÃO): ");
        String resposta = w.next();

        if (resposta.equalsIgnoreCase("n")) {
            break;
        }

        System.out.print("Digite o código do conjunto (1 a 4): ");
        int codigo = w.nextInt();

        if (codigo < 1 || codigo > 4) {
            System.out.println("Código inválido. Digite um valor válido (1 a 4).");
            continue;
        }

        switch (codigo) {
            case 1:
                votos1++;
                break;
            case 2:
                votos2++;
                break;
            case 3:
                votos3++;
                break;
            case 4:
                votos4++;
                break;
        }

        totalVotos++;
    }

    double calcularPercentual1 = ( votos1 / (double) totalVotos)*100;
    double calcularPercentual2 = ( votos2 / (double) totalVotos)*100;
    double calcularPercentual3 = ( votos3 / (double) totalVotos)*100;
    double calcularPercentual4 = ( votos4 / (double) totalVotos)*100;

    System.out.println("Resultado da eleição:");
    System.out.println("Conjunto: Nenhum de Nós | Votos: " + votos1 + " | Percentual: " + calcularPercentual1 + "%");
    System.out.println("Conjunto: CPM22 | Votos: " + votos2 + " | Percentual: " + calcularPercentual2 + "%");
    System.out.println("Conjunto: Skank | Votos: " + votos3 + " | Percentual: " + calcularPercentual3 + "%");
    System.out.println("Conjunto: Jota Quest | Votos: " + votos4 + " | Percentual: " + calcularPercentual4 + "%");

    String conjuntoVencedor = "";
    int maiorVotos = 0;

    if (votos1 > maiorVotos) {
        conjuntoVencedor = "Nenhum de Nós";
        maiorVotos = votos1;
    }
    if (votos2 > maiorVotos) {
        conjuntoVencedor = "CPM22";
        maiorVotos = votos2;
    }
    if (votos3 > maiorVotos) {
        conjuntoVencedor = "Skank";
        maiorVotos = votos3;
    }
    if (votos4 > maiorVotos) {
        conjuntoVencedor = "Jota Quest";
    }

    System.out.println("O conjunto vencedor é: " + conjuntoVencedor);

}

static void exe29(){
    Scanner w = new Scanner(System.in);

    System.out.print("Digite o valor desejado: ");
        int valor = w.nextInt();

        int cedulas20 = valor / 20;
        int resto20 = valor % 20;

        int cedulas10 = resto20 / 10;
        int resto10 = resto20 % 10;

        int cedulas5 = resto10 / 5;
        int resto5 = resto10 % 5;

        int cedulas2 = resto5 / 2;
        int cedulas1 = resto5 % 2;

        System.out.println("Quantidade mínima de cédulas:");
        System.out.println("Cédulas de 20: " + cedulas20);
        System.out.println("Cédulas de 10: " + cedulas10);
        System.out.println("Cédulas de 5: " + cedulas5);
        System.out.println("Cédulas de 2: " + cedulas2);
        System.out.println("Cédulas de 1: " + cedulas1);

}

static void exe30(){
    Scanner w = new Scanner(System.in);

    System.out.print("Digite o valor inicial (N): ");
        int N = w.nextInt();

        System.out.print("Digite o decremento (K): ");
        int K = w.nextInt();

        System.out.print("Digite o tamanho da mochila (M): ");
        int M = w.nextInt();

        
        int elementoAtual = N;
        int somaMochila = 0;
        int somaForaMochila = 0;

        System.out.println("Elementos a serem colocados na mochila:");
        while (elementoAtual >= 0) {
            if (elementoAtual <= M) {
                System.out.print(elementoAtual + " ");
                somaMochila += elementoAtual;
            } else {
                somaForaMochila += elementoAtual;
            }
            elementoAtual -= K;
        }
        System.out.println();

        System.out.println("Soma dos elementos que entraram na mochila: " + somaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaForaMochila);

}

static void exe31(){
    Scanner w = new Scanner(System.in);

    System.out.print("Digite um número inteiro positivo: ");
        int numero = w.nextInt();

        int fator = 2;

        
        System.out.println("Número: " + numero);
        while(numero > 1 ){
            if(numero % fator == 0){
                System.out.println("numero "+numero+ " decomposição "+fator);
                numero /= fator;
                
            }else{
                fator++;
            }
        }
        System.out.println("numero " +numero);
    
    
}

static void exe32(){
    Scanner w = new Scanner(System.in);

    System.out.print("Digite o dia da semana do primeiro dia (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int diaSemana = w.nextInt();
        
        System.out.print("Digite o número de dias do mês: ");
        int numDias = w.nextInt();
        
        System.out.println("Calendário:\n");
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");
        
        for (int i = 1; i < diaSemana; i++) {
            System.out.print("    ");
        }
        
        for (int dia = 1; dia <= numDias; dia++) {
            System.out.printf("%3d ", dia);
            
            if ((dia + diaSemana - 1) % 7 == 0) {
                System.out.println();
            }
        }

}

static void exe33(){
    Scanner w = new Scanner(System.in);

    int voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int totalVotosNulos = 0;
        int totalVotosBrancos = 0;
        int totalVotos = 0;

        do {
            System.out.println("Digite o código do candidato (1 a 4), voto nulo (5), voto em branco (6) ou 0 para sair:");
            voto = w.nextInt();

            switch (voto) {
                case 0:
                    break;
                case 1:
                    candidato1++;
                    totalVotos++;
                    break;
                case 2:
                    candidato2++;
                    totalVotos++;
                    break;
                case 3:
                    candidato3++;
                    totalVotos++;
                    break;
                case 4:
                    candidato4++;
                    totalVotos++;
                    break;
                case 5:
                    totalVotosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    totalVotosBrancos++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Opção incorreta. Tente novamente.");
                    break;
            }
        } while (voto != 0);

        System.out.println("Resultado da Eleição:");
        System.out.printf("Candidato 1: %d votos%n", candidato1);
        System.out.printf("Candidato 2: %d votos%n", candidato2);
        System.out.printf("Candidato 3: %d votos%n", candidato3);
        System.out.printf("Candidato 4: %d votos%n", candidato4);
        System.out.printf("Total de votos nulos: %d%n", totalVotosNulos);
        System.out.printf("Total de votos em branco: %d%n", totalVotosBrancos);

        double percentualVotosNulos = (double) totalVotosNulos / totalVotos * 100;
        double percentualVotosBrancos = (double) totalVotosBrancos / totalVotos * 100;
        System.out.printf("Percentual de votos nulos sobre o total: %.2f%%%n", percentualVotosNulos);
        System.out.printf("Percentual de votos em branco sobre o total: %.2f%%%n", percentualVotosBrancos);
    

}

static void exe34(){
    Scanner w = new Scanner(System.in);

    int opcao;
        int contasEncerradas = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Encerrar conta de um hóspede");
            System.out.println("2. Verificar número de contas encerradas");
            System.out.println("3. Sair");
            opcao = w.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do hóspede:");
                    w.nextLine(); 
                    String nome = w.nextLine();

                    System.out.println("Informe o número de diárias do hóspede:");
                    int numeroDiarias = w.nextInt();

                    double taxaServicos;
                    if (numeroDiarias < 15) {
                        taxaServicos = 7.50;
                    } else if (numeroDiarias == 15) {
                        taxaServicos = 6.50;
                    } else {
                        taxaServicos = 5.00;
                    }

                    double totalPagar = (50.00 + taxaServicos) * numeroDiarias;

                    System.out.println("Conta encerrada para o hóspede " + nome);
                    System.out.println("Total a pagar: R$ " + totalPagar);
                    contasEncerradas++;
                    break;
                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção incorreta. Tente novamente.");
                    break;
            }
        } while (opcao != 3);
    

}
public static void main(String[] args){

            //exe1();
            //exe2();
            //exe3();
            //exe4();
            //exe5();
            //exe6();
            //exe7();
            //exe8();
            //exe9();
            //exe10();
            //exe11();
            //exe12();
            //exe13();
            //exe14();
            //exe15();
            //exe16();
            //exe17();
            //exe18();
            //exe19();
            //exe20();
            //exe21();
            //exe22();
            //exe23();
            //exe24();
            //exe25();
            //exe26();
            //exe27();
            //exe28();
            //exe29();
            //exe30();
            //exe31();
            //exe32();
            //exe33();
            exe34();
    }   
}