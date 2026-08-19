class retailStoreManager {
    public static void main(String[] args) {
        
        double unitPrice = 19.9;
        int quantity = 4;
        boolean isPremium = true;
        char coupon = 'C';
        double discountRate = 0.0;
        
        //calculated total amount and discussed per unit price and quantity
        System.out.println("Per Unit Price: $" + unitPrice);
        System.out.println("Total Quantity :" + quantity);
        double totalAmount = unitPrice * quantity;
        System.out.println("Total Amount: $" + totalAmount);
        
        
        //now we will apply discount using switch cases
        switch(coupon){
            case 'A':
                discountRate = 0.10;
                break;
            case 'B':
                discountRate = 0.15;
                break;
            case 'C':
                discountRate = 0.2;
                break;
            case 'D':
                discountRate = 0.25;
                break;
        }
        System.out.println("Discounted Amount: $" + discountRate);
        
        
        double afterDiscountTotal = totalAmount - (totalAmount * discountRate);
        
        //now we will check if the customer is premium and the bill is above the $100 then we will provide the extra $10 discount
        
        if(afterDiscountTotal>100.0 && isPremium){
            afterDiscountTotal -= 10;
        }
        
        System.out.println("Total Amount After Discount: $" + afterDiscountTotal);
        
        //now we will check if the shipping fees going to apply or not?
        
        double shippingFee = (afterDiscountTotal>150.0 || isPremium)?0.00:12.50;
        System.out.println("Shipping Fees: $" + shippingFee);
        
        //now we will calculate total amount after shipping fees
        double finalTotal = afterDiscountTotal + shippingFee;
        
        //roundoff total bill using type casting
        int roundedTotal = (int)finalTotal;
        System.out.println("Final roundOff total bill: $" + roundedTotal);
        
    }
}
