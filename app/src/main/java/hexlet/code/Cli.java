package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String greeting(Scanner game) {
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = game.next();
        System.out.println("Hello, " + userName + "!");
//        game.close();

        return userName;
    }
}
