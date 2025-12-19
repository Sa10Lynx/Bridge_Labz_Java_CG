package coreprogramming.methods.level3;

public class NumberCheckerDigits{
    public static int countDigits(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
    public static int[] getDigits(int n){
        int[] d=new int[countDigits(n)];
        int i=0;
        while(n!=0){
            d[i++]=n%10;
            n/=10;
        }
        return d;
    }
    public static boolean isDuck(int[] d){
        for(int x:d) if(x!=0) return true;
        return false;
    }
    public static boolean isArmstrong(int n,int[] d){
        int sum=0,p=d.length;
        for(int x:d) sum+=Math.pow(x,p);
        return sum==n;
    }
    public static int[] largestTwo(int[] d){
        int l=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
        for(int x:d){
            if(x>l){ s=l; l=x; }
            else if(x>s) s=x;
        }
        return new int[]{l,s};
    }
    public static int[] smallestTwo(int[] d){
        int s1=Integer.MAX_VALUE,s2=Integer.MAX_VALUE;
        for(int x:d){
            if(x<s1){ s2=s1; s1=x; }
            else if(x<s2) s2=x;
        }
        return new int[]{s1,s2};
    }
}

