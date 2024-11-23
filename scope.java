public class scope {
    public static void main(String[] args){
        int n=10;
        int n2=30;
        String name="Yash";

    
    
    {
    n=200;
    name="Kunal";
    System.out.println(n);
    System.out.println(name);
    int c=90;
    }
    System.out.println(n);
    System.out.println(name);
}
    
}
