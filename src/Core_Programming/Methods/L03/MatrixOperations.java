package Core_Programming.Methods.L03;

public class MatrixOperations{

    public static int[][] randomMatrix(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=(int)(Math.random()*10);
        return m;
    }

    public static int[][] add(int[][] a,int[][] b){
        int[][] r=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                r[i][j]=a[i][j]+b[i][j];
        return r;
    }

    public static int[][] subtract(int[][] a,int[][] b){
        int[][] r=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                r[i][j]=a[i][j]-b[i][j];
        return r;
    }

    public static int[][] multiply(int[][] a,int[][] b){
        int[][] r=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b[0].length;j++)
                for(int k=0;k<b.length;k++)
                    r[i][j]+=a[i][k]*b[k][j];
        return r;
    }

    public static int[][] transpose(int[][] m){
        int[][] t=new int[m[0].length][m.length];
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[0].length;j++)
                t[j][i]=m[i][j];
        return t;
    }

    public static void display(int[][] m){
        for(int[] r:m){
            for(int x:r) System.out.print(x+" ");
            System.out.println();
        }
    }
}
