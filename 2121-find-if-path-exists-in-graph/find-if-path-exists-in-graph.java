class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited= new boolean[n];

        return dfs(source,graph,destination,visited);
    }
    public boolean dfs(int n,List<List<Integer>> graph,int destination,boolean[] visited){
        if(destination==n){
            return true;
        }
        visited[n]=true;
        for(int neigh: graph.get(n)){
            if(!visited[neigh]){
                if(dfs(neigh,graph,destination,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}