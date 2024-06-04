import java.util.Random;

public class SimulacaoDados{
    public static void main(String[]args){
    Random r = new Random();
    
    int resultado = 0;

    for(int i=1;i<=3;i++){
        int jogada = r.nextInt(6)+1;
        System.out.println("Jogada "+i+": "+jogada);
        resultado += jogada;
    }

    System.out.println("O resultado final da soma das jogadas: "+resultado);
}
}