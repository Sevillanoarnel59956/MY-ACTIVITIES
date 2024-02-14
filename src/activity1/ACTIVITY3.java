
package activity3;

import java.util.Scanner;


public class ACTIVITY3 {

   
    public static void main(String[] args) {
        
       //using scanner 
        double celcius;               
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter Celcius: ");
        celcius = scan.nextDouble();
               
        double fahrenheit = (celcius*9/5)+32;
        
        System.out.println("Celcius: " + celcius + " C" + "\n" 
        + "Fahrenheit: " + fahrenheit + " F");
     


             // no scanner


//             double celcius = 11;
//      
//         double fahrenheit = (celcius * 9 / 5) + 32;
//       
//        System.out.println("Celcius: " + celcius + " C" + "\n" 
//        + "Fahrenheit: " + fahrenheit + " F");
        
        
    }
    
}
