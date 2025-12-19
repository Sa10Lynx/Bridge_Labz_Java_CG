package coreprogramming.programmingelements.level1;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class KiloToMiles {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));

        int kilometers = sc.nextInt();
        double miles=kilometers/1.6;

        pw.printf("The total miles is %.2f miles for given %d km%n", miles, kilometers);
        pw.flush();
    }
}
