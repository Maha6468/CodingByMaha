package AnisulClassCode;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any positive number");
        int num=input.nextInt();
        int count=0;
        if( num ==0 || num==1){
            System.out.println("Not prime");
        }else {

            for (int i = 2; i < num; i++) {  //kono akta number k  sorbocco tar ordhek songkha diya vag kora jave tai (num/2) atao use kora jabe
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }
        if(count==0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
