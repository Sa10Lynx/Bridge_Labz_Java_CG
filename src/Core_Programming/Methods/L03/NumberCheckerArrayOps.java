package Core_Programming.Methods.L03;

public class NumberCheckerArrayOps{
    public static int[] reverse(int[] d){
        int[] r=new int[d.length];
        for(int i=0;i<d.length;i++)
            r[i]=d[d.length-1-i];
        return r;
    }
    public static boolean areEqual(int[] a,int[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(int[] d){
        return areEqual(d,reverse(d));
    }
}

