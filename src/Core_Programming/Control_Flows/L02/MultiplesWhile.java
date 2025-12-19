package Core_Programming.Control_Flows.L02;

import java.util.Scanner;
public class MultiplesWhile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=100;
        while(c>=1){
            if(c%n==0)
                System.out.println(c);
            c--;
        }
    }
}
