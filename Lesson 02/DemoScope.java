package demoscope;
/**
 * on 2019-03-09
 * @author SENG Sourng
 */
public class DemoScope {
    public static void main(String[] args) {
        int x; x=9; // Global variabl
        if(x==9){
            int y=10; // local variable
            System.out.println("X and y "+ x +' '+ y);
            System.out.println("X="+ x +" and Y="+ y);
            x=y*3;            
        }        
       // y=30;   // Error Because y here unknown out of Scope
        System.out.println("Valueof X="+ x);
    }    
}



