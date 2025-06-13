import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int randomNumber = (int)(Math.random()*100);
    static int count = 0;
    public static void Input(){
        try{
            System.out.print("Enter your guess: ");
            int n = sc.nextInt();
            Game(n);
        } catch (InputMismatchException e){
            System.out.println("Enter a valid input!");
            Input();
        }
    }
    public static void numberOfTrials(){
        if(count < 5){
            Input();
        } else {
            System.out.println("GAME OVER! You exceed number of trials!");
            System.out.println("Random number was: " + randomNumber);
        }
    }
    public static void Game(int n){
        if(n == randomNumber){
            System.out.println("You guessed it right! You won!");
        } else if (n > randomNumber) {
            System.out.println("Your guess is bigger than random number!");
            count++;
            numberOfTrials();
        } else{
            System.out.println("Your guess is lower than random number!");
            count++;
            numberOfTrials();
        }
    }
    public static void main(String[] args) {
        System.out.println("Number Guessing Game! \nTry to guess a number between 1-99\nYou have 5 trials to guess!");
        Input();
    }
}