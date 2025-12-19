package Core_Programming.Programming_Elements.L02;

import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a= sc.nextInt();
        double b= sc.nextInt();
        double c= sc.nextInt();

        double op1=a+b*c;
        double op2=c+a/b;
        double op3=a%b+c;

        System.out.println("Result of operation a+b*c: "+op1+
                " Result of operation c+a/b: "+op2+
                " Result of operation a%b+c: "+op3+
                " For the integers a,b,c: "+a+","+b+","+c);
    }
}
