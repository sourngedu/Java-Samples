package demostatic;
/**
 * @author Sourng Edu
 */
class VarMethodStatic{
    static int x;
    static int y;
    int a,b;
    static int add(){
        return(x+y);
    }
    
  int add2(){
       return(a+b);
   }
}
public class DemoStatic {
    public static void main(String[] args) {       
       VarMethodStatic objVM=new VarMethodStatic();       
       VarMethodStatic.x=10;
       VarMethodStatic.y=12;      
      
       objVM.a=20;
       objVM.b=30;       
       
       System.out.println(VarMethodStatic.x+" + "+ 
               VarMethodStatic.y +" = "+
               VarMethodStatic.add()
       );       
       
       System.out.println(objVM.a+" + "+ 
               objVM.b +" = "+
               objVM.add2()
       );
    }    
}
