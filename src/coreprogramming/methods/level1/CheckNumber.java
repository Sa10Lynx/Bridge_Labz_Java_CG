package coreprogramming.methods.level1;
import java.util.Scanner;
public class CheckNumber {
    public static void checkNumber(int a){
        if(a>0)
            System.out.println("Its a positive number");
        else if(a<0)
            System.out.println("Its a negative number");
        else
            System.out.println("Its zero");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        checkNumber(a);
    }
}
