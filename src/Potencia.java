import java.util.Scanner;

public class Potencia {
    
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

    System.out.print("Digite a base:");
    double base = tc.nextDouble();

    System.out.print("Digite o expoente: ");
    double expoente = tc.nextDouble();

    double total = Math.pow(base, expoente);

    System.out.println("Resultado de " + base + " elevado a " + expoente + " é: " + total);

    tc.close();
    }

}
