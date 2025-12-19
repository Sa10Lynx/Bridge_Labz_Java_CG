package Core_Programming.Methods.L02;
import java.util.Scanner;
public class RandomStatistics {
    public static int[] generate4DigitRandomArray(int size){
        int[] a=new int[size];

        for(int i=0;i<size;i++)
            a[i]=1000+(int)(Math.random()*9000);
        return a;
    }

    public static double[] findAverageMinMax(int[] a){
        int min=a[0],max=a[0],sum=0;
        for(int x:a){
            sum+=x;
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        return new double[]{sum/(double)a.length,min,max};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();

        int[] randomValues=generate4DigitRandomArray(size);
        double[] avgMinMax=findAverageMinMax(randomValues);

        for(int i=0;i<size;i++)
            System.out.println(randomValues[i]);

        System.out.println("The avergae of the random numbers is: "+avgMinMax[0]+
                ". The minimum number is: "+avgMinMax[1]+" and the max is: "+avgMinMax[2]);
    }
}
