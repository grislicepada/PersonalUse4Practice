

package FirstPract;


import java.util.Scanner;

public class ScannerAndWhileLoop {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
            boolean u= true;
            while (u) {
//                
               System.out.print("Enter value for x: ");
            int x = scanner.nextInt();

            System.out.print("Enter value for y: ");
            int y = scanner.nextInt();

            System.out.print("Enter value for z: ");
            int z = scanner.nextInt();
//
//           
////          
            System.out.println("\nResults:");
            System.out.println("("+x+"*"+y+"-"+z+")("+x+"*"+y+"-"+z+")/3="+((x*y-z)*(x*y-z)/3));
            System.out.println("("+x+"+"+z+"*"+y+")"+"("+x+"*"+z+"+4)="+((x+z*y)*(x*z+4)) );
            System.out.println("("+y+"-"+x+")("+z+"*"+x+")("+x+"*"+y+")="+((y-x)*(z*y)*(x*y)));

            // Asking the user if they want to continue
            System.out.print("\nDo you want to enter new values? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                u = false;
            }
        }

        // Closing scanner
        scanner.close();
        System.out.println("Program ended.");
    }
}