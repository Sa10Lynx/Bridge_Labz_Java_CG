package Core_Programming.Programming_Elements.L01;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FeeDisc {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
        int fee= sc.nextInt();
        int discountPercentage= sc.nextInt();
        double discountAmount=(double)fee/discountPercentage;
        double discountedFee=fee-discountAmount;

        System.out.println("The discount amount is INR "+discountAmount+
                " and the final discounted fee is INR "+discountedFee);
    }
}
