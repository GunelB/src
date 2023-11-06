package Day36_InterviewPracticeNumbers;

public class Topic6_HA_BestTimeToBuyStock {
    public static void main(String[] args) {
        // prices {7,1,5,3,6,4}

        // print maximum profit
        // buy it when it is in the lowest price
        // sell it when it is in the highest price

        /*
        Day 1 Selling Price = 7
        Day 2 Selling Price = 1
        Day 3 Selling Price = 5
        Day 4 Selling Price = 3
        Day 5 Selling Price = 6
        Day 6 Selling Price = 4

        imagine you bought it when it was 1
        if we sell it when it is 5, the profit will be = 4;
        if we sell it when it is 3, the profit will be = 2;
        if we sell it when it is 6, the profit will be = 5;   <-- Max Profit
        if we sell it when it is 4, the profit will be = 3;

        You can not buy and sell same day
         */

        int[] data = {7,1,5,3,6,4};

        //find the lowest value to buy

        int BuyingPrice = data[0];
        int Profit = 0;
        int SellingPrice = 0;
        for (int i = 1; i < data.length; i++) {
            // if we find the lowest value to buy, assign buying price to it
            if (BuyingPrice > data[i]){
                BuyingPrice = data[i];
            } else {
                // selling it
                // I need to find what profit I will make if I sell it here
                // Selling price = 5
                int NewProfit = data[i] - BuyingPrice;  // NewProfit = 4

                if (NewProfit > Profit){
                    Profit = NewProfit;
                    SellingPrice = data[i];
                }
            }
        }

        System.out.println("Buying Price = "+BuyingPrice);
        System.out.println("Selling Price = "+SellingPrice);
        System.out.println("Profit = "+Profit);

    }
}
