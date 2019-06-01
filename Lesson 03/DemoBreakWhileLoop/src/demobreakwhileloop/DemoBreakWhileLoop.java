package demobreakwhileloop;
/**
 * Using break with while loop
 * @author Sourng Edu
 */
public class DemoBreakWhileLoop {
    public static void main(String[] args) {
        int n=100,i=0;
        while(i<n){
            if(i==9) break; // exit form WHILE loop, if i equal 9
            System.out.println(i+" ");
            i++;
        }
        System.out.println();
        System.out.println("This statement is out of WHILE LOOP!");
    }    
}


