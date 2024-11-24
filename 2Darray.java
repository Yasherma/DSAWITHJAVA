import java.util.*;

class Array2D {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][] arr=new int[3][3];
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        
for(int[] a:arr){
    System.out.println(Arrays.toString(a));
}

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        
 
        // }

// for(int i=0;i<arr.length;i++)
//         {
//              for (int j=0;j<arr[i].length;j++)
//              {
//                System.out.print(arr[i][j]+" ");
//             }
         
//         System.out.println();
//         }
    
        // 2D array declaration
        // int[][] array2D = {
        //     {1, 2, 3},
        //     {4, 5},
        //     {6, 7, 8, 9}
        // };

          // Printing the second row (index 1) of the 2D array
        // System.out.println(Arrays.toString(array2D[0])); // prints [4, 5]
}
}