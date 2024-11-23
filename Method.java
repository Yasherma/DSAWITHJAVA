import java.util.*;
class Method{
    public static void main(String [] args){
        sum();
    }
    static void sum(){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int num1=sc.nextInt();
        System.out.print("Enter the second");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.err.print("sum of the number"+sum);
    }
} 
