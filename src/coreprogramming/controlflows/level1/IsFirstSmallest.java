package coreprogramming.controlflows.level1;

import java.util.Scanner;
public class IsFirstSmallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Is the first number the smallest? "+(a<b && a<c));
    }
}
