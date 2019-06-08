
package demothisclass;
class Person{
    int id,age;
    String name;
    float score;
    
    void DisplayPerson(int id,String name,float score){
        System.out.println(id +" - "+ name + " - "+ score);
        System.out.println(this.id+" - "+ name +" - "+ this.score);
    }
}
public class DemoThisClass {
    public static void main(String[] args) {
    Person objP=new Person();
   objP.id=5;
   objP.name="Long Dara";
   objP.score=(float) 79.5;
   objP.DisplayPerson(10,"Meas Thida", (float) 69.5);
    }    
}
