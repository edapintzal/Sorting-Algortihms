import java.lang.reflect.Array;

public class insertion_sort {
    public static void sorting(int[]array){
        int n= array.length;
        int i;
        for(int j=1;j<n;j++){
            i=j-1;
            int key = array[j];
            while(i>=0 && array[i] >key){
                array[i+1]=array[i];
                i-=1;
            }
            array[i+1]=key;
        }
    }

}
