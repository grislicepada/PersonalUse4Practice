
package FirstPract;


import java.util.Scanner;
public class boiling {
   
    
    public static void main (String[] args){
          Scanner scanner = new Scanner (System.in);
        System.out.println("Give in the temperature");
      
        int temp = scanner.nextInt();
        if (temp >= 100){
            System.out.println("The water is boiling");
        } else {
            System.out.println("The water is not boiling");
        }
        
    }
    
}
