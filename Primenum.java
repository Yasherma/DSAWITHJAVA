 class Prime {
    public static void main(String[] args) {
        int num = 9;
        boolean prime = Primnum(num); 
        System.out.println(prime); 
    }

    
    static boolean Primnum(int num) {
        if (num <= 1) {
            return false; 
        }
        if (num == 2) {
            return true;         }

       
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}
