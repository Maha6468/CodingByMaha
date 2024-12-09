package AnisulAllArray;

public class arrayclass70 {
    public static void main(String[] args) {
      int[] number=new int[5];                 //[5] akhane 5 er man besi dile problem nai but com dile ace
      number[0]=10;
      number[1]=15;
      number[2]=13;
      number[3]=19;
      number[4]=17;
      System.out.println(number[3]);
      int len=number.length;
      System.out.println("array size=" +len);     //array of size.
        int sum=number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Sum = "+sum);

    }
}
