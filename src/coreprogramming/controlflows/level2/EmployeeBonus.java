package coreprogramming.controlflows.level2;


import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int years=sc.nextInt();
        if(years>5)
            System.out.println("Bonus = "+(salary*0.05));
        else
            System.out.println("Bonus = 0");
    }
}
