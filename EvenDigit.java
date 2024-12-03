public class EvenDigit {
    
    public static void main(String[] args){
        int [] num={23,4566,77,8,567,45667};
        System.out.println(findnum(num));
    }
        static int findnum(int [] nums){
            int count=0;
            for(int num: nums){
                if(even(num)){
                     count++;
                }
            }
            return count;
        }
        static boolean even(int num){
            int digitEven=digit(num);
            return digitEven%2==0;
        }
        static int digit(int num){
            int count=0;
            while(num>0){
                count++;
                num=num/10;
            }
            return count;
        }
    }

      
    
      
       
// int[] nums = {23, 4, 67, 788, 8, 675,34,5654, 4565};
        
       
// System.out.print(digit(1));
// }

// static int findNum(int[] nums){
// int count=0;
// for(int num:nums){
//     if(even(num)){
//         count++;
//     }
// }
// return count;
// }



// static boolean even(int num){
// int numdigit=digit(num);
// return numdigit%2==0;

// } 


// // Function to count the digits of a number
// static int digit(int num){
// int count=0;
// while(num>0){
//     count++;
//     num=num/10;
// }
// return count;
// }

