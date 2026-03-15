class Operators{
    public static void main(String[] args){
        int a = 10, b = 10;
        float c = 10.010101f, d = 10.01f;
        int add, sub, multi, div;
        add = a+b;
        sub = a-b;
        multi = a*b;
        div = a/b;
        // arithmetic operators
        System.out.println("Add : " + add);
        System.out.println("Sub : " + sub);
        System.out.println("Multiply : " + multi);
        System.out.println("Divide : " + div);
        // comparison operators
        int n1 = 5, n2 = 10;
        if(n1 >= n2){
            System.out.printf("n1 is greater than or equal to n2\n");
        }
        // logical operators
        boolean x = false, y = true;
        if(x && y){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if(x || y){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        // bitwise operators
        int p = 5, q = 3;
        System.out.println("Bitwise AND : " + (p & q));
        System.out.println("Bitwise OR : " + (p | q));
        System.out.println("Bitwise XOR : " + (p ^ q));
        System.out.println("Left Shift : " + (p << 1));
        System.out.println("Right Shift : " + (q >> 1));
        // ternary operator
        int t = 10, s = 20;
        int max = (t > s) ? t : s;
        System.out.println("Max : " + max);
        //tasks
        if(a == c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if(b == d){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}