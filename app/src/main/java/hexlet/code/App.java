package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int numberOfGames = 3;
        final int firstGame = 2;
        final int lastGame = 6;
        Scanner game = new Scanner(System.in);
        App.intro();
        String typeOfGame = game.next();
        int intTypeOfGame = Integer.parseInt(typeOfGame);
        String userName = "";
        String introOfGame = "";

        if (intTypeOfGame == 1) {
            userName = Cli.greeting(game);
            game.close();
        } else if (intTypeOfGame >= firstGame && intTypeOfGame <= lastGame) {
            userName = Cli.greeting(game);
            introOfGame = Engine.chooseGame(typeOfGame);
            System.out.println(introOfGame);
            Engine.playGame(userName, game, typeOfGame, numberOfGames);
        } else {
            game.close();
        }
    }

    private static void intro() {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
    }
}
