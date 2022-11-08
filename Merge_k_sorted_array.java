class Solution
{
    public static class Pair implements Comparable<Pair>{
        int li ; // list index
        int di; // data index
        int val; //value
        Pair(int li, int di, int val){
            this.li = li;
            this.di = di;
            this.val = val;
        }
        public int compareTo(Pair o){
            return this.val - o.val;
        }
    }
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> rv = new ArrayList<>();
       PriorityQueue<Pair> pq = new PriorityQueue<>();
       for(int i =0 ; i< arr.length ; i++){
           Pair p = new Pair( i,0 ,arr[i][0]);
           pq.add(p);
       }
       while(pq.size() > 0){
           Pair p = pq.remove();
           rv.add(p.val);
           p.di++;
       
          if( p.di < arr[p.li].length ){
             p.val = arr[p.li][p.di];
             pq.add(p);
          }
       }
       return rv;
    }
}
