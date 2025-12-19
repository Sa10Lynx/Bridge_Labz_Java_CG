package Core_Programming.Methods.L01;
import java.util.Scanner;
public class Handshakes {
    public static int numberOfHandshakes(int num){
        return ((num)*(num-1))/2;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println("The number of handshakes possible with "+n+" students are: "+numberOfHandshakes(n));
    }

}
