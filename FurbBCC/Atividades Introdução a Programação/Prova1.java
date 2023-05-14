import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        
        String cor;
        int numeroRGB;

        cor = w.nextLine();

        if (cor == ""){
            System.out.println("Valor inválido");
        }

        numeroRGB = w.nextInt();
        
        if(numeroRGB <255){
            System.out.println("Valor inválido");
        }else{
            int novaCor = numeroRGB + 20;
            System.out.println("Cor: "+ cor +" Nova cor: "+novaCor);
        }


    }
}
