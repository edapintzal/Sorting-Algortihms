public class merge_sort {

    public static void merge_sort(int[] array, int start, int end) {
        if (end - start < 2) {
            return; // 1 eleman kaldıysa sıralı kabul edilir
        }

        int mid = (start + end) / 2;

        // Alt dizileri sıralamak için recursive çağrı
        merge_sort(array, start, mid);
        merge_sort(array, mid, end);

        // Sonra birleştir
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start];
        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i < mid) {
            temp[k++] = array[i++];
        }
        while (j < end) {
            temp[k++] = array[j++];
        }

        // temp dizisini orijinal diziye kopyala
        for (int t = 0; t < temp.length; t++) {
            array[start + t] = temp[t];
        }
    }


}
