package coreprogramming.controlflows.level1;

import java.util.Scanner;
public class SumOfNNumbersComparision {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            int s1=n*(n+1)/2;
            int s2=0,i=1;
            while(i<=n){s2+=i;i++;}
            System.out.println(s1+" "+s2);
        }
    }
}
