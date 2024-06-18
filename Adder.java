import java.util.Scanner;
// Adder class
public class Adder{
    
    // main method makes the program work
    public static void  main(String[] args){
        // scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type two integer values: "); // prompt user on what the program needs
        int firstInput = scanner.nextInt(); // first input value - must be declared as int to match the parameter fields
        int secondInput = scanner.nextInt(); // second input value - must be declared as int to match the parameter fields
        int result = add(firstInput, secondInput); // variable to store the method - this step makes it easier to print/reference later
        System.out.println("The sum of both values are: "); // communicate to user what the next print statement is
        System.out.println(result); // print out the result of the add method using scanner 
    }
    //method (defined task) that has a return type of int and that takes two parameters and then adds the two values 
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
}
