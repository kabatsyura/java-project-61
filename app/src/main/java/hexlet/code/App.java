package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int numberOfGames = 3;

        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit\n"
                + "Your choice:");
        String typeOfGame = game.next();
        int intTypeOfGame = Integer.parseInt(typeOfGame);
        String userName = "";
        String introOfGame = "";

        if (intTypeOfGame == 1) {
            userName = Cli.greeting(game);
            game.close();
        } else if (intTypeOfGame >= 2 && intTypeOfGame <= 6) {
            userName = Cli.greeting(game);
            introOfGame = Engine.chooseGame(typeOfGame);
            Engine.playGame(userName, game, typeOfGame, numberOfGames);
        } else {
            game.close();
        }
    }
}
