/*
 * Ex: How to show number from 100 to 0 by decress 3 unit
 * @author Sourng Edu
 */
package demowhile;
import java.util.Scanner;
public class DemoWhile {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
/*        int n=100;  
        while (n>0){  
            System.out.print( n + " ");  
            n -= 3 ; 
        } 
*/
        int num=0;                
        String input;           
        while (true){   
            System.out.print(" count Countinue?(y or n)");           
            input = sc.next();           
            if (input.equalsIgnoreCase("N")) break;              
            num+=1;           
        }      
        System.out.println("You Input"+ num +" times");
        System.out.println(" Closed ! ");
    }    
}
