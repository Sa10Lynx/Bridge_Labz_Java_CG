package coreprogramming.controlflows.level1;


import java.util.Scanner;
public class SumNFor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            int f=n*(n+1)/2,s=0;
            for(int i=1;i<=n;i++) s+=i;
            System.out.println(f+" "+s);
        }
    }
}
