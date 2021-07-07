
import java.util.Scanner;

class DriverC {

    public static void main (String[] args) {

        // Create new scanner object
        Scanner input = new Scanner(System.in);

        // Create boolean to detect if numbers are the same
        boolean isEqual;

        // Prompt the user to input first complex number
        // Prompt to input real part and assign to variable
        System.out.print("Enter the first complex number's real part => ");
        double real = input.nextDouble();

        // Prompt to input imaginary part and assign to variable
        System.out.print("Enter the first complex number's imaginary part => ");
        double imaginary = input.nextDouble();

        // Create new ComplexNo object with real/imaginary parts
        ComplexNo numberOne = new ComplexNo(real,imaginary);


        // Prompt the user to input second complex number
        // Prompt to input real part and assign to variable
        System.out.print("Enter the second complex number's real part => ");
        real = input.nextDouble();

        // Prompt to input imaginary part and assign to variable
        System.out.print("Enter the second complex number's imaginary part => ");
        imaginary = input.nextDouble();

        // Create new ComplexNo object with real/imaginary parts
        ComplexNo numberTwo = new ComplexNo(real,imaginary);



        // Solve to add, subtract, multiply and divide two complex numbers
        // Echo-print user inputs
        System.out.printf("complex number 1: %s\n", numberOne);
        System.out.printf("complex number 2: %s\n", numberTwo);

        // Create new isEqual variable to print out to determine if numbers are equal
        isEqual = numberOne.equals(numberTwo);
        System.out.printf("the numbers are equal? %s\n", isEqual);


        // Create new numberAdded object with add method and print
        ComplexNo numberAdded = numberOne.add(numberTwo);
        System.out.printf("add result: %s\n", numberAdded);

        // Create new numberSubtracted object with subtract method and print
        ComplexNo numberSubtracted = numberOne.subtract(numberTwo);
        System.out.printf("subtract result: %s\n", numberSubtracted);

        // Create new numberMultiplied object with multiply method and print
        ComplexNo numberMultiplied = numberOne.multiply(numberTwo);
        System.out.printf("multiply result: %s\n", numberMultiplied);

        // Create new numberDivided object with divide method and print
        try {

            System.out.printf("divide result: %s\n", numberOne.divide(numberTwo) );
        }
        catch (Exception e) {
            System.out.println("cannot divide by zero");
        }



    }
}