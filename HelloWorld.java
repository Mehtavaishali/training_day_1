class HelloWorld{
    public static void main(String[] args) {
        System.out.println("HElloworld");
        int a = 5;
        int b=3;
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
    }
}