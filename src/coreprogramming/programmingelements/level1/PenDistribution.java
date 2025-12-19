package coreprogramming.programmingelements.level1;

public class PenDistribution {
    public static void main(String[] args){
        int pens=14;
        int individualCount=14/3;
        int remainingPens=14%3;
        System.out.println("The Pen per Student is "+individualCount+
                " and the remaining pen not distributed is "+remainingPens);
    }
}
