class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k){
        ArrayList <Integer> rs = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0 ; i< arr.length; i++){
            pq.add(arr[i]);
            if( pq.size() > k){
               rs.add(pq.remove());
            }
        }
        while ( pq.size() > 0 )
            rs.add(pq.remove());
        return rs;
    }
}
