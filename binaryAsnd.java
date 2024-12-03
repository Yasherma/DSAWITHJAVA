import java.util.*;
class binaryAsnd{
    public static void main(String[]args){
        // int []arr={2,3,4,5,6,78,89,90,500};
        int []arr={500,400,78,4,3,2};
        int target=500;
        System.out.print(CheckBinary(arr,target));
    }
        static int CheckBinary(int [] arr,int target){
            int start=0;
            int end=arr.length-1;
            boolean isAce=arr[start]<arr[end];
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                
                }
                if(isAce){
                    if(target<arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }

                    else{
                        if(target>arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
               
    }
    return -1;
            }

        }

            

            
