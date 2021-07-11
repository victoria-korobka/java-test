import java.util.Scanner; // Import the Scanner class for reading user input

public class Main {
  // Create a Method expecting one argument
  static void CheckDevRemainder(int number) {

    // Solution 1
    if ((number % 3) == 0) {
      System.out.println(number + " is divided by 3 without a remainder");
    } else {
      System.out.println(number + " is divided by 3 with a remainder");
    }

    // Solution 2
    boolean isEven = (number % 3) == 0;
    System.out.println(number + " is even: " + isEven);

  }

  public static void main(String[] args) {

    // Read user input
    Scanner userInputObject = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter a number: ");
    int num = userInputObject.nextInt(); // Read user input (the input should be of type Integer)

    // Call the method created in a previous step and provide it with the input number
    CheckDevRemainder(num);
  }

}
