public class heap_sort {
    public static void max_heapify(int[] array,int n , int i){
        int largest = i;
        int left = 2 * i +1 ;
        int rigth = left + 1;
        if(left < n && array[left] > array[largest]){
            largest=left;
        }
        if(rigth< n && array[rigth] > array[largest]){
            largest=rigth;
        }
        if(largest!=i){
            int temp = array[i];
            array[i]=array[largest];
            array[largest]=temp;
            max_heapify(array,n,largest);
        }
    }
    public static void heap_sort(int[] array){
        int n = array.length;
        for(int i = n/2-1; i>=0;i--){
                max_heapify(array,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            max_heapify(array,i,0);
        }
    }
}
