package coreprogramming.controlflows.level1;


import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),f=1;
        while(n>0){f*=n;n--;}
        System.out.println(f);
    }
}
