package demoifelseif;
import java.util.Scanner;
/**
 * @author SENG Sourng
 */
public class DemoIfElseIf {
    public static void main(String[] args) {
        boolean b; // to check the year mod 4 equal 0              
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        // nextInt() reads the next integer from the keyboard
        int year = reader.nextInt();
        System.out.print("Enter Month:");
        int month=reader.nextInt();      
        if(year%4==0){
            b=true;
        }else{
            b=false;
        }        
        if(month==1){
            System.out.println(" This "+ year +" January has 31 days");            
        }else if(month==2){
            if(b==true)
                System.out.println(" This "+ year +" February has 29 days");
            else
                 System.out.println(" This "+ year +" February has 28 days");   
        }else if(month==3){
            System.out.println(" This "+ year +" March has 31 days");
        }else if(month==4){
            System.out.println(" This "+ year +" April has 30 days");
        }else if(month==5){
            System.out.println(" This "+ year +" May has 31 days");
        }else if(month==6){
            System.out.println(" This "+ year +" June has 30 days");
        }else if(month==7){
            System.out.println(" This "+ year +" July has 31 days");
        }else if(month==8){
            System.out.println(" This "+ year +" August has 31 days");
        }else if(month==9){
            System.out.println(" This "+ year +" September has 30 days");
        }else if(month==10){
            System.out.println(" This "+ year +" October has 31 days");
        }else if(month==11){
            System.out.println(" This "+ year +" November has 30 days");
        }else if(month==12){
            System.out.println(" This "+ year +" December has 31 days");
        }else{
            System.out.println("Input invalid month");
        }
    }    
}
