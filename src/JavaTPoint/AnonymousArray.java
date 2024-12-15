package JavaTPoint;

public class AnonymousArray {

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }




    public static void main(String[] args) {
        int a[]={10,22,44,66};
        printArray(a);  //printArray(new int[]{10,22,44,66}); atao use kora jay;

    }
}
