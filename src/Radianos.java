import java.util.Scanner;

public class Radianos {
    
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite um valor em radianos: ");
        double radianos = tc.nextDouble();

        double graus = Math.toDegrees(radianos);

        System.out.println(radianos+" radianos é igual a "+graus+" graus");

        tc.close();
    }
}
