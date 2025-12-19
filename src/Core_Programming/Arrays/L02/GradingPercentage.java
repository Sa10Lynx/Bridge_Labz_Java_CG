package Core_Programming.Arrays.L02;
import java.util.Scanner;
public class GradingPercentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] marks=new int[n][3];
        double[] perc=new double[n];
        String[] grade=new String[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                marks[i][j]=sc.nextInt();
                if(marks[i][j]<0){
                    i--;
                    break;
                }
            }
            perc[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;

            if(perc[i]>=80) grade[i]="A";
            else if(perc[i]>=60) grade[i]="B";
            else if(perc[i]>=40) grade[i]="C";
            else grade[i]="R";
        }

        for(int i=0;i<n;i++)
            System.out.println(perc[i]+" "+grade[i]);
    }
}
