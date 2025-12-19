package coreprogramming.controlflows.level1;


import java.util.Scanner;
public class CountdownFor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        while(c>=1){
            System.out.println(c);
            c--;
        }
    }
}
