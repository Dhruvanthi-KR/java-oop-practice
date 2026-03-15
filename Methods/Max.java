class Max{
    public static void main(String[] args){
        int a = 3, b = 5, c = 1;
        int max = (a > b) ? ((a > c) ? a : c): ((b > c) ? b : c);
        System.out.println("Max numb: " + max);
    }
}