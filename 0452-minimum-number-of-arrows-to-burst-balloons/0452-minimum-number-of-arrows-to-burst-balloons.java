class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->a[1]-b[1]);
        int count=1;
        int prev_end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(prev_end<points[i][0] || prev_end>points[i][1] ){
                prev_end=points[i][1];
                count++;
            }
        }
        return count;
    }
}