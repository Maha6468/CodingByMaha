package AnisulClassCode;
import java.util.Scanner;
public class AllPattern {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter line number : ");
        int n = input.nextInt();
        for(int row=1; row<=n;row++){
            for(int col=1; col<=row;col++){
                System.out.print("    "+col);
            }
            System.out.println(" ");
        }

        //another pattern

        for(int row=n; row>=1;row--){
            for(int col=1; col<=row;col++){
                System.out.print("    "+col);
            }
            System.out.println(" ");
        }
    }
}
