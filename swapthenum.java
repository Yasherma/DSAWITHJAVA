public class swapthenum {
    public static void main(String [] args){
        int a=60;
        int b=78;
        swap(a,b);
        
     }
     static void  swap(int n1,int n2)
     {
        int temp=n1; 
        n1=n2;
        n2=temp;
        System.out.print(n1+"  "+n2);
       
     }
    
}
