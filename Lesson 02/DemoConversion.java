package democonversion;
/**
 * 2019-03-09
 * @author SENG Sourng
 * Demonstration  conversion between integer to byte ,
 * double to byte and double to integer 
 */
public class DemoConversion {
    public static void main(String[] args) {
        byte b;
        int i=234;
        double d=123.456;
        b=(byte) i;
        System.out.println(" Conversion of integer to byte");
        System.out.println(" Value i="+i + " Value b="+ b);        
        b=(byte) d;
        System.out.println("Conversion from double to byte");
        System.out.println("Value D="+d +" Value B="+ b);        
        i=(int) d;
        System.out.println("Conversion of Double to Integer");
        System.out.println("Value of D="+ d + " value I="+i); 
      
    }    
}



