package AnisulAllArray;

import java.util.Scanner;

public class ArrayDiagonalUpperLowerMatrix78 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter elemants of matrix: ");
        int[][] A= new int[3][3];
        int sumofDiagonalElements=0;
        int sumofUpperElements=0;
        int sumofLowerElements =0;
        //Matrix input
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                A[row][col]=input.nextInt();
            }
        }
       //diagonal,upper,lower
        System.out.println("Matrix A= ");
        for(int row=0;row<3;row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+A[row][col]);
                if (row == col) {
                    sumofDiagonalElements = sumofDiagonalElements + A[row][col];
                }
                if(row<col){
                    sumofUpperElements=sumofUpperElements+A[row][col];
                }
                if(row>col){
                    sumofLowerElements=sumofLowerElements+A[row][col];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of diagonal: "+ sumofDiagonalElements);
        System.out.println("Sum of Upper : "+sumofUpperElements );
        System.out.println("Sum of Lower : "+sumofLowerElements );
    }
}

