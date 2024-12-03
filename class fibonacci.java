 class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        
        // Create an array to store Fibonacci numbers
        int[] fibArray = new int[n];
        
        // Fill the Fibonacci array
        for (int i = 0; i < n; i++) {
            fibArray[i] = fibo(i);  // Populate the Fibonacci array
        }

        // Print Fibonacci numbers and their corresponding indices
        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci number at index " + i + ": " + fibArray[i]);
        }

        // Find the index of the number 5
        int index = cout(fibArray, 5);
        System.out.println("Index of number 5 in Fibonacci sequence: " + index);
    }

    // Function to calculate Fibonacci number at index n
    static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    // Function to find the index of a specific Fibonacci number
    static int cout(int[] fibArray, int number) {
        for (int i = 0; i < fibArray.length; i++) {
            if (fibArray[i] == number) {
                return i;  // Return the index of the number
            }
        }
        return -1;  // Return -1 if the number is not found
    }
}
