package demomethodparameter;
import java.util.Scanner;
/**
 * 
 * @author Sourng Edu
 */
class MethodWithParamet{    
        int addTwoNumber(int a , int b){
            return (a+b); 	
        }
        int minusTwoNumber(int a , int b){
            return (a-b);
        }
        int multTwoNumber(int a , int b){
            return (a*b);
        }
        int divTwoNumber(int a , int b){
            return (a/b);
        }
}

public class DemoMethodParameter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);        
        MethodWithParamet obj=new MethodWithParamet();
        int a = 0 , b = 0;
System.out.print("Enter A:");
a=reader.nextInt(); 
System.out.print("Enter B:");
b=reader.nextInt();
        System.out.println( a + " + " + b +" = " +obj.addTwoNumber(a,b));
        System.out.println( a + " - " + b +" = " +obj.minusTwoNumber(a,b));
        System.out.println( a + " * " + b +" = " +obj.multTwoNumber(a,b));
        System.out.println( a + " / " + b +" = " +obj.divTwoNumber(a,b));
    }    
}
