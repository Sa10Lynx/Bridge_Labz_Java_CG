package Core_Programming.Methods.L02;
import java.util.Scanner;
public class TeamBMICalculator{
    public static void calculateBMI(double[][] data){
        for(int i=0;i<10;i++){
            double h=data[i][1]/100;
            data[i][2]=data[i][0]/(h*h);
        }
    }
    public static String[] bmiStatus(double[][] data){
        String[] s=new String[10];
        for(int i=0;i<10;i++){
            double b=data[i][2];
            if(b<=18.4) s[i]="Underweight";
            else if(b<=24.9) s[i]="Normal";
            else if(b<=39.9) s[i]="Overweight";
            else s[i]="Obese";
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] p=new double[10][3];

        for(int i=0;i<10;i++){
            p[i][0]=sc.nextDouble();
            p[i][1]=sc.nextDouble();
        }

        calculateBMI(p);
        String[] s=bmiStatus(p);

        for(int i=0;i<10;i++)
            System.out.println(p[i][0]+" "+p[i][1]+" "+p[i][2]+" "+s[i]);
    }
}

