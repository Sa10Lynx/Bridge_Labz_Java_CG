package coreprogramming.methods.level3;

import java.util.Scanner;

public class StudentScoreCard{

    public static int[][] generateScores(int n){
        int[][] pcm=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                pcm[i][j]=(int)(Math.random()*51)+50;
        return pcm;
    }

    public static double[][] calculate(int[][] pcm){
        double[][] res=new double[pcm.length][3];
        for(int i=0;i<pcm.length;i++){
            int total=pcm[i][0]+pcm[i][1]+pcm[i][2];
            double avg=total/3.0;
            double percent=(total/300.0)*100;
            res[i][0]=total;
            res[i][1]=Math.round(avg*100)/100.0;
            res[i][2]=Math.round(percent*100)/100.0;
        }
        return res;
    }

    public static void display(int[][] pcm,double[][] r){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%");
        for(int i=0;i<pcm.length;i++)
            System.out.println(pcm[i][0]+"\t"+pcm[i][1]+"\t"+pcm[i][2]+"\t"+r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] pcm=generateScores(n);
        double[][] r=calculate(pcm);
        display(pcm,r);
    }
}
