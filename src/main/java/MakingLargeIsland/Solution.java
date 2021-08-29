package MakingLargeIsland;


import java.util.ArrayList;
import java.util.List;

/*Input: grid = [[1,0],[0,1]]
        Output: 3
        Explanation: Change one 0 to 1 and connect two 1s, then we get an island with area = 3.*/

public class Solution {

    public final static int MAX_ISLAND_AREA = 4;
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,0},{0,1}};
        System.out.println(makingLargeIsland(grid));
    }

    private static int makingLargeIsland(int[][] grid){
        List<Integer> islands = new ArrayList<>();
        int currentIslandArea = 0;
        boolean isOneSwitshed = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1){
                    if(currentIslandArea <= MAX_ISLAND_AREA){
                        currentIslandArea += 1;
                    } else {
                        islands.add(currentIslandArea);
                        currentIslandArea = 1;
                    }
                } else if(grid[i][j] == 0){
                    if(!isOneSwitshed){
                        if(currentIslandArea <= MAX_ISLAND_AREA){
                            currentIslandArea += 1;
                        } else {
                            islands.add(currentIslandArea);
                            currentIslandArea = 1;
                        }
                        isOneSwitshed = true;
                    }
                }
            }
        }
        islands.add(currentIslandArea);
        return (int) islands.stream().mapToDouble(x -> x).sum();
    }


}