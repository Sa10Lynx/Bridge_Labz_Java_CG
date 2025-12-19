package coreprogramming.controlflows.level2;

import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        int res=1;
        int c=0;
        while(c<pow){
            res=res*num;
            c++;
        }
        System.out.println(res);
    }
}
