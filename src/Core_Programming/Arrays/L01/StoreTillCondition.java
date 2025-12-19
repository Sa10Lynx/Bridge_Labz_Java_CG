package Core_Programming.Arrays.L01;
import java.util.Scanner;
public class StoreTillCondition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[10];
        double total=0.0;
        int index=0;

        while(true){
            double val=sc.nextDouble();
            if(val<=0 || index==10)
                break;
            arr[index]=val;
            index++;
        }

        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
            total+=arr[i];
        }

        System.out.println("Sum = "+total);
    }
}
