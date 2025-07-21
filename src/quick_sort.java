public class quick_sort {

    public static int partition(int[] array, int start, int end) {
        int pivot_value = array[end - 1];
        int x = start - 1;

        for (int i = start; i < end - 1; i++) {
            if (array[i] < pivot_value) {
                x++;
                int temp = array[x];
                array[x] = array[i];
                array[i] = temp;
            }
        }

        // pivot'u doğru yerine koy
        int temp = array[x + 1];
        array[x + 1] = array[end - 1];
        array[end - 1] = temp;

        return x + 1;
    }

    public static void quick_sort(int[] array, int a, int b) {
        if (a < b - 1) { // en az 2 eleman olmalı
            int par = partition(array, a, b);
            quick_sort(array, a, par);
            quick_sort(array, par + 1, b);
        }
    }

}
