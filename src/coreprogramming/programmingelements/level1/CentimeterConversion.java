package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class CentimeterConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int heightInCenti=sc.nextInt();
        double heightInInches=(double)heightInCenti/2.54;
        double heightInFeet=heightInInches/12.0;

        System.out.println("Your height in cm is "+heightInCenti+" while your height in feet is "+heightInFeet
        +" and you height in inches is "+heightInInches);
    }
}
