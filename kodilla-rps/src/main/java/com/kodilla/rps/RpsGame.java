package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    private boolean end = false;
    private String playerName;
    private int roundsQuantity;
    private String playerMove;
    private String computerMove;
    int playerWins;
    int computerWins;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void startTheGame() {
        System.out.print("What is your name? ");
        playerName = scanner.nextLine();
        System.out.print("How many rounds? ");
        roundsQuantity = scanner.nextInt();
    }

    public void instruction() {
        System.out.println("How to play?");
        System.out.println("Just press the key and hit Enter:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.println("x - End of the Game");
        System.out.println("n - New Game");
    }

    public void letsPlay() {
        while (!end) {
            playerWins = 0;
            computerWins = 0;
            end = gameRound();
            if (roundsQuantity == playerWins) {
                System.out.println("Congrats " + playerName + ", you win!");
            } else if (roundsQuantity == computerWins) {
                System.out.println("Sorry " + playerName + ", but you lost.");
            }
        }
    }

    private boolean gameRound() {
        while ((playerWins < roundsQuantity && (computerWins < roundsQuantity))) {
            System.out.print("Select option: ");
            playerMove = scanner.next();
            if ("x".equals(playerMove)) {
                end = quitChecker();
                return end;
            } else if ("n".equals(playerMove)) {
                System.out.println("OK, lets start again.");
                return false;
            }
            System.out.println("You choose: " + moveDisplayer(playerMove));
            computerMove = String.valueOf(random.nextInt(1, 4));
            System.out.println("Computer choose: " + moveDisplayer(computerMove));

            if (computerMove.equals(playerMove)) {
                System.out.println("There is a tie!");
            } else if ("3".equals(computerMove) && "2".equals(playerMove)) {
                System.out.println("Computer win!");
                computerWins++;
            } else if ("2".equals(computerMove) && "1".equals(playerMove)) {
                System.out.println("Computer win!");
                computerWins++;
            } else if ("1".equals(computerMove) && "3".equals(playerMove)) {
                System.out.println("Computer win!");
                computerWins++;
            } else if ("3".equals(playerMove) && "2".equals(computerMove)) {
                System.out.println("You win!");
                playerWins++;
            } else if ("2".equals(playerMove) && "1".equals(computerMove)) {
                System.out.println("You win!");
                playerWins++;
            } else if ("1".equals(playerMove) && "3".equals(computerMove)) {
                System.out.println("You win!");
                playerWins++;
            } else {
                System.out.println("Try again.");
            }

            System.out.println("Player: " + playerWins + ", Computer: " + computerWins);
        }
        return true;
    }

    private String moveDisplayer(String move) {
        if ("1".equals(move)) {
            return "rock.";
        } else if ("2".equals(move)) {
            return "paper.";
        } else if ("3".equals(move)) {
            return "scissor";
        }
        return "option not defined.";
    }

    private boolean quitChecker() {
        String question = "";
        while (!"y".equals(question)) {
            System.out.print("Are you sure? (y/n) ");
            question = scanner.next();
            if ("n".equals(question)) {
                System.out.println("Super! Back to the game!");
                return false;
            }
        }
        System.out.println("OK. Bye.");
        return true;
    }
}
