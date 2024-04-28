public class Main {
    public static void main(String[] args) {
        // coin problem
        // given list of coin with value [1,4,5]
        // find how many minimum total coin needed with the sum is 13
        int[] coins = {1,4,5};
        int sumValue = 13;
        System.out.println("the answer is "+findMinimumCoin(coins, sumValue));

    }

    // top down
    public static int findMinimumCoin(int[] coins, int sumValue) {
        int minimumCoin = Integer.MAX_VALUE;
        if (sumValue == 0) {
            minimumCoin = 0;
        }

        for (int coin: coins) {
            int subProblem = sumValue - coin;
            if (subProblem < 0) {
                continue;
            }
            minimumCoin = Math.min(minimumCoin, findMinimumCoin(coins, subProblem)+1);
        }


        return minimumCoin;
    }


}