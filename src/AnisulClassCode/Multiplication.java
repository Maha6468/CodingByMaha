package AnisulClassCode;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*int num;
        System.out.println("Enter any number : ");
        num=input.nextInt();
        for( int i=1; i<=10; i++){
            System.out.println(num+" * "+i+"="+num*i);
        }*/

        int m, n;
        System.out.println("Enter Initial number : ");
        m = input.nextInt();
        System.out.println("Enter final number : ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.println("namota of " +i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + "=" + i * j);
            }
        }

    }
}
