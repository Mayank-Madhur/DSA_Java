package Lec38;
import java.util.*;
public class Is_Graph_Bipartite {

	class Solution {
		
	    public boolean isBipartite(int[][] graph) {
	        return BFT(graph);
	    }
	    public boolean BFT(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int src = 0; src < graph.length; src++) {
				if (visited.containsKey(src)) {
					continue;
				}
				q.add(new BipartitePair(src, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair r = q.poll();
					// 2. Ignore if Already visited
					if (visited.containsKey(r.vtx)) {
						if(visited.get(r.vtx)!=r.dis) {
							return false;
						}
						continue;
					}
					// 3. visited marked
					visited.put(r.vtx, r.dis);
					// 4. self work
					// 5. add unvisited nbrs
					for (int nbrs : graph[r.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, r.dis+1));
						}
					}
				}
			}
			return true;
		} 
	}
	class BipartitePair{
		int vtx;
		int dis;
		
		public BipartitePair(int vtx, int dis) {
			this.dis=dis;
			this.vtx=vtx;
		}
	}
}
