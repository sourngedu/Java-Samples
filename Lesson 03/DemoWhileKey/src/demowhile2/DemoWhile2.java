
import java.util.Scanner;

//import java.util.Scanner;
package demowhileKey;
public class DemoWhileKey {
     static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        int num=2;                
        String input;           
        while (true){   
            System.out.print(" count Countinue?(y or n)");           
            input = sc.next();           
            if (input.equalsIgnoreCase("N")) break;              
            num+=1;           
        }          
        System.out.println(" Closed ! ");         
    }
}
