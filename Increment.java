/*
 * Name: Kennedy Keyes
 * Date: March 23, 2021
 * Name of Program: Increment.java
 * Description: This program will demonstrate prefix increment and postfix 
increment operators.
 */
package increment;

/**
 *
 * @author codingken
 */
public class Increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // demonstrate postfix increment operator
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c); // prints 5
        System.out.printf("      postincrementing: %d%n", c++); // prints 5
        System.out.printf(" c after postincrement: %d%n", c); // prints 6
        
        System.out.println(); // skip a line
        
        // demonstrate prefix increment operator
        c = 5;
        System.out.printf("c before preincrement: %d%n", c); // prints 5
        System.out.printf("      preincrementing: %d%n", c); // prints 6
        System.out.printf(" c after preincrement: %d%n", c); // prints 6
    }
    
}
