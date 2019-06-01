package calcuationdemo;

/**
 * @author Sourng Edu
 */
class Calcuator{
    int a,b;
   // float total;
    
    int Addition1(){
        int total;
        total=this.a+this.b;
        return(total);
    }
    
    int Addition(int a,int b){
        int total;
//        total=a+b;
        total=this.a+this.b;
        return(total);
    }
    int Substruction(int a,int b){
        return(a-b);
    }
    int Multiple(int a,int b){
        return(a*b);
    }
    int Division(int a,int b){
        return(a/b);
    }    
    void RectangleArea(int w,int l){
        int A;
        A=w*l;
        System.out.println("Rectangle Area is: "+A );
    }    
}

public class CalcuationDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calcuator objCal=new Calcuator();
        
        objCal.a=20;
        objCal.b=30;
        
        System.out.println("Addition Call:"+ 
                objCal.Addition(12,20));
        
        System.out.println("Substruction Call:"+ 
                objCal.Substruction(12,20));
        
        System.out.println("Multiple Call:"+ 
                objCal.Multiple(12,20));
        
        System.out.println("Division Call:"+ 
                objCal.Division(12,20));
        
        objCal.RectangleArea(10, 20);        
        
        System.out.println("Addition1 Call:"+ 
                objCal.Addition1());
                
    }    
}
