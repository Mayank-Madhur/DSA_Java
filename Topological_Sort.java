package Lec40;
import java.util.*;

public class Topological_Sort {
	
	private HashMap<Integer, List<Integer>> map;

	public Topological_Sort(int v) {
		map = new HashMap<>();
		for (int i = 0; i < v; i++) {
			map.put(i, new ArrayList<>());

		}
	}
	public void Addedge(int v1, int v2) {
		map.get(v1).add(v2);
	}
	
	public int[] Indegree() {
		int [] in = new int [map.size()];
		for(int vtx1 : map.keySet()) {
			for(int vtx2 : map.get(vtx1)) {
				in[vtx2]++;
			}
		}
		return in;
	}
	public void Topological() {
		int [] in = Indegree();
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < in.length; i++) {
			if(in[i] == 0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int r = q.poll();
			System.out.print(r+" ");
			for(int nbrs : map.get(r)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
		System.out.println();
	}
	public boolean Iscycle() {
		int [] in = Indegree();
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < in.length; i++) {
			if(in[i] == 0) {
				q.add(i);
			}
		}
		int c = 0;
		while(!q.isEmpty()) {
			int r = q.poll();
			c++;
			for(int nbrs : map.get(r)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
		return c!= map.size();// cycle hai
	}
	public static void main(String[] args) {
		Topological_Sort ts = new Topological_Sort(8);
		ts.Addedge(1, 2);
		ts.Addedge(1, 0);
		ts.Addedge(1, 4);
		ts.Addedge(4, 3);
		ts.Addedge(3, 2);
		ts.Addedge(4, 5);
		ts.Addedge(5, 7);
		ts.Addedge(6, 3);
		ts.Addedge(6, 7);
		ts.Topological();
	}
}
