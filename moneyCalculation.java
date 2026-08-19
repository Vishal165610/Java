class MoneyCalculation { 
    public static void main(String args[]){
        
        double principalAmount = 671000.0;
        double annualRate = 9.90;
        int totalMonths = 46;
        float totalYears = totalMonths/12.0f;
        double interestEarned = (principalAmount * annualRate * totalYears)/100;
        double totalAmount = principalAmount + interestEarned;
        
        // interest Earned = (principal * Annual Interest Rate * Total Years ) /100
        
        System.out.println("---- Money Calculation Program ----");
        System.out.println("Principal Amount: $" + principalAmount);
        System.out.printf("Interest Earned: $ %.2f\n" , interestEarned);
        System.out.printf("Total no. of years :%.1f\n " , totalYears);
        System.out.println("-----------------------------------");
        System.out.printf("Total Amount: $%.2f\n " , totalAmount);
        
        
    }
}
