package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        try{
            File f=new File("S:/JAVA_DSA/Java_Basic_Advanced/Java_basic_to_Advanced/src/FileHandling/Example");
            Scanner reader=new Scanner(f);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            FileWriter fw=new FileWriter(f);
            fw.write("Hello word");

            fw.close();
        }
        catch (Exception E){
            System.out.println(E);

        }
    }
}
