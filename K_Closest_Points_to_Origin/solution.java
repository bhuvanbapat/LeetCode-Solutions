class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
           int distanceA=a[0]*a[0]+a[1]*a[1];
           int distanceB=b[0]*b[0]+b[1]*b[1];
            return distanceB-distanceA;}
        );
        for(int[] point:points){
            pq.offer(point);
            
            if(pq.size()>k){
               pq.poll();
                

            }
        }
        int[][] ans=new int[k][];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}