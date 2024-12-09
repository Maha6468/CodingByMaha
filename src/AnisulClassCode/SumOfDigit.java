package AnisulClassCode;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int sum=0,r,temp;
        System.out.print("Enter any number : ");
        int num=input.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;         //aikhanei r er man je revers astece seta print korte but.
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("Sum of digit: "+sum);
    }
}
