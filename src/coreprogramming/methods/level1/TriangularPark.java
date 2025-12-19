package coreprogramming.methods.level1;
import java.util.Scanner;
public class TriangularPark {
    public static double roundsOfPark(double a,double b,double c){
        double perimeter=a+b+c;
        return 5/perimeter;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();

        System.out.println("To cover 5km he needs to take "+roundsOfPark(a,b,c)+" rounds of the park");
    }
}
