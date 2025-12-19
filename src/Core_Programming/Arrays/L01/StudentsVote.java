package Core_Programming.Arrays.L01;

import java.util.Scanner;

public class StudentsVote {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
                arr[i]=sc.nextInt();

        for(int i=0;i<10;i++){
            if(arr[i]<0)
                System.out.println("Invalid age");
            else if(arr[i]<18)
                System.out.println("Student with age "+arr[i]+" cannot vote");
            else
                System.out.println("Student with age "+arr[i]+" can vote");
        }
    }
}
