package democlass;
import java.util.Scanner;
/**
* Demo Create class: DemoClass
* @author Sourng Edu
*/
class Vehicle {        
    int passengers ; // number of passengers 
    int fuelcap ;   // fuel capacity in gallons 
    int mpg ;  //fuel consumption in mile per gallon     
}

class Student{
    //defining Data Member
    int id,age;
    String name,sex; 
    float score;
    // defining Methods
    void readStudent(){        
        Scanner reader = new Scanner(System.in);
        System.out.print("ID: ");
        id = reader.nextInt();
        System.out.print("Name: ");
        name=reader.next();
        
        System.out.print("Sex: ");
        sex=reader.next();
        System.out.print("Age: ");
        age=reader.nextInt();
        System.out.print("Score: ");
        score=reader.nextFloat();    
    }
    void DisplayStuent(int id,String name,String sex,int age, float score){
        System.out.println("ID:"+id+" Name:"+name+" Sex:"+ sex +" Age:"+
                age +" Score;"+ score +" Grade:" + this.FindGrad(score));
    }
    
    char FindGrad(float Score){
        char G;
        if(Score>90){
            G='A';
        }else if(Score>80){
            G='B';
        }else{
            G='F';
        }
        return G;
    } 
    
}


public class DemoClass {
    public static void main(String[] args) {
        Vehicle minibus=new Vehicle();
        Vehicle minicar= new Vehicle();
        
        Student stu=new Student();
        
        stu.readStudent();
        stu.DisplayStuent(stu.id, stu.name, stu.sex, stu.age, stu.score);
        
        
        int range1,range2;
        minibus.passengers=12;
        minibus.fuelcap=60;
        minibus.mpg=10;
        
        minicar.passengers=5;
        minicar.fuelcap=45;
        minicar.mpg=13;
        
        range1=minibus.fuelcap*minibus.mpg;
        range2=minicar.fuelcap*minicar.mpg;
        
        System.out.println("Minibus can carry "+ minibus.passengers +" with the range of "+ range1);
        System.out.println("Minicar can carry "+ minicar.passengers +" with the range of "+ range2);
 
    }
    
}
