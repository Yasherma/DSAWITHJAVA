import java.util.*;
class linear{
    public static void main(String [] args){
        int[] num={29,45,67,566,887,456,900};
        int find=566;
        int ans=lineraSearch(num,find);
        System.out.println(ans);
    }


       static int lineraSearch(int[] arr,int find){
            if(arr.length==0){
                return -1;
            }
            for(int element:arr){
                if(element==find){
                    return element;
                }

            }
            // for(int index=0;index<=arr.length;index++){
            //     int element=arr[index];
            return -1;
            
        }
   
    }
