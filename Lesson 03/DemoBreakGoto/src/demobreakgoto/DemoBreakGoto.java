package demobreakgoto;
/**
 * Using Break Label goto
 * @author Sourng Edu
 */
public class DemoBreakGoto {
    public static void main(String[] args) {
        First:{
            System.out.println(" Start First!");
            Second:{
                System.out.println(" Start Secend!");
                Third:{
                    System.out.println("Start Third!");                    
                    break Second;   
                   //System.out.println("End Third!");
                }
                //System.out.println("End Second!");
            }            
            System.out.println("End First!");
        }        
    }    
}
