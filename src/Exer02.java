import java.util.Scanner;

public class Exer02 {

    static long sequenciaDeFibo(int numero){
        if (numero < 2){
            return numero;
        }else {
            return  sequenciaDeFibo(numero - 1) + sequenciaDeFibo(numero - 2);
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        String numeroEscolhido = scan.next();
        int numeroEscolhidoConvertido = Integer.parseInt(numeroEscolhido);

        for (int i = 0; i < 30; i++){
            if(numeroEscolhidoConvertido == sequenciaDeFibo(i)){
                System.out.println("Pertence a sequência");
                break;
            }else{
                System.out.println("Não pertence a sequência");

            }
        }
    }
}
