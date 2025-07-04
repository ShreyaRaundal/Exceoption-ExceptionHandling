import java.io.*;

public class FileNotFoundExample {
    public static void main(String[] args){
        try{
            FileReader fr=new FileReader("file.text");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
