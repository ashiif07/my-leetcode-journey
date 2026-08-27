class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashSet<Integer> set = new HashSet<>();

        int n1 = grid.length;
          int n = n1 * n1;
        int currSum = 0;
        int ans[] = new int[2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                if (set.contains(grid[i][j])) {
                    ans[0] = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                    currSum += grid[i][j];
                }
            } 
        }
         int totalSum = n * (n + 1) / 2;
            ans[1] = totalSum - currSum;
            return ans;

    }
}