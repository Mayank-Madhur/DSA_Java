package Lec10;
import java.util.*;
public class Aggresive_Cow {//spoj aggresive cows

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int[] stall = new int[nos];
		for(int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(LargestMiniDis(stall, noc));
	}
	public static int LargestMiniDis(int[] stall, int noc) {
		int lo = 1;
		int hi = stall[stall.length - 1] - stall[0];// 9-1=8
		int ans = 0;
		while(lo<=hi) {
			int mid = (lo + hi)/2;
			if (isitpossible(stall, noc, mid) == true) {
				ans = mid;
				lo = mid + 1;
			}
			else {
				hi = mid - 1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] stall, int noc, int mid) {//noc=3,mid=3
		int pos = stall[0];
		int cow = 1;
		for(int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if (cow == noc) {
				return true;
			}
		}
		return false;
		
	}

}
