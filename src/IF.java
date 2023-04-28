import java.util.Scanner;
public class IF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("INFORME A MEDIA:");
        Double media = entrada.nextDouble();
        if(media>= 7.0){
            System.out.println("Aprovado!\n" + "parabens!");}
        else {
            System.out.println("reprovado");
        }
        entrada.close();
    }
}