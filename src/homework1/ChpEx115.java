/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.*;
import java.util.Scanner;


/**
 *
 * @author Vicky Lym
 */
public class ChpEx115 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        double y;  
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a value between 0 and 1");
        x = input.nextDouble();
        System.out.println("Please enter second value between 0 and 1:");
        y = input.nextDouble();
        
        if (( (x > 0) && (x < 1)) && ((y > 0) && (y < 1))) {
           System.out.println("Numbers are between 0 and 1");
        } else {
           System.out.println("Numbers are not between 0 and 1");
        }
    }
    
}
