package coreprogramming.controlflows.level1;


import java.util.Scanner;
public class SumTill0 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double total=0,val=sc.nextDouble();
        while(val!=0){
            total+=val;
            val=sc.nextDouble();
        }
        System.out.println(total);
    }
}
