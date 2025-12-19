package coreprogramming.methods.level2;
import java.util.Scanner;
public class UnitConverterTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double km=sc.nextDouble();

        double miles=UnitConverterLength.convertKmToMiles(km);
        System.out.println(miles);
    }
}

