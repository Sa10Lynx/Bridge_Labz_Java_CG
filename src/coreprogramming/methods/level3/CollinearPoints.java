package coreprogramming.methods.level3;

import java.util.Scanner;

public class CollinearPoints{

    public static boolean slopeMethod(double x1,double y1,double x2,double y2,double x3,double y3){
        double s1=(y2-y1)/(x2-x1);
        double s2=(y3-y2)/(x3-x2);
        double s3=(y3-y1)/(x3-x1);
        return s1==s2 && s2==s3;
    }

    public static boolean areaMethod(double x1,double y1,double x2,double y2,double x3,double y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();

        System.out.println("Collinear (Slope) = "+slopeMethod(x1,y1,x2,y2,x3,y3));
        System.out.println("Collinear (Area) = "+areaMethod(x1,y1,x2,y2,x3,y3));
    }
}
