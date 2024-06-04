import java.util.Scanner;

public class InversorFrases {
    
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = tc.nextLine();

        String fraseSemEspacos = frase.replaceAll("\\s", "");

        String fraseInvertida = new StringBuilder(fraseSemEspacos).reverse().toString();

        System.out.println("Frase sem espaços e invertida" + fraseInvertida);

        tc.close();
    }
}
