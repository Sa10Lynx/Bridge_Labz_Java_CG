package Core_Programming.Programming_Elements.L01;

public class FeeDiscount {
    public static void main(String[] args){
        int fee=125000;
        int discountPercentage=10;
        double discountAmount=(double)fee/discountPercentage;
        double discountedFee=fee-discountAmount;

        System.out.println("The discount amount is INR "+discountAmount+
                "and the final discounted fee is INR "+discountedFee);
    }
}
