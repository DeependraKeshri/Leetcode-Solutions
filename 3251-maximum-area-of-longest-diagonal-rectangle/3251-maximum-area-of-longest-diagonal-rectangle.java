class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int area = 0;

        for (int i = 0; i < dimensions.length; i++) {
            double s = Math.sqrt((dimensions[i][0] * dimensions[i][0]) + 
                                 (dimensions[i][1] * dimensions[i][1]));
            int a = dimensions[i][0] * dimensions[i][1];

            if (s > max || (s == max && a > area)) {
                max = s;
                area = a;
            }
        }
        return area;
    }
}
