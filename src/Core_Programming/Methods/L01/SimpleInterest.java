package Core_Programming.Methods.L01;
import java.util.Scanner;
public class SimpleInterest {
    public static double calSimple(double principle, double rate, double time){
        return principle*rate*time;
    }

    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        double principle= sc.nextDouble();
        double rate= sc.nextDouble();
        double time= sc.nextDouble();

        System.out.println("For principle:"+principle+", rate:"+rate+" and time:"+time+
                ". The simple interest is:"+calSimple(principle,rate,time));
    }

}
