package coreprogramming.methods.level1;
import java.util.Scanner;
public class WindChillCalculator{
    public static double calculateWindChill(double t,double w){
        return 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(w,0.16);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble();
        double w=sc.nextDouble();
        System.out.println(calculateWindChill(t,w));
    }
}

