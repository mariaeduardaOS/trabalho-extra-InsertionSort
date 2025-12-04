public class InsertionSort {

    public static void main(String[] args) {

        int[] v = {5, 2, 9, 1, 3};

        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = chave;
        }

        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}
