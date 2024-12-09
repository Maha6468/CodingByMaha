package AnisulClassCode;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("How many numbers: ");
        int n=input.nextInt();
        int first=0;
        int second=1;
        int fibo;
        System.out.println(first+" "+second);
        for(int i=3;i<=n;i++){         //i er man change kore dekho
            fibo=first+second;
            System.out.println(" "+fibo);
            first=second;
            second=fibo;
        }
    }
}
