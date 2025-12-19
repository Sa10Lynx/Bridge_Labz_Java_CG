package Core_Programming.Methods.L02;

import java.util.Scanner;
public class FriendsAgeHeightAnalyzer{
    public static int youngest(int[] a){
        int m=a[0];
        for(int x:a) if(x<m) m=x;
        return m;
    }
    public static int tallest(int[] h){
        int m=h[0];
        for(int x:h) if(x>m) m=x;
        return m;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[3];
        int[] height=new int[3];

        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextInt();
        }

        System.out.println("Youngest = "+youngest(age));
        System.out.println("Tallest = "+tallest(height));
    }
}

