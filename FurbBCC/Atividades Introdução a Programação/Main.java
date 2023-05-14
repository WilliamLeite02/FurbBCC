import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

  static void exe1001(){

    Scanner ler = new Scanner(System.in);

    System.out.println("valor 1: ");
    int A = ler.nextInt();

    System.out.println("valor 2: ");
    int B = ler.nextInt();

    int X = A + B;

    System.out.println("X = "+ X);

  }
  static void exe1002(){
    
    Scanner w = new Scanner(System.in);
    DecimalFormat d = new DecimalFormat("0.0000");

   double π = 3.14159;

    double raio = w.nextDouble();
    
    double area = π * (raio * raio);

    System.out.println("A="+d.format(area));

  }

  static void exe1004(){

    Scanner w = new Scanner(System.in);

    int a = w.nextInt();
    int b= w.nextInt();

    int PROD = a * b;
    
    System.out.println("PROD = "+PROD);

  }
  static void exe1005(){

    Scanner ler = new Scanner(System.in);
    DecimalFormat d = new DecimalFormat("0.00000");
    double nota1, nota2;
    double media;

    nota1 = ler.nextDouble();
    if (nota1 < 0 || nota1 > 10)
        while (nota1 < 0 || nota1 > 10) {
            nota1 = ler.nextDouble();
        }

    nota2 = ler.nextDouble();
    if (nota2 < 0 || nota2 > 10)
        while (nota2 < 0 || nota2 > 10) {
            nota2 = ler.nextDouble();
        }
    media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.println("MEDIA = "+ d.format(media));


  }

  static void exe1007(){

    Scanner w = new Scanner(System.in);

    int A,B,C,D;

    A =w.nextInt();
    B =w.nextInt();
    C =w.nextInt();
    D =w.nextInt();

    int DIFERENCA = (A*B-C*D);

    System.out.println("DIFERENCA = "+DIFERENCA);

  }
  static void exe1008(){
    Scanner w = new Scanner(System.in);
    DecimalFormat d = new DecimalFormat("0.00");

    int NUMBER;
    double SALARY;
    double TIME;

    NUMBER = w.nextInt();
    SALARY = w.nextDouble();
    TIME =w.nextDouble();

    double TOTAL = SALARY * TIME;

      System.out.println("NUMBER = "+NUMBER+ " SALARY = U$ "+d.format(TOTAL));
      System.out.println(" SALARY = U$ "+d.format(TOTAL));


  }
  static void exe1009(){

    Scanner w = new Scanner(System.in);
    DecimalFormat d = new DecimalFormat("0.00");

    
    String nome = w.next();
    
    double salario = w.nextDouble();
    double totalv= w.nextDouble();
    

    double comissao = ((totalv* 15) /100 )+ salario;

    System.out.println(" TOTAL = "+ d.format(comissao));
      

  }
  static void exe1012(){
    Scanner w = new Scanner(System.in);
    DecimalFormat d =new DecimalFormat("0.000");

    double a,b,c;

    a=w.nextDouble();
    b=w.nextDouble();
    c=w.nextDouble();

    double triangulo = a*c/2;
    double circulo = (c*c)*3.14159;
    double trapezio = (a+b)*c/2;
    double quadrado = (b*b);
    double retangulo = (a*b);

    System.out.println("TRIANGULO: "+d.format(triangulo));
    System.out.println("CIRCULO: "+ d.format(circulo));
    System.out.println("TRAPEZIO: "+d.format(trapezio));
    System.out.println("QUADRADO: "+d.format(quadrado));
    System.out.println("RETANGULO: "+d.format(retangulo));


  }

  static void exe1015(){

    Scanner w = new Scanner(System.in);
    DecimalFormat d = new DecimalFormat("0.0000");

    double x1,y1,x2,y2;

    x1= w.nextDouble();
    y1= w.nextDouble();
    x2= w.nextDouble();
    y2= w.nextDouble();

     double X = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2); 
     
     double z  = Math.sqrt(X); 

    System.out.println(d.format(z));


  }

  static void exe1016(){

    Scanner w = new Scanner(System.in);

    int km = w.nextInt();

    km = km * 2;

    System.out.println(km);

  }

  static void exe1018(){

    Scanner w = new Scanner(System.in);

    int cem, cinquenta, vinte, dez, cinco, dois, um;

    cem = 0; cinquenta =0; vinte = 0; dez =0; cinco=0; dois=0; um=0;
    
    int valor = w.nextInt();
    int valor1 = valor;
  while (valor >=100){
    cem= cem+1;
    valor =valor -100;

  }while(valor>=50){
    cinquenta=cinquenta+1;
    valor =valor -50;
  }while(valor>=20){
    vinte =vinte +1;
    valor=valor-20;
  }while(valor>=10){
    dez=dez+1;
    valor= valor-10;
  }while(valor >=5){
    cinco = cinco +1;
    valor = valor -5;
  }while (valor>=2){
    dois = dois +1;
    valor = valor -2;
  }while (valor >=1){
    um = um+1;
    valor = valor -1;
  }

  System.out.println(valor1);
  System.out.println(cem +" notas(s) de R$ 100,00");
  System.out.println(cinquenta +" notas(s) de R$ 50,00");
  System.out.println(vinte + " notas(s) de R$ 20,00") ;
  System.out.println(dez + " notas(s) de R$ 10,00");
  System.out.println(cinco+ " notas(s) de R$ 5,00");
  System.out.println(dois + " notas(s) de R$ 2,00");
  System.out.println(um +" notas(s) de R$ 1,00");

  }

  static void exe1019(){
  
    Scanner w = new Scanner(System.in);
  
    int valor = w.nextInt();
        
        int horas = valor / 3600;
        int minutos = (valor % 3600) / 60; 
        int segundos = valor % 60; 
        
       
        System.out.println(horas + ":" + minutos + ":" + segundos);

  }

  static void exe1021(){
    Scanner w = new Scanner(System.in);
   double valor = w.nextDouble();

    int notas100 = (int) valor / 100;
    valor -= notas100 * 100;

    int notas50 = (int) valor / 50;
    valor -= notas50 * 50;

    int notas20 = (int) valor / 20;
    valor -=notas20 * 20;

    int notas10 = (int) valor / 10;
    valor -=notas10 * 10;

    int notas5 = (int) valor / 5;
    valor -=notas5 * 5;

    int notas2 = (int) valor / 2;
    valor -=notas2 * 2;

    int moedas1 = (int) valor / 1;
    valor -=moedas1 * 1;

    int moedas50 = (int) (valor / 0.50);
    valor -=moedas50 * 0.50;

    int moedas25 = (int) (valor / 0.25);
    valor -=moedas25 * 0.25;

    int moedas10 = (int) (valor / 0.10);
    valor -=moedas10 * 0.10;

    int moedas5 = (int) (valor / 0.05);
    valor -=moedas5 * 0.05;

    int moedas1cent = (int) Math.round(valor / 0.01);

    System.out.println("NOTAS:");
    System.out.println(notas100 + " nota(s) de R$ 100.00");
    System.out.println(notas50 + " nota(s) de R$ 50.00");
    System.out.println(notas20 + " nota(s) de R$ 20.00");
    System.out.println(notas10 + " nota(s) de R$ 10.00");
    System.out.println(notas5 + " nota(s) de R$ 5.00");
    System.out.println(notas2 + " nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(moedas1 + " moeda(s) de R$ 1.00");
    System.out.println(moedas50 + " moeda(s) de R$ 0.50");
    System.out.println(moedas25 + " moeda(s) de R$ 0.25");
    System.out.println(moedas10 + " moeda(s) de R$ 0.10");
    System.out.println(moedas5 + " moeda(s) de R$ 0.05");
    System.out.println(moedas1cent + " moeda(s) de R$ 0.01");

    
  }
  static void exe1000(){
    Scanner input = new Scanner(System.in);
    double valor = input.nextDouble();

    int notas100 = (int) valor / 100;
    valor %= 100;
    int notas50 = (int) valor / 50;
    valor %= 50;
    int notas20 = (int) valor / 20;
    valor %= 20;
    int notas10 = (int) valor / 10;
    valor %= 10;
    int notas5 = (int) valor / 5;
    valor %= 5;
    int notas2 = (int) valor / 2;
    valor %= 2;
    int moedas1 = (int) valor / 1;
    valor %= 1;
    int moedas50 = (int) (valor / 0.50);
    valor %= 0.50;
    int moedas25 = (int) (valor / 0.25);
    valor %= 0.25;
    int moedas10 = (int) (valor / 0.10);
    valor %= 0.10;
    int moedas5 = (int) (valor / 0.05);
    valor %= 0.05;
    int moedas1cent = (int) (valor / 0.01);

    System.out.println("NOTAS:");
    System.out.println(notas100 + " nota(s) de R$ 100.00");
    System.out.println(notas50 + " nota(s) de R$ 50.00");
    System.out.println(notas20 + " nota(s) de R$ 20.00");
    System.out.println(notas10 + " nota(s) de R$ 10.00");
    System.out.println(notas5 + " nota(s) de R$ 5.00");
    System.out.println(notas2 + " nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(moedas1 + " moeda(s) de R$ 1.00");
    System.out.println(moedas50 + " moeda(s) de R$ 0.50");
    System.out.println(moedas25 + " moeda(s) de R$ 0.25");
    System.out.println(moedas10 + " moeda(s) de R$ 0.10");
    System.out.println(moedas5 + " moeda(s) de R$ 0.05");
    System.out.println(moedas1cent + " moeda(s) de R$ 0.01");
    System.out.println(moedas10);
  }
    public static void main (String[] args) {
      //exe1001();
        //exe1002();
      //exe1004();
      //exe1005();
        //exe1007();
        //exe1008();
        //exe1009();
        //exe1012();
          //exe1015();
        //exe1016();
        //exe1018();
          //exe1019();
          //exe1021();
          //exe1000();

      }
  }