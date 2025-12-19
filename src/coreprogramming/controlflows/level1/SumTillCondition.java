package coreprogramming.controlflows.level1;


import java.util.Scanner;
public class SumTillCondition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double sum=0;
        while(true){
            double v=sc.nextDouble();
            if(v<=0) break;
            sum+=v;
        }
        System.out.println(sum);
    }
}
