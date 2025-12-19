package coreprogramming.controlflows.level3;

import java.util.Scanner;
public class GradingScores {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int phy=sc.nextInt();
        int chem=sc.nextInt();
        int math=sc.nextInt();

        double avg=(phy+chem+math)/3.0;

        System.out.println("Average Marks = "+avg);

        if(avg>=80)
            System.out.println("Grade A : Level 4");
        else if(avg>=70)
            System.out.println("Grade B : Level 3");
        else if(avg>=60)
            System.out.println("Grade C : Level 2");
        else if(avg>=50)
            System.out.println("Grade D : Level 1");
        else if(avg>=40)
            System.out.println("Grade E : Level 1-");
        else
            System.out.println("Grade R : Remedial");
    }
}
