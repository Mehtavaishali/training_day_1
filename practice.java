
public class practice {
    public static void main(String[] args) {
        System.out.println("HElloworld");
        int a = 2;
        int b=1;
        int sum = (int)(a + b);
        System.out.println( sum);
        byte myByte = 1; // Declaration and initialization
        System.out.println("Byte value: " + myByte);
        if (a>b){
            System.out.println("greater than");
        }
        else{
            System.out.println("less than");
        }
        int c = 20;

        // Check if a is equal to b
        boolean isEqual = (a == b);  
        System.out.println("a == b: " + isEqual);

        // Check if a is equal to c
        isEqual = (a == c);  // false, because a and c have different values
        System.out.println("a == c: " + isEqual);
        int result = Math.floorDiv(a,b);
        System.out.println(result);
        int resu = a&b; 
        System.out.println("a & b: " + resu);
        int resu1 = a|b; 
        System.out.println("a | b: " + resu1);
        int resu2 = a^b; 
        System.out.println("a ^ b: " + resu2);
        int number = 2;
        
        String binaryString = Integer.toBinaryString(number);
        System.out.println(binaryString);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
            System.out.println("i = " + i + ", j = " + j);
            }
        }
        int[] numbers = {1, 2, 3, 4, 5};
        for (int numb : numbers) {
            System.out.println(numb);
        }
        int k=1;
        while(k<4)
           System.out.println("hello"+ k++); 
        int v = 1; // Initialize the counter
        do {
            System.out.println("hello"); // Print "hello"
            v++; // Increment the counter
        } while (v <= 3); 
        for (int x = 1; x <= 3; x++) { // Loop for each row
            for (int y = 1; y<=x; y++) { // Loop for each column in the current row
                System.out.print('*'); // Print a star without a newline
            }
            System.out.println(); // Move to the next line after printing all columns in the current row
        }
    }
}

