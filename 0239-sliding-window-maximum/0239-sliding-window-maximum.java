import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(new Pair(nums[i], i));
        }
        arr[0]=pq.peek().val;
        for(int i=k; i<n; i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(nums[i], i));
            arr[i-k+1]=pq.peek().val;
        }
        return arr;
    }
    public class Pair implements Comparable<Pair>{
        int val;
        int idx;
        public Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val-this.val;
        }
    }
}