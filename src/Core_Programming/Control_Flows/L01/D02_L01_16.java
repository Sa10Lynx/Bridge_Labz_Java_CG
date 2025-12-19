package Core_Programming.Control_Flows.L01;


import java.util.Scanner;
public class D02_L01_16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.println(i+" is "+(i%2==0?"Even":"Odd"));
    }

}
