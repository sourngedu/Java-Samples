/*
 using for loop
 * @author Sourng Edu
 */
package demoforloop;
import java.util.Scanner;
public class DemoForLoop {
    public static void main(String[] args) {
        // TODO code application logic here
        int n, m ; 
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter N: ");      
        n = reader.nextInt();       
        System.out.print("Enter M:");
        m=reader.nextInt(); 
System.out.println ("The Even number Between  " + n + "  and " + m   ); 
        for ( int i=n ; i<m ; i++){  
            if (( i % 2 ) ==0)   
                System.out.print ( i + "     ");  
        }
 
    }    
}
