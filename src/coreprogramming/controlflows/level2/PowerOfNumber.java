package coreprogramming.controlflows.level2;

import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        int res=1;
        for(int i=1;i<=pow;i++)
            res=res*num;
        System.out.println(res);
    }
}
