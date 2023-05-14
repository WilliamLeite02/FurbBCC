import java.util.Scanner;
import java.text.DecimalFormat;
public class Prova2{
    public static void main(String[] args){
        Scanner w = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
    
    System.out.println("Código: (A) Hotel: 123Milhas Desconto: 15%");
    System.out.println("Código: (B) Hotel: MaxMilhas Desconto: 15%");
    System.out.println("Código: (C) Hotel: Azul Viagens Desconto: 20%");
    System.out.println("Código: (D) Hotel: Gol Viagens Desconto: 30%");
    System.out.println("Código: (E) Hotel: Latam Travel Desconto: 40%");
    System.out.println("Código: (F) Outros Desconto: Não há desconto");

        System.out.println("Digite o Código do Hotel desejado.");
            String cod= w.nextLine().toUpperCase();

        System.out.println("Informe o preço inicial: ");
        double preco = w.nextDouble();

        double desconto15 = (preco * 0.15);
        double desconto20 = (preco * 0.20);
        double desconto30 = (preco * 0.30);
        double desconto40 = (preco * 0.40);
        double precoTotal15 = (preco - desconto15);
        double precoTotal20 = (preco - desconto20);
        double precoTotal30 = (preco - desconto30);
        double precoTotal40 = (preco - desconto40);

    switch (cod) {
        case "A":
            if(preco >0 && preco <=500){
                System.out.println("Hotel: 123Milhas, Desconto: "+d.format(desconto15)+ " Preço Total: "+d.format(precoTotal15));
            }else{
                System.out.println("Preço inicial não corresponde.");
            }
            break;
        case "B":
            if(preco >0 && preco <=600){
                System.out.println("Hotel: MaxMilhas, Desconto: "+d.format(desconto15)+" Preço Total: "+d.format(precoTotal15));
            }else{
                System.out.println("Preço inicial não corresponde.");
            }
        break;
        case "C":
            if(preco >0 && preco <=1500){
                System.out.println("Hotel: Azul Viagens, Desconto: "+d.format(desconto20)+" Preço Total: "+d.format(precoTotal20));
            }else{
                System.out.println("Preço inicial não corresponde.");
            }
        break;
        case "D":
            if(preco >=300 && preco <=2000){
                System.out.println("Hotel: Gol Viagens, Desconto: "+d.format(desconto30)+" Preço Total: "+d.format(precoTotal30));
        }else{
            System.out.println("Preço inicial não corresponde.");
        }
        break;
        case "E":
            if(preco >=300 && preco <=2000){
                System.out.println("Hotel: Latam Travel, Desconto: "+d.format(desconto40)+" Preço Total: "+d.format(precoTotal40));
        }else{
            System.out.println("Preço inicial não corresponde.");
        }
        break;
        case "F":
            System.out.println("Hotel: Outros Não há desconto, Preço Total: "+preco);
        break;

        default:
            System.out.println("Código inválido");
            break;
    }
    


    }
}