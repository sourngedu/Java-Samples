package demoarrayd2;
/**
 * Using Array 2D
 * @author Sourng Edu
 */
public class DemoArrayD2 {
    public static void main(String[] args) {
        int myTwoArray[ ][ ] =new int [4][ ]; 
        myTwoArray[0] =new int [1]; 
        myTwoArray[1] =new int [2]; 
        myTwoArray[2] =new int [3]; 
        myTwoArray[3] =new int [4]; 
        int i , j , k =0; 
        for (i=0 ; i<4 ; i++) 
            for (j=0 ; j<i+1 ; j++){ 
                myTwoArray[i][j] = k ; k++; 
            } for (i=0 ; i<4 ; i++){ 
                for (j=0 ; j<i+1 ; j++) 
                    System.out.print( myTwoArray[i][j] + " ");         
        System.out.println();   
            }
    }    
}
