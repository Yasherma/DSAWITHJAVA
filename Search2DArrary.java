import java.util.Arrays;

public class Search2DArrary {
    public static void main(String[] args) {
        
        
        int[][] arr = {
            {1, 2, 4, 56},
            {33, 45, 776, 34},
            {55, 676, 346, 7864},
            {78, 99, 90, 23}
        };

        int max = search(arr);
        System.out.println("Maximum value: " + max);
    }

    
    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE; 

       
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num; 
                }
            }
        }

        return max; 
    }
}
