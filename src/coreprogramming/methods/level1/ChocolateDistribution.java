package coreprogramming.methods.level1;
import java.util.Scanner;
public class ChocolateDistribution{
    public static int[] distribute(int c,int ch){
        return new int[]{c/ch,c%ch};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int ch=sc.nextInt();

        int[] res=distribute(c,ch);
        System.out.println("Each child gets "+res[0]);
        System.out.println("Remaining chocolates "+res[1]);
    }
}

