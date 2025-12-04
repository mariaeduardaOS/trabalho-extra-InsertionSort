public class InsertionsortSimples {

    public static void main(String[] args) {

        int[] numeros = { 5, 2, 9, 1, 3 };
        insertionSort(numeros);

        System.out.println("Vetor ordenado:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {

            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = chave;
        }
    }
}
