class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColors = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>();
        int[] result = new int[queries.length];
        int distinctColors = 0;

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0], color = queries[i][1];
            if (ballColors.containsKey(ball)) {
                int oldColor = ballColors.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    distinctColors--;
                }
            }

            ballColors.put(ball, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);

            if (colorCount.get(color) == 1) {
                distinctColors++;
            }

            result[i] = distinctColors;
        }

        return result;
    }
}