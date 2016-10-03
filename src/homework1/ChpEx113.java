/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Scanner;

/**
 *
 * @author Vicky Lym
 */
public class ChpEx113 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numchar1;
        int numchar2;
        int numchar3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter first number:");
        numchar1 = input.nextInt();
        System.out.println("Please enter second number:");
        numchar2 = input.nextInt();
        System.out.println("Please enter third number:");
        numchar3 = input.nextInt();
        
        if ( numchar1 == numchar2 && numchar2 == numchar3) {
           System.out.println("All numbers are equal");
        } else {
           System.out.println("Numbers are not equal");
        }
    }
    
}
