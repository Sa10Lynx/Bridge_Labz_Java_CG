package coreprogramming.methods.level1;
import java.util.Scanner;
public class QuotientAndReminder {
    public static void qoutientAndReminder(int a, int b){
        System.out.println("The Quotient is: "+a/b+" and the Reminder is: "+a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        qoutientAndReminder(a,b);
    }
}
