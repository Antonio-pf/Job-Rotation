import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("##");
        Scanner scan = new Scanner(System.in);
        String numerosComD [] = {"2","10","12","16","17","18","19","200","201","202","203","204"};

        String opcao = "";
        System.out.println("Escolha:");
        System.out.println("a- Imprime impares");
        System.out.println("b- Imprime um número mais seu antecessor:");
        System.out.println("c- Imprime potência de números sucessivos:");
        System.out.println("d- Imprime potências de 2:");
        System.out.println("e- Imprime Fibonnaci:");
        System.out.println("f- Imprime números com iniciais d:");
        opcao = scan.next();

        switch (opcao) {
            case "a":
                for (int i = 1; i <= 50; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            case "b":
                int contador = 2;
                for (int i = 0; i <= 20; i++) {
                    System.out.println(contador);
                    contador = contador + contador;

                }
                break;
            case "c":

                for (int i = 0; i <= 20; i++) {
                    contador = i;
                    double sequencia = Math.pow(contador, 2);

                    System.out.println(df.format(sequencia));

                }
                break;

            case "d":

                contador = 2;
                for (int i = 2; i <= 20; i++) {

                    double sequencia = Math.pow(contador,i);

                    System.out.println(df.format(sequencia));
                }
                break;
            case "e":
                Exer02.listaFibo();
                break;
            case "f":
                for (int i = 0; i < numerosComD.length; i ++){
                    System.out.println(numerosComD[i]);
                }
                break;
        }
    }
}
