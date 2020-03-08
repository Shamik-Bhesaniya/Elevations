/* I, Shamik Bhesaniya, 000770928 certify that this material is my own work and no other
 * person's work is used without due acknowledgement. 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.Math.sqrt;
import java.nio.file.Paths;

/**
 *
 * @author Shamik Bhesaniya
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //This function reads the ELEVATIONS file and store values in 2D array
        final String FILENAME = "ELEVATIONS.txt"; 
        // There are 1000 rows which is given in the file
        final int rowSize = 1000;
        // There are 450 columns which is given in the file
        final int colSize=450;
        // Total row and column size
        int[][] numbers= new int [rowSize][colSize];
        int row = 0;
        int col=0;
        // Assuming the value 50000 
        int value=50000;
        int min=0;
       
        try{
            File data = new File(FILENAME);
            row=0;
            try(Scanner inputFile = new Scanner(data)){
                while (inputFile.hasNext()&& row< numbers.length){
                    for (col=0; col<colSize; col++){
                        numbers[row][col]=inputFile.nextInt();
                    }
                    row++;
                }
            }
        }catch(Exception ex){
            System.out.println("Error");
        }
        
        // by doing steps below we will determine the lowest elevation value in data set
        for(row=0; row<rowSize;row++){
            for(col=0; col<colSize;col++){
                if(numbers[row][col]<value){ // for finding lowest value in set
                    value=numbers[row][col]; // comparing and finding the lowest value
                }
            }
        }
        
        System.out.println("The lowest elevation value in the data set is " + value);
        
        // By doing steps below we determine the occurence of lowest value in data set
        for(row=0; row<rowSize;row++){
            for(col=0; col<colSize;col++){
                if(numbers[row][col]==value){
                    min++; // calculate how many time lowest elevation occurs in set
                }
            }
        }
        System.out.println("Number of times lowest elevation occurs is " + min);
        
    // Below steps are used to determine the local peaks that occur when n=10
    int peaks=0;
    
    // Assuming that around 400 peaks occur in this array and array needs space to be stored
    int[] temp= new int[400];
    int r=0,c=0,t=0,r1=0,r2=0,c1=0,c2=0;
    boolean x=false;
    float d=0,tempD=0,dd=0, finalD=0;
    
    // Setting the size of rows and columns to exclude the first 10 rows and columns
    for(row=0; row<10;row++){
            for(col=0; col<10;col++){
                temp[t]=numbers[row][col];
                t++;
                }

        }
    // Setting the size of rows and columns to exclude the last 10 rows and columns
    for(row=rowSize-10; row<rowSize;row++){
            for(col=colSize-10; col<colSize;col++){
               temp[t]=numbers[row][col];
                t++;  
            }
        }
   
        for(row=10; row<rowSize-10;row++){
            r++;
            c=0;
            for(col=10; col<colSize-10;col++){
                c++;
                
                // Peak value is greater than 94850
                if(numbers[row][col]>94850){
                    for(int i=0; i<t;i++){
                        if(numbers[row][col] != temp[i]){
                           x=true;
                        }else{
                            x=false;
                        }
                    }
                    if(x==true){
                        peaks++;
                        
                        r1=row;
                        r2=row-r;
                        c1=col;
                        c2=col-c;
                        // Formula given for distance
                        tempD= (((r1-r2)*(r1-r2))+((c1-c2)*(c1-c2)));
                        d=(float) Math.sqrt(tempD);
                        
                        if(d<dd){
                            finalD=d;
                        }else{
                            finalD=dd;
                        }dd=d;
                    }
                }
            }
        }
        System.out.println("Local peaks that occur is " + peaks);
        System.out.printf("Distance is %.2f",finalD);
        System.out.println("\n");
        
     // Below function is used to get the most common elevation in data set
     // and occurence of it in the data set
      int CountElevation = 0;
        int CountElevationOcc = 0;
        
         for (row=0; row<rowSize;row++) {
         for (col = 0; col < colSize; col++) {
             if (CountElevation < numbers[row][col]) {
                CountElevationOcc = row+col;
                CountElevation = numbers[row][col];

             }}
        }
        System.out.println("The most common elevation in data set is " + CountElevation);
        System.out.println("Occurence of the most common elevation is " + CountElevationOcc);
        
        
    }
    
}
