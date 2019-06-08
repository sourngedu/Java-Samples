package demostaticvariable;
/**
 * @author Sourng Edu
 */
class VariableStatic{
    int x;
    static int y;
//    int y;    
}

public class DemoStaticVariable {

    public static void main(String[] args) {
       VariableStatic obj1=new VariableStatic();
       VariableStatic obj2=new VariableStatic();
       
       obj1.x=10;
       obj1.y=12;
       obj2.x=20;
       obj2.y=22;
       
       System.out.println("X in obj1 and obj2 are different!");
       System.out.println("obj1.x="+obj1.x +" obj2.x="+obj2.x);
       
       System.out.println("Y in obj1 and obj2 are the same, because shared ");
       System.out.println("obj1.y="+obj1.y +" obj2.y="+obj2.y);
        
        
    }
    
}
