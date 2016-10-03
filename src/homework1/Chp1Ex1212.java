/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chp1ex1212;

import java.text.SimpleDateFormat;
import java.util.*;
/** import java.util.Calendar;
*   import java.util.GregorianCalendar;
*/

/**
 *
 * @author Vicky Lym
 */
public class Chp1Ex1212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of a GregorianCalendar
        
        Calendar calendar = new GregorianCalendar();
        
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        
        // Format the output
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(date_format.format(calendar.getTime()));  
        
         // create a calendar
        Calendar cal = Calendar.getInstance();
        
        // print the new time
        Date d = cal.getTime();
        System.out.println("After setting Time:  " + d);       

        // create new date and set it
        // Date date = new Date(95, 10, 10);
        // cal.setTime(date);
        int dayWeekNum = ((cal.get(Calendar.DAY_OF_WEEK)) - 1);
	dayOfWeek(dayWeekNum);
        
        // System.out.println("int day of week" + dayOfWeek);
        
        // print the new time
        // System.out.println("Day of the week:  " + dayWeek[dayOfWeek]);  
        
    }
    
          public static void dayOfWeek(int dayOWeek) {
             String[] dayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                                 "Thursday", "Friday", "Saturday"};
            
         // print the new time
        System.out.println("dayOfWeek Method Day of the week:  " + dayWeek[dayOWeek]); 
        //this is a test
        
        }
}