import java.util.*;
 class binarySearch {
    public static void main(String[] args){
        int []arr={2,3,45,68,90,788};
        int target=788;
        // Arrays.sort(arr);
        int ans=search(arr,target);
        System.out.println(ans);
    }
                static int search(int [] arr,int target){
            int start=0;
            int end=arr.length-1;

            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start= mid+1;
                }
                else{
                     return mid;
                }
            }
            return -1;

        }
    }

    






























// import java.util.Arrays;
//  class BinarySearch {
//     public static void main(String[] args) {
//         int[] arr = {2,3,4,6,7,9,88,777,890};
//         int target = 9;
        
//         // Sort the array before performing binary search
//         Arrays.sort(arr);
        
//         int result = bSearch(arr, target);
//         System.out.println(result);
//     }

//     // Binary search function
//     static int bSearch(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2; // Calculate mid index
            
//             // Check if the target is at the mid position
//             if (target == arr[mid]) {
//                 return mid;
//             }
//             // If target is smaller, search in the left half
//             else if (target < arr[mid]) {
//                 end = mid - 1;
//             }
//             // If target is larger, search in the right half
//             else {
//                 start = mid + 1;
//             }
//         }

//         // Return -1 if the target is not found
//         return -1;
//     }
// }

