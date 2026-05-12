package Lec39;

import java.util.*;

import Lec39.Prims_Algorithm.PrimsPair;

public class Dijkstra_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	class DijkstraPair {
		int vtx;
		String acqpath;
		int cost;
		
		public DijkstraPair(int vtx, String acqpath, int cost) {
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return vtx + " " + acqpath + " @ " + cost;
		}
	}
	public void Dijkstra(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while(!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();
			// 2. Ignore if Already visited
			if(visited.contains(rp.vtx)) {
				continue;
			}
			// 3. visited marked
			visited.add(rp.vtx);
			// 4. self work
			System.out.println(rp);
			// 5. add unvisited nbsr
			for(int nbrs : map.get(rp.vtx).keySet()) {
			if(!visited.contains(nbrs)) {
				int cost = map.get(rp.vtx).get(nbrs);
				pq.add(new DijkstraPair(nbrs, rp.acqpath+nbrs, rp.cost+cost));
				}
			}
		}
	}
	public static void main(String[] args) {
		Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
		dj.AddEdge(1, 2, 2);
		dj.AddEdge(2, 3, 3);
		dj.AddEdge(1, 4, 10);
		dj.AddEdge(4, 5, 8);
		dj.AddEdge(3, 4, 1);
		dj.AddEdge(5, 6, 5);
		dj.AddEdge(5, 7, 6);
		dj.AddEdge(6, 7, 4);
		dj.Dijkstra(1);
	}
}