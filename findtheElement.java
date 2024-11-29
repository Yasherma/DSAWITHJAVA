import java.util.*;
public class findtheElement {
    public static void main(String[]args){
        int []arr={1,2,3,45,67,89,76,543,34567};
        int target=45; 
        System.out.println(search(arr,target,1,4));
       
    }
        static int search(int [] arr,int target,int start,int end){
            if(arr.length==0){
                return -1;
            }
            for(int i=start;i<=end;i++){
                
                if(arr[i]==target){
                    return i;
                }
            }
         
            return -1;
        
        }
         
    }