package coreprogramming.methods.level3;

public class FootballTeamHeightAnalyzer{
    public static int sum(int[] h){
        int s=0;
        for(int x:h) s+=x;
        return s;
    }
    public static double mean(int[] h){
        return sum(h)/(double)h.length;
    }
    public static int shortest(int[] h){
        int m=h[0];
        for(int x:h) if(x<m) m=x;
        return m;
    }
    public static int tallest(int[] h){
        int m=h[0];
        for(int x:h) if(x>m) m=x;
        return m;
    }
    public static void main(String[] args){
        int[] heights=new int[11];

        for(int i=0;i<heights.length;i++)
            heights[i]=150+(int)(Math.random()*101);

        System.out.println("Mean = "+FootballTeamHeightAnalyzer.mean(heights));
        System.out.println("Shortest = "+FootballTeamHeightAnalyzer.shortest(heights));
        System.out.println("Tallest = "+FootballTeamHeightAnalyzer.tallest(heights));
    }
}

