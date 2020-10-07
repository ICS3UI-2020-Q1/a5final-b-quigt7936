import java.util.Scanner;
/**
 * Adds all the odd numbers up to a given number
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // ask for the number
    System.out.println("Please enter the maximum number to sum to:");
    int userNumber = input.nextInt();

    // initiliaze the sum variable 
    int sum = 0;

    // for loop that stops when it reaches the users number
    for (int i = 0; i <= userNumber; i++) {
      // initiliaze the variable that tells the code if the number is odd or even
      int oddEven = i % 2;
      // if the number is odd add to sum if even go onto the next number
      if (oddEven == 1) {
        sum = sum + i;
      }
    }
    // tell the user the sum
    System.out.println("The sum of the odd numbers is " + sum);
  }
}
