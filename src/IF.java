import java.util.Scanner;
public class IF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("INFORME A MEDIA:");
        Double media = entrada.nextDouble();
        if(media>= 10.0 && media>=7.0){
            System.out.println("Aprovado!\n" + "parabens!");}

        if(media>= 7 && media>=4.5){
            System.out.println("Aprovado!\n" + "parabens!");}
        boolean criterioReprovacao = media <4.5 && media >= 0;
        if(criterioReprovacao){
            System.out.println("Reprovado!");
        }

        entrada.close();
    }
}