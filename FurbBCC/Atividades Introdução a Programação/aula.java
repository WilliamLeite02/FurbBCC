import java.util.Scanner;

public class aula{


    static void exe1(){
        Scanner w = new Scanner(System.in);

        //next = pega apenas a primeira palavra;
        // nextLine = pega todo o texto;

        String nome = w.next();
        System.out.println("");
        System.out.println(nome);
        String nm = w.nextLine();
        System.out.println("");
        System.out.println(nm);
       
    }   

    static void exe2(){
        Scanner w = new Scanner(System.in);

        String nome == "william";

         nome.equals("william");

         // == capita o enter depois da palavra digitada;
         // .equals pega a palavra sem a entrada do enter;


    }

    static void exe3(){

        String letra = 'm';
        letra.charAt(0);//possicao da letra;
        
        //
        switch (Letra){
            case 'm': 
            System.out.println("masculino");
            break;
            default : System.out.print("cagao");
            break;


        }

    }

    public static void main(String[] args){

            //exe1();
            // exe2();
        exe3();
    }   
}