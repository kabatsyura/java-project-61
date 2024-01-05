package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n"
                + "Your choice:");
        String typeOfGame = game.next();
        int countOfGames = 3;
        String userName = Cli.greeting(game);

        if (typeOfGame.equals("1")) {
            game.close();
        } else if (typeOfGame.equals("2")) {
            Even.isEven(game, countOfGames, userName);
        }
    }
}
