class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            if(!freq.containsKey(num)){
                freq.put(num,1);
            }
            else{
            freq.put(num,freq.get(num)+1);
        }}
        List<Integer>[] bucket=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            int num=entry.getKey();
            int count=entry.getValue();
            if(bucket[count]==null){
                bucket[count]=new ArrayList();
            }
            bucket[count].add(num);
        }
        int[] result=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    result[index]=num;
                    index++;
                    if(index==k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}