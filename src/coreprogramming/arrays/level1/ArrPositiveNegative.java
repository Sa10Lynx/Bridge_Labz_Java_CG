package coreprogramming.arrays.level1;
import java.util.Scanner;
public class ArrPositiveNegative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
                System.out.println("Negative Number");
            else if(arr[i]==0)
                System.out.println("Zero");
            else
                if(arr[i]%2==0)
                    System.out.println("Positive and Even");
                else
                    System.out.println("Positive and Odd");
        }

        if(arr[0]==arr[4])
            System.out.println("Both start and ending numbers are equal");
        else if(arr[0]>arr[4])
            System.out.println("Starting element is bigger");
        else
            System.out.println("Ending element is bigger");
    }
}
