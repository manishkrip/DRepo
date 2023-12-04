import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);

    static void print(String text) {
        System.out.println(text);
    }

    static String getInput() {
        return scanner.nextLine().toLowerCase();
    }

    static void gameOver() {
        print("Game Over. Thanks for playing!");
        System.exit(0);
    }

    static void exploreForest() {
        print("You are in a mysterious forest. What will you do?");
        print("Options: 1. Search for clues, 2. Head towards the river");

        String choice = getInput();

        if (choice.equals("1")) {
            print("You find a hidden path!");
            print("Options: 1. Follow the path, 2. Return to the clearing");
            choice = getInput();

            if (choice.equals("1")) {
                exploreCave();
            } else {
                exploreForest();
            }
        } else if (choice.equals("2")) {
            print("You arrive at the river.");
            print("Options: 1. Build a raft, 2. Swim across");

            choice = getInput();

            if (choice.equals("1")) {
                print("You build a sturdy raft and cross the river safely!");
                print("You find a castle in the distance. You win!");
            } else {
                print("You attempt to swim but are swept away by the current. Game over.");
                gameOver();
            }
        } else {
            print("Invalid choice. Please try again.");
            exploreForest();
        }
    }

    static void exploreCave() {
        print("You enter a dark cave. It's very cold and damp.");
        print("Options: 1. Keep moving forward, 2. Go back to the forest");

        String choice = getInput();

        if (choice.equals("1")) {
            print("You encounter a sleeping dragon!");
            print("Options: 1. Sneak past, 2. Attempt to fight");

            choice = getInput();

            if (choice.equals("1")) {
                print("You sneak past the dragon and find a hidden treasure!");
                print("Congratulations! You win!");
            } else {
                print("The dragon awakens and engulfs you in flames. Game over.");
                gameOver();
            }
        } else if (choice.equals("2")) {
            exploreForest();
        } else {
            print("Invalid choice. Please try again.");
            exploreCave();
        }
    }

    public static void main(String[] args) {
        print("Welcome to the Text Adventure Game!");
        exploreForest();
    }
}
