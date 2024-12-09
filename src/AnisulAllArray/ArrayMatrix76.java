package AnisulAllArray;

import java.util.Scanner;

public class ArrayMatrix76 {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int[][]A=new int[2][3];
    int[][]B=new int[2][3];
    //getting input for A matrix
        System.out.print("Enter elements of A matrix:  ");
    for(int row=0;row<2;row++){
        for(int col=0;col<3;col++){
            System.out.printf("A[%d][%d]= ",row,col);  // B matrix er jon make kore nite hbe
          A[row][col]=input.nextInt();

        }
    }
    //printing A matrix
        System.out.print("A= ");
    for(int row=0;row<2;row++){
        for(int col=0;col<3;col++){
            System.out.print("\t"+A[row][col]);
        }
        System.out.println( );
    }

        //getting input for B matrix
        System.out.println("Enter elements of B matrix:  ");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                B[row][col]=input.nextInt();

            }
        }
        //printing B matrix
        System.out.print("B= ");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("\t"+B[row][col]);
            }
            System.out.println( );
        }
        //adding A and B matrix
        System.out.println("A+B= ");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("\t"+A[row][col]+B[row][col]);
            }
            System.out.println();





    }
}
}
