package coreprogramming.methods.level3;

import java.util.Scanner;

public class NumberCheckerDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();


        int[] digits=NumberCheckerDigits.getDigits(number);

        System.out.println("Digit Count = "+NumberCheckerDigits.countDigits(number));

        System.out.print("Digits: ");
        for(int d:digits)
            System.out.print(d+" ");
        System.out.println();


        System.out.println("Duck Number = "+NumberCheckerDigits.isDuck(digits));
        System.out.println("Armstrong Number = "+
                NumberCheckerDigits.isArmstrong(number,digits));


        int[] largest=NumberCheckerDigits.largestTwo(digits);
        int[] smallest=NumberCheckerDigits.smallestTwo(digits);

        System.out.println("Largest = "+largest[0]+" Second Largest = "+largest[1]);
        System.out.println("Smallest = "+smallest[0]+" Second Smallest = "+smallest[1]);


        System.out.println("Sum of Digits = "+NumberCheckerMath.sumDigits(digits));
        System.out.println("Sum of Squares = "+NumberCheckerMath.sumSquares(digits));


        System.out.println("Harshad Number = "+
                NumberCheckerMath.isHarshad(number,digits));


        int[][] freq=NumberCheckerMath.frequency(digits);
        System.out.println("Digit Frequencies:");
        for(int i=0;i<10;i++)
            if(freq[i][1]>0)
                System.out.println(freq[i][0]+" -> "+freq[i][1]);


        int[] rev=NumberCheckerArrayOps.reverse(digits);
        System.out.print("Reversed Digits: ");
        for(int d:rev)
            System.out.print(d+" ");
        System.out.println();

        System.out.println("Palindrome Number = "+
                NumberCheckerArrayOps.isPalindrome(digits));


        System.out.println("Prime Number = "+NumberCheckerSpecial.isPrime(number));
        System.out.println("Neon Number = "+NumberCheckerSpecial.isNeon(number));
        System.out.println("Spy Number = "+NumberCheckerSpecial.isSpy(digits));
        System.out.println("Automorphic Number = "+
                NumberCheckerSpecial.isAutomorphic(number));
        System.out.println("Buzz Number = "+NumberCheckerSpecial.isBuzz(number));


        int[] factors=NumberCheckerFactors.factors(number);
        System.out.print("Factors: ");
        for(int f:factors)
            System.out.print(f+" ");
        System.out.println();

        System.out.println("Greatest Factor (excluding itself) = "+
                NumberCheckerFactors.greatestFactor(factors));
        System.out.println("Sum of Factors = "+
                NumberCheckerFactors.sum(factors));
        System.out.println("Product of Factors = "+
                NumberCheckerFactors.product(factors));
        System.out.println("Product of Cube of Factors = "+
                NumberCheckerFactors.cubeProduct(factors));

        System.out.println("Perfect Number = "+
                NumberCheckerFactors.isPerfect(number));
        System.out.println("Abundant Number = "+
                NumberCheckerFactors.isAbundant(number));
        System.out.println("Deficient Number = "+
                NumberCheckerFactors.isDeficient(number));
        System.out.println("Strong Number = "+
                NumberCheckerFactors.isStrong(number));
    }
}
