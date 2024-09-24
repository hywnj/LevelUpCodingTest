

class Solution {
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    result[i] = j - i;
                    break;
                }
            }

            if (result[i] == 0) {
                result[i] = prices.length - 1 - i;
            }
        }

        return result;
    }
}