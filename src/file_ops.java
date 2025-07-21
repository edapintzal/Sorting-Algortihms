import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_ops {
    public static int [] array; ;
    public static void file_reader(String filename){
        try {
            File myObj = new File(filename);
            Scanner counter = new Scanner(myObj);
            int size=0;
            while (counter.hasNextLine()) {
                String data = counter.nextLine();
                size++;
            }
            counter.close();
            array = new int[size];
            int i=0;
            Scanner reader = new Scanner(myObj);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                array[i] = Integer.parseInt(data);
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void create_file(String filename){
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void write_file(String filename , int [] array){
        try {
            FileWriter myWriter = new FileWriter(filename);
            for(int i=0;i< array.length;i++){
                int data = array[i];
                String dataa = String.valueOf(data) + "\n";
                myWriter.write(dataa);
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
