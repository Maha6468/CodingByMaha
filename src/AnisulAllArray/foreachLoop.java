package AnisulAllArray;

public class foreachLoop {
    public static void main(String[] args) {
   /* String[] names=new String[4]; //String[] names={"Maha","Saim","Mari","Rictha" };
    names[0]="Maha";
        names[1]="Saim";
        names[2]="Mari";
        names[3]="Rictha";
        for(int i=0;i<4;i++){
            System.out.println(names[i]);
        }
        System.out.println(names.length);*/

        //for each loop
        /*String[] names={"Maha","Saim","Mari","Rictha"};
        for(String x:names){
            System.out.println(x);
        }*/

        int[]num={10,20,30,50,70,60,50,90};
        int sum=0;
        for(int x:num){
            System.out.println(x);
            sum=sum+x;
        }
        System.out.println("Addition  : " +sum);

    }
}
