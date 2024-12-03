// public class linera {
//     public static void main(String [] args){
//         int []arr={2,3,4,56,78,99,76};
//         int target=56;
//         System.out.println(searh(arr,target));
//     }
//         static int searh(int[]arr,int target){
//             if(arr.length==0){
//                 return -1;
//             }
//             for(int i=0;i<=arr.length;i++){
//                 int element=arr[i];
//                 if(element==target){
//                     return i;

//                 }
                
          
//             }return -1;
//         }
        
//     }
    
class Max {
    public static void main(String[] args) {
        int[] arr = {2, 3, 55, 67, 4, 1, 78};
        System.out.println(ChecKMax(arr));
    }

    // Method to find the maximum value in an array
    static int ChecKMax(int[] arr) {
        if (arr.length == 0) {
            return -1;  // Return -1 if the array is empty
        }

        int ans = arr[0];  // Initialize the maximum value to the first element

        // Loop through the array to find the maximum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];  // Update the maximum value if a larger element is found
            }
        }

        return ans;  // Return the maximum value found
    }
}
