import java.util.HashMap;
import java.util.Map;

public class CoinChange {
    public static void main(String[] args) {
        // coin problem
        // given list of coin with value [1,4,5]
        // find how many minimum total coin needed with the sum is 13
        int[] coins = {2,3,5};
        int sumValue = 7;
        Map<Integer, Integer> memoization = new HashMap<>();
        System.out.println("the answer is "+findMinimumCoin(coins, sumValue, memoization));
        System.out.println(memoization.toString());

    }

    // top down
    public static int findMinimumCoin(int[] coins, int sumValue, Map<Integer, Integer> memoization) {
        int minimumCoin = Integer.MAX_VALUE-1;
        if (sumValue == 0) {
            return 0;
        }

        int subProblem = 0;
        for (int coin: coins) {
            subProblem = sumValue - coin;
            if (subProblem < 0) {
                continue;
            }
            if (memoization.containsKey(sumValue)) {
                minimumCoin = memoization.get(sumValue);
            } else {
                minimumCoin = Math.min(minimumCoin, findMinimumCoin(coins, subProblem, memoization)+1);
            }
        }
        memoization.putIfAbsent(sumValue, minimumCoin);

        return minimumCoin;
    }


}