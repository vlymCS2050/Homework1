/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author Vicky Lym
 */
public class Chp1Ex126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String s, t;
    s = "ACTGACG";
    t = "TGACGAC";    

    /* s = "ACTGAGC";
    t = "TTCCGAC";
    */
    
    if ((s.length() == t.length()) && ((s + s).indexOf(t) != -1)) {
        System.out.println("s and t are circular shifts of each other");
    } else {
     System.out.println("s and t are not circular shifts of each other");
    }
    
    }
    
}
