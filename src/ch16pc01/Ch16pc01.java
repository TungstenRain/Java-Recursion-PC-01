package ch16pc01;

import java.util.Scanner;

/**
 * Recursive multiplication via addition
 * @author frank
 */
public class Ch16pc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int x = 0, y = 0, result;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Recursive Multiplication by addition.");
        System.out.print("Please enter an integer: ");
        x = keyboard.nextInt();
        System.out.print("Please enter an integer: ");
        y = keyboard.nextInt();
        System.out.println("Calculating...");
        
        // Assign result of recursive multiplication to variable
        result = recursiveMultiplication(x, y);
        
        System.out.print("The result of multiplying " + Integer.toString(x) +
                " and " + Integer.toString(y) + " results in: " +
                Integer.toString(result) + ".");
    }
    
    /**
     * Method to recursively add two integers to create the result as if they
     * were multiplied
     * @param x int The first integer
     * @param y int The second integer
     * @return int The value of the recursive addition
     */
    private static int recursiveMultiplication(int x, int y) {
        if (x == 0 || y == 0)
            return 0;
        else if (x < 0 || y < 0) 
            return - x + recursiveMultiplication(x, y + 1);
        else
            return x + recursiveMultiplication(x, y - 1);
    }
}
