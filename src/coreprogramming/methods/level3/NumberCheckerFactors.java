package coreprogramming.methods.level3;

public class NumberCheckerFactors{
    public static int[] factors(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0) c++;
        int[] f=new int[c];
        int j=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[j++]=i;
        return f;
    }
    public static int greatestFactor(int[] f){
        return f[f.length-2];
    }
    public static int sum(int[] f){
        int s=0;
        for(int x:f) s+=x;
        return s;
    }
    public static long product(int[] f){
        long p=1;
        for(int x:f) p*=x;
        return p;
    }
    public static double cubeProduct(int[] f){
        double p=1;
        for(int x:f) p*=Math.pow(x,3);
        return p;
    }
    public static boolean isPerfect(int n){
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0) s+=i;
        return s==n;
    }
    public static boolean isAbundant(int n){
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0) s+=i;
        return s>n;
    }
    public static boolean isDeficient(int n){
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0) s+=i;
        return s<n;
    }
    public static boolean isStrong(int n){
        int t=n,sum=0;
        while(t!=0){
            int d=t%10,f=1;
            for(int i=1;i<=d;i++) f*=i;
            sum+=f;
            t/=10;
        }
        return sum==n;
    }
}
