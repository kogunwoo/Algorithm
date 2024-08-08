import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
      Map<Integer, List<Integer>> graph = new HashMap<>(); 
        for(int i =1; i<=n; i++){
            graph.put(i, new ArrayList<>());
        }
        for(int[] e : edge){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        boolean[] visited = new boolean[n+1];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{1,0});
        visited[1] = true;
        
        int maxDist=0,  count =0;
        while(!queue.isEmpty()){
            int[] cur = queue.remove();
            
            if(maxDist < cur[1]){
                maxDist = cur[1];
                count = 1;
            }else if(maxDist == cur[1]){
                count++;
            }
            for(int next : graph.get(cur[0])){
                if(visited[next]) continue;
                    visited[next] =true;
                queue.add(new int[]{next, cur[1]+1});
            }
        }
        return count;
    }
}