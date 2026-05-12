package Lec34;

import java.util.Arrays;

public class Meeting_Rooms_II {
	public static void main(String[] args) {
		int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 2, 6 }, { 3, 5 } };
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		for (int i = 0; i < intervals.length; i++) {
			for (int j = 0; j < intervals[0].length; j++) {
				System.out.print(intervals[i][j] + " ");
			}
			System.out.println();
		}
	}
}