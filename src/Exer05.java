import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String palavra = "";
        String palavraInversa = "";
        System.out.println("Digite uma palavra: ");
        palavra = scan.next();


        for(int i = palavra.length() - 1; i >= 0; i--){//começa do final para o começo
            palavraInversa = palavraInversa + palavra.charAt(i);

        }
        System.out.println(palavraInversa);
    }
}
