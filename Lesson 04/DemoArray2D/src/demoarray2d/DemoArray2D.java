package demoarray2d;
/**
 * Sample of Array 2D
 * @author Sourng Edu
 */
public class DemoArray2D {
    public static void main(String[] args) {
       int myTwoArray[ ][ ] =new int [4][5]; 
       int i , j , k =1; 
       for (i=0 ; i<4 ; i++) 
           for (j=0 ; j<5 ; j++){ 
               myTwoArray[i][j] = (i + j) *k; k++; 
           } 
       for (i=0 ; i<4 ; i++) 
           for (j=0 ; j<5 ; j++) 
           System.out.println ("myTwoArray[" +i+ "]["+j+ "] "+ 
                   myTwoArray[i][j]); 
    }    
}



