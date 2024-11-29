import java.util.*;
public class perctes {
    public static void main(String [] args){
        int[] arr={2,3,4,56,77,567,89,90};
        int target=77;
        int ans=search(arr,target);
        System.out.print(ans);
    }
        static int search(int[] arr,int target){
            if(arr.length==0){
                return -1;
            }
            for(int i=0;i<=arr.length;i++){
                int element=arr[i];
                if(element==target){
                    return i;
                }
            }
            return -1;
        }
    }