class binnary{
    public static void main(String []args){
        int[] arr={2,3,4,5,6,7,8,9,34};
        int target=5;
        System.out.println(SearchBinary(arr,target));
    }
    static int SearchBinary(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;               
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
































// class BinaryQuestion {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 5, 6, 7};
//         int target = 5;
        
//         // Calling the IndexSearch method and printing the result
//         System.out.println(IndexSearch(arr, target));
//     }

//     static int IndexSearch(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;
        
//         while (start <= end) {  // Correct the condition to handle all elements
//             int mid = start + (end - start) / 2;
            
//             // Check if the target is the mid element
//             if (arr[mid] == target) {
//                 return mid;  // Return the index of the target
//             }
            
//             // If target is less than mid, search in the left half
//             if (arr[mid] > target) {
//                 end = mid - 1;
//             }
//             // If target is greater than mid, search in the right half
//             else {
//                 start = mid + 1;
//             }
//         }
        
//         // Return -1 if the target is not found
//         return -1;
//     }
// }
