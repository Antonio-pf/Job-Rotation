import java.text.DecimalFormat;

public class TEst {

        static long sequenciaDeFibo(int numero){
            String armazena = " ";
            if (numero < 2){
                return numero;
            }else {
                return  sequenciaDeFibo(numero - 1) + sequenciaDeFibo(numero - 2);
            }

        }

    public static void main(String[] args) {
        sequenciaDeFibo(10);
    }
    }

