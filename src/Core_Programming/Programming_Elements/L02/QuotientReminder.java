package Core_Programming.Programming_Elements.L02;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a,b;
        System.out.println("Enter number a: ");
        a=sc.nextInt();
        System.out.println("Enter number b: ");
        b=sc.nextInt();

        int quotient=a/b;
        int reminder=a%b;
        System.out.println("The Quotient is "+quotient+" and the reminder is "+reminder+" of the two numbers a:"+a+
                " and b:"+b);
    }
}
