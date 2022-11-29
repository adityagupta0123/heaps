class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> (a.getValue() == b.getValue())? a.getKey() - b.getKey(): a.getValue() - b.getValue());
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1) count++;
            }
            map.put(i,count);
        }
        pq.addAll(map.entrySet());
        int i = 0;
        int[] result = new int[k];
        while(k-- > 0){
            Map.Entry<Integer,Integer> entry = pq.poll();
            result[i++] = entry.getKey();
        }
        return result;
    }
}
