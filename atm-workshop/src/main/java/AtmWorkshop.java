import java.util.Scanner;

public class AtmWorkshop {

    public static void main(String[] args) {
        atmInteration();
    }

    public static boolean atm(int guess){
        int pin = 4457;
        return guess == pin;
    }
    public static void atmInteration(){
        System.out.println("What is your pin number?");
        Scanner scanner = new Scanner(System.in);
        int pinGuess = scanner.nextInt();
        while(!atm(pinGuess)) {
            System.out.println("That was the wrong pin! Try again");
            pinGuess = scanner.nextInt();
        }
        System.out.println("You got it! Here's your money");
    }

}
//    For the following exercises, you'll need to figure out whether a while or
//    a do/while loop is most appropriate:
//
//        ATM: Prompt the user for a PIN.
//        Display an error message if the user gets it wrong, and prompt again.
//        If the user gets it right, print a congratulatory message.
//
//        Stretch goal: quit after three failed attempts with an apologetic message.
//        Sum: Ask the user for an integer. Calculate the sum of the numbers from one
//        to the integer the user entered. Example: If the user enters 6, your program should print 21 (1 + 2 + 3 + 4 + 5 + 6).
//
//        Stretch goal: Allow the user to enter a lower integer and a higher integer.
//        Calculate the sum of the numbers from the lower to the higher, inclusive.
//        Example: If the user entered 4, then 6, your program should print 15 (4 + 5 + 6).
//        Stretchier goal: If user enters a lower number for the second number,
//        display an error message instead of calculating the sum.