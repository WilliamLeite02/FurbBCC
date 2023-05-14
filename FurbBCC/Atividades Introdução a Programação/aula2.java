import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class aula{


    static void exe1(){
        Scanner w = new Scanner(System.in);

        for (int i=1; i<=3; i++){
            String nome =w.nextLine();
            System.out.println("i vale "+ i);
            System.out.println(nome + " tem "+nome.length()+" letras");

        }
        String nome=w.nextLine();
        while (!nome.equals("fim")){
            System.out.println(nome + " tem "+ nome.length());
            nome = w.nextLine();
        }

       
    }   

    static void exe2(){
        Scanner w = new Scanner(System.in);
        String feliciade = "";

        System.out.println("informe grau");
        int indc = w.nextInt();

        for(int i =1; i<=indc; i++){
            feliciade = feliciade + "i";
        
            System.out.println("estou feliz"+ feliciade+"");
        }


    }

    public static void main(String[] args){

            //exe1();
            exe2();
    }   
}