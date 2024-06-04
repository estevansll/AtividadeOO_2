import java.util.Scanner;

public class ExibirString {
    
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String txt = tc.nextLine();

        if(txt.length() > 0){
            String sub = txt.substring(0, txt.length() - 1);
            System.out.println("Substring sem o último caractere: "+sub);
        }else{
            System.out.println("A string está vazia");
        }

        tc.close();
    }
}
