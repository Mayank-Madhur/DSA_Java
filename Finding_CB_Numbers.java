package Lec14;
import java.util.*;
public class Finding_CB_Numbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     
        String s = sc.next();     

        SubString(s);
    }

    public static void SubString(String s) {
        int count = 0;
        boolean[] visited = new boolean[s.length()];

        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                long num = Long.parseLong(s.substring(i, j));

                if (isCbnumber(num) && isvisited(visited, i, j - 1)) {
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }
            }
        }

        System.out.println(count);
    }

    public static boolean isvisited(boolean[] visited, int si, int ei) {
        while (si <= ei) {
            if (visited[si]) {
                return false;
            }
            si++;
        }
        return true;
    }

    public static boolean isCbnumber(long num) {
        if (num == 0 || num == 1) {
            return false;
        }

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        for (int p : primes) {
            if (num == p) {
                return true;
            }
        }

        for (int p : primes) {
            if (num % p == 0) {
                return false;
            }
        }

        return true;
    }
}