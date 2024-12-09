package AnisulAllArray;
import java.util.Scanner;
public class arrayMaximumMinimum {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double[] number= new double[5];
        double sum=0;
        System.out.print("Please enter 5 number : ");
        for(int i=0;i<5;i++){
            number[i]=input.nextDouble();
        }
        for(int i=0;i<5;i++){
            sum=sum+number[i];
        }
        System.out.println("Sum : "+sum);
        System.out.println("The average is : "+sum/5);
        double max = number[0];
        double min = number[0];
        for(int i=1;i<5;i++){
            if(max<number[i]){
                max=number[i];
            }
            if(min>number[i]){
                min=number[i];
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);


    }
}



