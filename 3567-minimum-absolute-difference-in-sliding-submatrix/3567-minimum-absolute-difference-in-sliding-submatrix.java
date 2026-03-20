class Solution {
    public int helper(int grid[][], int i, int j, int k){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int r=i; r<i+k; r++){
            for(int c=j; c<j+k; c++){
                if(set.add(grid[r][c])){
                    list.add(grid[r][c]);
                }
            }
        }

        Collections.sort(list);
        if(list.size() == 1) return 0;
        int min = Integer.MAX_VALUE;
        for(int a=0; a<list.size()-1; a++){
            min = Math.min(min, list.get(a+1) - list.get(a));
        }
        return min;
    }

    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] ans = new int[m-k+1][n-k+1];

        for(int i=0; i<=m-k; i++){
            int y = 0;
            for(int j=0; j<=n-k; j++){
                ans[i][y++] = helper(grid, i, j, k);
            }
        }
        return ans;
    }
}