package Core_Programming.Programming_Elements.L02;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int op1=a+b*c;
        int op2=c+a/b;
        int op3=a%b+c;

        System.out.println("Result of operation a+b*c: "+op1+
                " Result of operation c+a/b: "+op2+
                " Result of operation a%b+c: "+op3+
                " For the integers a,b,c: "+a+","+b+","+c);
    }
}
