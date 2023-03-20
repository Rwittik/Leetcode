//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            ArrayList<ArrayList<Character>> grid = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ArrayList<Character> col = new ArrayList<>();
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    col.add(S1[j].charAt(0));
                }
                grid.add(col);
            }

            Solution ob = new Solution();
            System.out.println(ob.shortestXYDist(grid, N, M));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        // code here
                // Initialize the minimum distance to maximum possible value
        int minDist = Integer.MAX_VALUE;
        
        // Traverse through the grid to find X and Y
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid.get(i).get(j) == 'X') {
                    // If current cell is X, then find the distance to nearest Y
                    int dist = findNearestY(grid, i, j, N, M);
                    if (dist < minDist) {
                        // Update minimum distance if a shorter distance is found
                        minDist = dist;
                    }
                }
            }
        }
        
        return minDist;
    }
    
    // Helper function to find the Manhattan distance to nearest Y
    static int findNearestY(ArrayList<ArrayList<Character>> grid, int x, int y, int N, int M) {
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid.get(i).get(j) == 'Y') {
                    // Calculate Manhattan distance from current X to current Y
                    int dist = Math.abs(x - i) + Math.abs(y - j);
                    if (dist < minDist) {
                        // Update minimum distance if a shorter distance is found
                        minDist = dist;
                    }
                }
            }
        }
        return minDist;
    
    }
};