class Solution {
    public double angleClock(int hour, int minutes) {
        double angle=30*hour-(double)((5.5)*minutes);
        if(angle<0)angle*=-1;
        angle=Math.min(angle, 360-angle);
        return angle;
    }
}