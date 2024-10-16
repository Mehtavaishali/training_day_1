public class pattern {
    public static void main(String[] args) {
        // int n=5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(); // Move to the next line after printing each row
        // }
        int n = 3; // Number of lines in the pattern

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(" * ");
            } else {
                System.out.println("* *");
            }
        }
} 
}

