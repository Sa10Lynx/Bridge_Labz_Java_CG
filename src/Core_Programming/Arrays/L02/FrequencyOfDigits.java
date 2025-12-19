package Core_Programming.Arrays.L02;
import java.util.Scanner;
public class FrequencyOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int[] freq=new int[10];

        while(num!=0){
            int d=num%10;
            freq[d]++;
            num=num/10;
        }

        for(int i=0;i<10;i++)
            System.out.println(i+" -> "+freq[i]);
    }
}
