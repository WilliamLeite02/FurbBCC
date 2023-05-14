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
        
        int a = 8;
        int b = 10;
        System.out.print(a + " " + b + " ");
        
        for (int i = 2; i < n; i++) {
            int c = a * 2 + b * 2;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        

    }


    public static void main(String[] args){

            //exe1();
            //exe2();
            //exe3();
            //exe4();
            exe5();



    }   
}