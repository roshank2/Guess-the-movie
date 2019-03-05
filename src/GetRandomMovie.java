import java.io.FileNotFoundException;
import java.nio.file.*;
import java.util.Scanner;
import java.io.*;

public class GetRandomMovie {

    private String randomMovie=null;

    private int randomNumber(int num){
        return (int)((Math.random()*num));
    }

    public String returnRandomMovie(){
        int k=0;
        try{
            File file = new File("movies.txt");
            Scanner fromFile = new Scanner(file);
            while (fromFile.hasNextLine()){
                fromFile.nextLine();
                k++;
            }
            fromFile.close();
        }catch (FileNotFoundException e){
            System.out.println("File does not exist");
        }
        k=randomNumber(k);
        try {
            randomMovie = Files.readAllLines(Paths.get("movies.txt")).get(k);
        }catch (IOException e){
            System.out.println("File does not exist");
        }
        return randomMovie;
    }
}
