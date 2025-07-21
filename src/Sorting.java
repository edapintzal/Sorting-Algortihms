public class Sorting {
    public static int[]increase;
    public static int[]decrease;
    public static void main(String[] args) {
        String filename;
        String [] sort_algo = {"insertion" ,"merge" , "heap" ,"quick" };
        String [] data_size = {"1K" , "10K" , "100K"};
        String [] data_type = {"random" , "increasing" , "decreasing"};
        long start=0;
        long end=0;
        long execution=end-start;

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    String read_file = data_size[j] + "_random_input.txt";
                    file_ops.file_reader(read_file);
                    int [] array = file_ops.array;
                    filename=sort_algo[i]+"sort_" + data_size[j] + "_" + data_type[k] + "_output.txt";
                    System.out.println(filename);
                    file_ops.create_file(filename);
                    int number=0;
                    if(data_size[j].equals("1K")){
                        number = 1000;
                    } else if (data_size[j].equals("10K")) {
                        number=10000;
                    }
                    else{
                        number=100000;
                    }

                    if(sort_algo[i].equals("insertion")){
                        if(data_type[k].equals("increasing")){
                            array=increasing_array(number);
                        } else if (data_type[k].equals("decreasing")) {
                            array=decreasing_array(number);
                        }
                        else{
                            array=array;
                        }
                        start=System.nanoTime();
                        insertion_sort.sorting(array);
                        end=System.nanoTime();
                        execution=end-start;
                    }
                    else if (sort_algo[i].equals("merge")) {
                        if(data_type[k].equals("increasing")){
                            array=increasing_array(number);
                        } else if (data_type[k].equals("decreasing")) {
                            array=decreasing_array(number);
                        }
                        else{
                            array=array;
                        }
                        start=System.nanoTime();
                        merge_sort.merge_sort(array,0, array.length);
                        end=System.nanoTime();
                        execution=end-start;
                    }
                    else if (sort_algo[i].equals("heap")) {
                        if(data_type[k].equals("increasing")){
                            array=increasing_array(number);
                        } else if (data_type[k].equals("decreasing")) {
                            array=decreasing_array(number);
                        }
                        else{
                            array=array;
                        }
                        start=System.nanoTime();
                        heap_sort.heap_sort(array);
                        end=System.nanoTime();
                        execution=end-start;
                    }
                    else if(sort_algo[i].equals("quick")){
                        if(data_type[k].equals("increasing")){
                            array=increasing_array(number);
                        } else if (data_type[k].equals("decreasing")) {
                            array=decreasing_array(number);
                        }
                        else{
                            array=array;
                        }
                        start=System.nanoTime();
                        quick_sort.quick_sort(array,0,array.length);
                        end=System.nanoTime();
                        execution=end-start;
                    }
                    System.out.println("Execution time for " + sort_algo[i] + " " + array.length +  " "  + data_type[k] + ": " + execution / 1_000_000.0 + " ms");
                    file_ops.write_file(filename,array);

                }
            }
        }

    }
    public static void print(int[] array){
        for(int i=0;i< array.length;i++){
            System.out.println(i + " " + array[i]);
        }
    }
    public static int[] increasing_array(int size){
        increase=new int[size];
        for(int i=0;i<size;i++){
            increase[i]=i;
        }
        return increase;
    }
    public static int[] decreasing_array(int size){
        decrease=new int[size];
        for(int i=0;i<size;i++){
            decrease[i]=size-1-i;
        }
        return decrease;
    }
}