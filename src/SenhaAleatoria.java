public class SenhaAleatoria {
    public static void main(String[] args){

        int num = (int) (Math.random() * 6) + 5;

        StringBuilder senha = new StringBuilder();

        for(int i=0;i<num;i++){
            int a = (int) (Math.random() * 10);
            senha.append(a);
        }

        System.out.println("Senha gerada: "+senha.toString());
        
    }
}
