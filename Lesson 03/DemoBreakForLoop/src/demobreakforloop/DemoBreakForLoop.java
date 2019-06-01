/**
 * @author Sourng Edu
 */
package demobreakforloop;
public class DemoBreakForLoop {
    public static void main(String[] args) {
       int n=100;
       for(int i=0;i<n;i++){
           if(i==9)break; //exit from the FOR loop, if i equal 9
           System.out.println(i+" ");
           i++;
       }
       System.out.println();
       System.out.println(" This statement is out of FOR LOOP!");
    }    
}