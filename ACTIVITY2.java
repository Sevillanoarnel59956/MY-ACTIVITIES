
package activity2;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class ACTIVITY2 {

  
   
    public static void main(String[] args) {
        int[] elements = {5,4,3,2,1};
        System.out.println("The 5 elements are: " + " "+
                Arrays.toString(elements));
        
       
        int sum = elements[0]+elements[1]+elements[2]+elements[3]+elements[4];
        System.out.println("The sum of all elements is: " + sum);
        
        int maximum = Math.max(elements[0], Math.max(elements[1], Math.max(elements[2], Math.max(elements[3], elements[4]))));
        System.out.println("The maximun elements is: " + maximum);
      
    }
}
        
        
    
    

