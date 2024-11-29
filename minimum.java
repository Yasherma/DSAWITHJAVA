import java.util.*;

class Minimum {
    public static void main(String[] args) {
        int[] arr = {3,-9, 4, 67, 8, 67, 456, 345};
        System.out.print(min(arr)); 
    }

    static int min(int[] arr) {
       
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1; 
        }

     
        int ans = arr[0];

       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i]; 
            }
        }
        return ans; 
    }
}
