
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long cost = 0;
        for( int i =0 ; i< arr.length; i++){
            pq.add(arr[i]);
        }
        while ( pq.size() > 1){
            long min = pq.remove();
            long min2 = pq.remove();
              
            cost += (min + min2);
            pq.add(min + min2);
            
        }

        return cost;
    }
}
