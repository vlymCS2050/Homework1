/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Vicky Lym
 * Testing GitHub process
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Print Fizz number / 3
        // Print Buzz number / 5
        // Print FizzBuzz number / 15
        // Otherwise just print number
        
        for (int i = 1; i <= 100; i++) {
        
            if (i % 3 == 0) {
              System.out.print("Fizz");
            } 
            if (i % 5 == 0) {
                 System.out.print("Buzz");
            }
            if ((!(i % 3 == 0)) && (!(i % 5 == 0))) {
                 System.out.print(i);
            }
            System.out.println();   
        }
        
    }
    
}
