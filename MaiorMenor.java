public class MaiorMenor {

    private int[] numeros;
    private int maiorValor;
    private int menorValor;

    public MaiorMenor(int[] numeros) {
        this.numeros = numeros;
    }

    public void encontrarMaiorMenor() {
        if (numeros == null || numeros.length == 0) {
            System.out.println("O array está vazio.");
            return;
        }

        maiorValor = numeros[0];
        menorValor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }

            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
        }
    }

    public int getMaiorValor() {
        return maiorValor;
    }

    public int getMenorValor() {
        return menorValor;
    }

    public int[] getNumeros() {
        return numeros;
    }
}