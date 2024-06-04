import java.util.Scanner;

public class VerificaConteúdo {
    
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = tc.nextLine();

        if(frase.toLowerCase().contains("sexo") || frase.toLowerCase().contains("sexual")){
            System.out.println("Conteúdo impróprio");
        }else{
            System.out.println("Conteúdo liberado");
        }

        tc.close();
    }
}
