import java.util.Scanner;

public class PrecoFarmacia {
    
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

        while(true){
            System.out.println("Digite o preço do produto (ou 0 para encerrar): ");
            double preco = tc.nextDouble();

            if(preco==0){
                break;
            }

            double novoPreco = preco * 1.12;

            double precoArredondado = Math.round(novoPreco*100.0)/100.0;

            System.out.println("Novo preço com aumento de 12%: R$ " + precoArredondado);
        }

        System.out.println("Programa Encerrado");
        tc.close();
    }
}
