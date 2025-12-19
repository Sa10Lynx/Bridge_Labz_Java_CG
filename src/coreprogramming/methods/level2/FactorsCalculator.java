package coreprogramming.methods.level2;

import java.util.Scanner;
public class FactorsCalculator{
    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++)
            if(n%i==0) count++;

        int[] factors=new int[count];
        int idx=0;
        for(int i=1;i<=n;i++)
            if(n%i==0) factors[idx++]=i;

        return factors;
    }
    public static int sum(int[] a){
        int s=0;
        for(int x:a) s+=x;
        return s;
    }
    public static long product(int[] a){
        long p=1;
        for(int x:a) p*=x;
        return p;
    }
    public static double sumOfSquares(int[] a){
        double s=0;
        for(int x:a) s+=Math.pow(x,2);
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] f=findFactors(n);
        for(int x:f) System.out.println(x);

        System.out.println("Sum = "+sum(f));
        System.out.println("Product = "+product(f));
        System.out.println("Sum of Squares = "+sumOfSquares(f));
    }
}


