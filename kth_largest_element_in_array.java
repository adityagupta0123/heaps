class Solution {
    public int findKthLargest(int[] nums, int k) {
    //   PriorityQueue <Integer> pq = new PriorityQueue<>();
    //   for(int i =0; i< nums.length; i++){
    //       if( i < k)
    //          pq.add(nums[i]);
    //       else{
    //          if( nums[i] > pq.peek()){
    //              pq.remove();
    //              pq.add(nums[i]);
    //          }
    //       }
    //   }  
    //   return pq.peek();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : nums) {
            pq.add(x);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
        
        // Arrays.sort(nums);
        // return nums[nums.length - k];
    }
    
}
