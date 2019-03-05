
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\tGuess The Movie\n");
        Scanner userInput = new Scanner(System.in);
        GetRandomMovie ranMov = new GetRandomMovie();
        String randomMovie = ranMov.returnRandomMovie();
        //System.out.println(randomMovie);
        int length = randomMovie.length()-(randomMovie.split(" ").length-1);
        System.out.println("Number of characters: " + length);
        char ch;
        int k=3;
        String tmp = new String();
        GuessTheMovie movie = new GuessTheMovie();
        tmp=movie.printBlankSpace(randomMovie,tmp);
        char[] newTmp = tmp.toCharArray();
        char[] wrongChar = new char[3];
        int m=0;
        boolean win = false;
        movie.setNewTmp(newTmp);
        do {
            if(randomMovie.equals(new String(newTmp))) {
                win=true;
                break;
            }
            else{
                System.out.print("\nGuess a character ( " + k + " wrong characters only ): ");
                ch = userInput.next().charAt(0);
                k = movie.printChars(randomMovie,wrongChar,m,Character.toLowerCase(ch),k);
            }
        }while(k>0);
        System.out.println("\nMovie name: " + randomMovie);
        if(win){
            System.out.println("\nCongratulations you won!");
        }
        else {
            System.out.println("\nBetter luck next time!");
        }
    }
}
