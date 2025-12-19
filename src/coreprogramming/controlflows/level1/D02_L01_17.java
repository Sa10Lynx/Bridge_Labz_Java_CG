package coreprogramming.controlflows.level1;

import java.util.Scanner;
public class D02_L01_17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt(),yrs=sc.nextInt();
        if(yrs>5)
            System.out.println("Bonus = "+(sal*0.05));
        else
            System.out.println("No Bonus");
    }
}
