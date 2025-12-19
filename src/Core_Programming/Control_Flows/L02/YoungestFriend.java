package Core_Programming.Control_Flows.L02;

import java.util.Scanner;
public class YoungestFriend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int amarAge=sc.nextInt();
        int akbarAge=sc.nextInt();
        int anthonyAge=sc.nextInt();

        int amarHeight=sc.nextInt();
        int akbarHeight=sc.nextInt();
        int anthonyHeight=sc.nextInt();

        int minAge=Math.min(amarAge,Math.min(akbarAge,anthonyAge));
        int maxHeight=Math.max(amarHeight,Math.max(akbarHeight,anthonyHeight));

        System.out.println("Youngest age is "+minAge);
        System.out.println("Tallest height is "+maxHeight);
    }
}
