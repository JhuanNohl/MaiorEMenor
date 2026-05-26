import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        System.out.println("Elementos gerados:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
            System.out.print(numeros[i] + " ");
        }

        MaiorMenor maiorMenor = new MaiorMenor(numeros);
        maiorMenor.encontrarMaiorMenor();

        System.out.println();
        System.out.println("Maior valor: " + maiorMenor.getMaiorValor());
        System.out.println("Menor valor: " + maiorMenor.getMenorValor());
    }
}