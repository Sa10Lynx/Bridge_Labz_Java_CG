package coreprogramming.methods.level3;

public class ZaraBonusCalculator{

    public static double[][] generateData(){
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=10000+(Math.random()*90000);
            data[i][1]=(int)(Math.random()*10)+1;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data){
        double[][] result=new double[10][2];
        for(int i=0;i<10;i++){
            double salary=data[i][0];
            double years=data[i][1];
            double bonus=(years>5)?salary*0.05:salary*0.02;
            result[i][0]=salary+bonus;
            result[i][1]=bonus;
        }
        return result;
    }

    public static void display(double[][] oldData,double[][] newData){
        double totalOld=0,totalNew=0,totalBonus=0;
        System.out.println("Salary\tYears\tBonus\tNewSalary");
        for(int i=0;i<10;i++){
            totalOld+=oldData[i][0];
            totalNew+=newData[i][0];
            totalBonus+=newData[i][1];
            System.out.println(oldData[i][0]+"\t"+oldData[i][1]+"\t"+newData[i][1]+"\t"+newData[i][0]);
        }
        System.out.println("Total Bonus = "+totalBonus);
        System.out.println("Old Salary Sum = "+totalOld);
        System.out.println("New Salary Sum = "+totalNew);
    }

    public static void main(String[] args){
        double[][] oldData=generateData();
        double[][] newData=calculateBonus(oldData);
        display(oldData,newData);
    }
}
